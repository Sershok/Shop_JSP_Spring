package com.example.shop_mvc_spring.services;

import com.example.shop_mvc_spring.dtos.ShopDto;
import com.example.shop_mvc_spring.models.Shop;

import java.util.List;

public interface ShopService {


    List<ShopDto> getAll();

    Long createShop(Shop shop);

    void AddProduct(String name, List<Long> productID);

    void deleteById(Long id);

}
