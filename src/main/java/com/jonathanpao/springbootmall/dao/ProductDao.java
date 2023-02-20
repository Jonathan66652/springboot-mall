package com.jonathanpao.springbootmall.dao;

import com.jonathanpao.springbootmall.dto.ProductQueryParams;
import com.jonathanpao.springbootmall.dto.ProductRequest;
import com.jonathanpao.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {

    Integer countProduct(ProductQueryParams productQueryParams);

    List<Product> getProducts(ProductQueryParams productQueryParams);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
