package com.example.shop_mvc_spring.services;

import com.example.shop_mvc_spring.dtos.ProductDto;
import com.example.shop_mvc_spring.models.Product;
import com.example.shop_mvc_spring.repositorys.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void createProduct(Product product) {

        productRepository.save(product);
    }

    @Override
    public void deleteById(Long id) {
        productRepository.deleteById(id);
    }

    @Override
    public List<ProductDto> getAll() {
        return productRepository.findAll().stream().map(this::toDto).collect(Collectors.toList());
    }
    @Override
    public Product findByName(String name) {
        return productRepository.findByName(name);

    }

    private ProductDto toDto(Product product) {
        return ProductDto.builder()
                .name(product.getName())
                .price(product.getPrice())
                .build();
    }
}
