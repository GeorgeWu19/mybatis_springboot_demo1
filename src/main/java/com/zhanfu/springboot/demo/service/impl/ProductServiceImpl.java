package com.zhanfu.springboot.demo.service.impl;

import com.zhanfu.springboot.demo.entity.Product;
import com.zhanfu.springboot.demo.mapper.ProductMapper;
import com.zhanfu.springboot.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductMapper productMapper;

    @Override
    public List<Product> findAll() {
        return productMapper.findAll();
    }

    @Override
    public Product findProductById(int id) {
        return productMapper.findProductById(id);
    }

    @Override
    public boolean addProduct(Product product) {
        return productMapper.addProduct(product);
    }

    @Override
    public boolean deleteProductById(int id) {
        return productMapper.deleteProductById(id);
    }

    @Override
    public boolean updateProduct(Product product) {
        return productMapper.updateProduct(product);
    }
}
