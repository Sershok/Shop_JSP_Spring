package com.example.shop_mvc_spring.controllers;

import com.example.shop_mvc_spring.converters.ProductConverter;
import com.example.shop_mvc_spring.dtos.ProductDto;
import com.example.shop_mvc_spring.models.Person;
import com.example.shop_mvc_spring.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/delete")
    public String deleteById(Model model) {
        ProductDto productDto = new ProductDto();
        model.addAttribute("product", productDto);
        return "deleteProduct";
    }

    @PostMapping("/delete")
    public String deleteById(@ModelAttribute("productDto") ProductDto productDto) {
        Long id = productService.findByName(ProductConverter.getProduct(productDto).getName()).getId();
        productService.deleteById(id);
        return "index";
    }

    @GetMapping("/productList")
    public String viewPersonList(Model model) {

        List<ProductDto> productDto = productService.getAll();

        model.addAttribute("product", productDto);

        return "productList";
    }

    @GetMapping("/create")
    public String createProduct(Model model) {
        ProductDto productDto = new ProductDto();

        model.addAttribute("product", productDto);

        return "product";
    }

    @PostMapping("/create")
    public String submitForm(@ModelAttribute("productDto") ProductDto productDto) {

        productService.createProduct(ProductConverter.getProduct(productDto));

        return "productSuccess";
    }


}
