package com.example.shop_mvc_spring.converters;

import com.example.shop_mvc_spring.dtos.ProductDto;
import com.example.shop_mvc_spring.models.Product;

public final class ProductConverter {

    public static Product getProduct(ProductDto productDto) {
        Product product = new Product();
        product.setName(productDto.getName());
        product.setPrice(productDto.getPrice());
        return product;
    }
}
