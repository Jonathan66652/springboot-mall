package com.jonathanpao.springbootmall.service;

import com.jonathanpao.springbootmall.dto.CreateOrderRequest;
import com.jonathanpao.springbootmall.dto.OrderQueryParams;
import com.jonathanpao.springbootmall.model.Order;

import java.util.List;

public interface OrderService {

    Integer countOrder(OrderQueryParams orderQueryParams);

    List<Order> getOrders(OrderQueryParams orderQueryParams);

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
