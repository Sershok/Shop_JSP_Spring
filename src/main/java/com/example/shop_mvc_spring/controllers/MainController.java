package com.example.shop_mvc_spring.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MainController {

    @RequestMapping({"/", "/index"})
    public String index() {
        return "index";
    }

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/createShop")
    public String createShop() {
        return "addProduct";
    }

    @RequestMapping("/createCart")
    public String createCart() {
        return "addCart";
    }
}
