package com.jonathanpao.springbootmall.dao;

import com.jonathanpao.springbootmall.dto.UserRegisterRequest;
import com.jonathanpao.springbootmall.model.User;

public interface UserDao {

    User getUserById(Integer userId);

    User getUserByEmail(String email);

    Integer createUser(UserRegisterRequest userRegisterRequest);
}
