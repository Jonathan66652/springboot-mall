package com.jonathanpao.springbootmall.service.impl;

import com.jonathanpao.springbootmall.dao.UserDao;
import com.jonathanpao.springbootmall.dto.UserRegisterRequest;
import com.jonathanpao.springbootmall.model.User;
import com.jonathanpao.springbootmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        return userDao.createUser(userRegisterRequest);
    }
}
