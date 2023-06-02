package com.zhanfu.springboot.demo.controller;

import com.zhanfu.springboot.demo.entity.User;
import com.zhanfu.springboot.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/")
    public String p(){
        System.out.println("running  ====   ");
        return "我启动了";
    }


    @GetMapping("/findall")
    List<User> findall(){
        System.out.println("findall");
        return userService.findAll();
    }

    @GetMapping("/findByid")
    User findByid(){

        int id =1;
        return   userService.findUserById(id);
    }



    @GetMapping("/addUser")
    boolean addUser(){
        User  user =new User();
        user.setId(100);
        user.setUsername("asin");
        user.setPassword("asin_password");
        return userService.addUser(user);
    }

    @GetMapping("/deleteUserById")
    boolean deleteUserById(){

        int id =1;
        return  userService.deleteUserById(id);
    };

    @GetMapping("/updateUser")
    boolean updateUser(){

        User  user =new User();
        user.setId(100);
        user.setUsername("root");
        user.setPassword("root_password");


        return  userService.updateUser(user);
    };

}
