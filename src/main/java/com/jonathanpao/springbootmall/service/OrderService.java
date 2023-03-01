package com.jonathanpao.springbootmall.service;

import com.jonathanpao.springbootmall.dto.CreateOrderRequest;
import com.jonathanpao.springbootmall.model.Order;

public interface OrderService {

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
