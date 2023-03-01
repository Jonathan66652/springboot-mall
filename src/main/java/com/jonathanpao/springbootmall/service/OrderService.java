package com.jonathanpao.springbootmall.service;

import com.jonathanpao.springbootmall.dto.CreateOrderRequest;

public interface OrderService {

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
