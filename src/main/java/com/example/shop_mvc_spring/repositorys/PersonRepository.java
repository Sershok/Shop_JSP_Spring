package com.example.shop_mvc_spring.repositorys;

import com.example.shop_mvc_spring.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person,Long> {

    Person findByFirstName(String name);


}
