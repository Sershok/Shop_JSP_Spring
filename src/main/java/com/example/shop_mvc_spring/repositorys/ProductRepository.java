package com.example.shop_mvc_spring.repositorys;

import com.example.shop_mvc_spring.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {

    Product findByName(String name);

}
