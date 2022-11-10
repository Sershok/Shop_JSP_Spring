package com.example.shop_mvc_spring.controllers;

import com.example.shop_mvc_spring.converters.PersonConverter;
import com.example.shop_mvc_spring.converters.ProductConverter;
import com.example.shop_mvc_spring.dtos.PersonDto;
import com.example.shop_mvc_spring.dtos.ProductDto;
import com.example.shop_mvc_spring.models.Person;
import com.example.shop_mvc_spring.models.Product;
import com.example.shop_mvc_spring.services.PersonService;
import com.example.shop_mvc_spring.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService personService;
    @Autowired
    private ProductService productService;

    @GetMapping("/create")
    public String createPerson(Model model) {
        PersonDto personDto = new PersonDto();

        model.addAttribute("person", personDto);

        return "person";
    }

    @PostMapping("/create")
    public String submitPerson(@ModelAttribute("personDto") PersonDto personDto) {

        personService.createPerson(PersonConverter.getPerson(personDto));

        return "personSuccess";
    }


    @GetMapping("/cart")
    public String createCart(Model model) {

        PersonDto personDto = new PersonDto();
        model.addAttribute("person", personDto);

        return "cart";
    }

    @PostMapping("/cart")
    public String submitCart(@ModelAttribute("personDto") PersonDto personDto) {
        Person person = personService.findByFirstName(personDto.getFirstName());
        Product product = productService.findByName(personDto.getLastName());

        personService.addCart(product.getId(), person.getFirstName());
        return "cartSuccess";
    }

    @GetMapping("/delete")
    public String deleteById(Model model) {
        PersonDto personDto = new PersonDto();
        model.addAttribute("person", personDto);
        return "deletePerson";
    }

    @PostMapping("/delete")
    public String deleteById(@ModelAttribute("personDto") PersonDto personDto) {
        Long id = personService.findByFirstName(PersonConverter.getPerson(personDto).getFirstName()).getId();
        personService.DeleteById(id);
        return "index";
    }

}
