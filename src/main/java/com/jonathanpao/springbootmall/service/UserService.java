package com.jonathanpao.springbootmall.service;

import com.jonathanpao.springbootmall.dto.UserLoginRequest;
import com.jonathanpao.springbootmall.dto.UserRegisterRequest;
import com.jonathanpao.springbootmall.model.User;

public interface UserService {

    User getUserById(Integer userId);

    Integer register(UserRegisterRequest userRegisterRequest);

    User login(UserLoginRequest userLoginRequest);
}
