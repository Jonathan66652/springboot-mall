package com.jonathanpao.springbootmall.service.impl;

import com.jonathanpao.springbootmall.dao.ProductDao;
import com.jonathanpao.springbootmall.dto.ProductRequest;
import com.jonathanpao.springbootmall.model.Product;
import com.jonathanpao.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }

    @Override
    public Integer createProduct(ProductRequest productRequest) {
        return productDao.createProduct(productRequest);
    }
}
