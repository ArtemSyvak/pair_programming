package pack.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pack.dao.GeneralDAO;
import pack.entity.Product;
import pack.service.ProductService;

import java.util.List;



@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    @Autowired
    private GeneralDAO<Product> productGeneralDAO;

    public GeneralDAO<Product> getProductGeneralDAO() {
        return productGeneralDAO;
    }


    public void setProductGeneralDAO(GeneralDAO<Product> productGeneralDAO) {
        this.productGeneralDAO = productGeneralDAO;
    }


    public void save(String productName) {
        productGeneralDAO.save(new Product(productName));
    }

    public Product findOne(int id) {
        return productGeneralDAO.findOne(id);
    }

    public List<Product> findAll() {
        return productGeneralDAO.findAll();
    }
}
