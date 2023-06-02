package com.zhanfu.springboot.demo.service.impl;

import com.zhanfu.springboot.demo.entity.User;
import com.zhanfu.springboot.demo.mapper.UserMapper;
import com.zhanfu.springboot.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl  implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> findAll() {
        List<User> all = userMapper.findAll();
        for (int i = 0 ; i < 10; i++) {
            System.out.println(all);
            System.out.println(i);
        }
        return userMapper.findAll();
    }

    @Override
    public User findUserById(int id) {
        return userMapper.findUserById(id);
    }

    @Override
    public boolean addUser(User user) {
        return userMapper.addUser(user);
    }

    @Override
    public boolean deleteUserById(int id) {
        return userMapper.deleteUserById(id);
    }

    @Override
    public boolean updateUser(User user) {
        return userMapper.updateUser(user);
    }


}
