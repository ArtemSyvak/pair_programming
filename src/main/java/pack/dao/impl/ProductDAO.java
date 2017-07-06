package pack.dao.impl;

import org.springframework.stereotype.Repository;
import pack.dao.GeneralDAO;
import pack.entity.Product;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;



@Repository
public class ProductDAO  implements GeneralDAO<Product>{


    @PersistenceContext
    private EntityManager manager;

    public void save(Product product) {
        manager.persist(product);

    }

    public Product findOne(int id) {
        return manager.find(Product.class, id);
    }

    public List<Product> findAll() {
        return manager.createQuery("select p from Product p", Product.class).getResultList();
    }
}
