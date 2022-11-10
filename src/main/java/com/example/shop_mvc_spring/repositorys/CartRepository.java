package com.example.shop_mvc_spring.repositorys;

import com.example.shop_mvc_spring.models.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends JpaRepository<Cart,Long> {

}
