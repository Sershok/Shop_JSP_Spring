package com.example.shop_mvc_spring.repositorys;

import com.example.shop_mvc_spring.models.Shop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShopRepository extends JpaRepository<Shop,Long> {

    Shop findByName(String name);

}
