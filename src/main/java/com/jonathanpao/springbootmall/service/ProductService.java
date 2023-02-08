package com.jonathanpao.springbootmall.service;

import com.jonathanpao.springbootmall.dto.ProductRequest;
import com.jonathanpao.springbootmall.model.Product;

public interface ProductService {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);
}
