package com.jonathanpao.springbootmall.dao;

import com.jonathanpao.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);
}
