package com.example.shop_mvc_spring.services;
import com.example.shop_mvc_spring.dtos.ProductDto;
import com.example.shop_mvc_spring.models.Product;

import java.util.List;

public interface ProductService {

    void createProduct(Product product);

    Product findByName(String name);
    void deleteById(Long id);

    List<ProductDto> getAll();



}
