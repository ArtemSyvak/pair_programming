package pack.service;

import pack.entity.Product;

import java.util.List;




public interface ProductService {

    void save(Product product);

    void save(String name);

    Product findOne(int id);

    List<Product> findAll();



}
