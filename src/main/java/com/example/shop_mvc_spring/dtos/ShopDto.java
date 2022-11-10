package com.example.shop_mvc_spring.dtos;

import com.example.shop_mvc_spring.models.Product;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ShopDto {
    private String name;
    private String productName;
    private List<Product> product;

}
