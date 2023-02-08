package com.jonathanpao.springbootmall.dao;

import com.jonathanpao.springbootmall.dto.ProductRequest;
import com.jonathanpao.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);
}
