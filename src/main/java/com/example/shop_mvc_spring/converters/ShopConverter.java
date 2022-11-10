package com.example.shop_mvc_spring.converters;

import com.example.shop_mvc_spring.dtos.ShopDto;
import com.example.shop_mvc_spring.models.Shop;

public final class ShopConverter {
    public static Shop getShop(ShopDto shopDto) {

        Shop shop = new Shop();
        shop.setName(shopDto.getName());
        return shop;
    }
}
