package com.example.shop_mvc_spring.controllers;

import com.example.shop_mvc_spring.dtos.CartDto;
import com.example.shop_mvc_spring.services.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/cart")
public class CartController {

    @Autowired
    private CartService cartService;

    @GetMapping("/cartList")
    public String viewPersonList(HttpServletRequest request) {

        List<CartDto> cartDto = cartService.getAll();
        request.setAttribute("cart", cartDto);

        return "cartList";
    }

    @DeleteMapping("/delete_{id}")
    public void deleteById(@PathVariable Long id) {
        cartService.deleteById(id);
    }
}
