package com.zhanfu.springboot.demo.controller;

import com.zhanfu.springboot.demo.entity.Product;
import com.zhanfu.springboot.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @RequestMapping("/")
    public String p(){
        System.out.println("running  ====   ");
        return "我启动了";
    }


    @GetMapping("/findall")
    List<Product> findall(){
        System.out.println("findall");

        return   productService.findAll();
    }

    @GetMapping("/findByid")
    Product findByid(){
        int id =1;
        return  productService.findProductById(id);
    }

    @GetMapping("/add")
    boolean addProduct(){
        Product product =new Product();
        product.setId(100);
        product.setProductName("APPLE");
        product.setProductPrice(100d);
        return productService.addProduct(product);
    }

    @GetMapping("/deleteById")
    boolean deleteProductById(){
        int id =1;
        return  productService.deleteProductById(id);
    };

    @GetMapping("/update")
    boolean updateProduct(){
        Product  product =new Product();
        product.setId(100);
        product.setProductName("APPLE");
        product.setProductPrice(100d);
        return  productService.updateProduct(product);
    };
}
