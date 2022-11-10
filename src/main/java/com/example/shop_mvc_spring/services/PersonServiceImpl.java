package com.example.shop_mvc_spring.services;

import com.example.shop_mvc_spring.dtos.PersonDto;
import com.example.shop_mvc_spring.models.Cart;
import com.example.shop_mvc_spring.models.Person;
import com.example.shop_mvc_spring.repositorys.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static com.example.shop_mvc_spring.converters.PersonConverter.getPersonDto;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private CartService cartService;

    @Override
    public void createPerson(Person person) {
        personRepository.save(person);
    }

    @Override
    public Person findByFirstName(String name) {

        if (personRepository.findByFirstName(name) == null) {
            throw new RuntimeException();
        }
        return personRepository.findByFirstName(name);

    }

    @Override
    public void DeleteById(Long id) {
        personRepository.deleteById(id);
    }

    @Override
    public void save(Person person) {
        personRepository.save(person);
    }

    @Override
    public void addCart(Long productId, String name) {

        Person person = personRepository.findByFirstName(name);

        Cart cart = person.getCart();
        if (cart == null) {
            Cart newCart = cartService.createCart(person, Collections.singletonList(productId));
            person.setCart(newCart);
            save(person);
        } else {
            cartService.addProduct(cart, Collections.singletonList(productId));
        }
    }


    @Override
    public List<PersonDto> getAll() {
        return personRepository.findAll().stream().map(this::toDto).collect(Collectors.toList());

    }

    private PersonDto toDto(Person person) {
        return PersonDto.builder()
                .firstName(person.getFirstName())
                .lastName(person.getLastName())
                .email(person.getEmail())
                .build();
    }


}
