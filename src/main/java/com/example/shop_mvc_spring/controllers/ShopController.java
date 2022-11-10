package com.example.shop_mvc_spring.controllers;

import com.example.shop_mvc_spring.converters.ShopConverter;
import com.example.shop_mvc_spring.dtos.ShopDto;
import com.example.shop_mvc_spring.models.Product;
import com.example.shop_mvc_spring.services.ProductService;
import com.example.shop_mvc_spring.services.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Collections;
import java.util.List;

@Controller
@RequestMapping("/shop")
public class ShopController {

    @Autowired
    private ShopService shopService;
    @Autowired
    private ProductService productService;

    @GetMapping("/add_product")
    public String addProductsShop(Model model) {
        ShopDto shopDto = new ShopDto();
        model.addAttribute("shop", shopDto);
        return "shop";
    }

    @GetMapping("/create")
    public String createPerson(Model model) {
       ShopDto shopDto = new ShopDto();

        model.addAttribute("shop", shopDto);

        return "shopCreate";
    }

    @PostMapping("/create")
    public String submitPerson(@ModelAttribute("shopDto") ShopDto shopDto) {

        shopService.createShop(ShopConverter.getShop(shopDto));

        return "shopAdd";
    }

    @PostMapping("/add_product")
    public String submitCart(@ModelAttribute("shopDto") ShopDto shopDto) {

        Product product = productService.findByName(shopDto.getProductName());
        shopService.AddProduct(shopDto.getName(), Collections.singletonList(product.getId()));
        return "shopSuccess";
    }

    @DeleteMapping("/delete_{id}")
    public void deleteById(@PathVariable Long id) {
        shopService.deleteById(id);
    }

    @GetMapping("/get")
    public String getProduct(HttpServletRequest request) {
        List<ShopDto> shopDto = shopService.getAll();
        request.setAttribute("shop", shopDto);

        return "shopList";
    }

}
