package com.zhanfu.springboot.demo.service;

import com.zhanfu.springboot.demo.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();

    Product findProductById(int id);

    boolean addProduct(Product product);

    boolean deleteProductById(int id);

    boolean updateProduct(Product product);
}
