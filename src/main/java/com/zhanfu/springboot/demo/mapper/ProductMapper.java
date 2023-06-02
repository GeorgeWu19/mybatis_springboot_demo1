package com.zhanfu.springboot.demo.mapper;

import com.zhanfu.springboot.demo.entity.Product;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductMapper {
    List<Product> findAll();

    Product findProductById(int id);

    boolean addProduct(Product product);

    boolean deleteProductById(int id);

    boolean updateProduct(Product product);
}
