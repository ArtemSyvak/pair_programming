package pack.service;

import pack.entity.Product;

import java.util.List;




public interface ProductService  {


    void save(String productName);

    Product findOne(int id);

    List<Product> findAll();



}
