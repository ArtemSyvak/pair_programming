package pack.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pack.dao.ProductDAO;
import pack.entity.Product;
import pack.service.ProductService;

import java.util.List;



@Service
@Transactional
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductDAO productDAO;

    public void save(Product product) {
        productDAO.save(product);
    }

    public void save( String name) {
        productDAO.save(new Product(name));
    }

    public Product findOne(int id) {
        return productDAO.findOne(id);
    }

    public List<Product> findAll() {
        return productDAO.findAll();
    }
}
