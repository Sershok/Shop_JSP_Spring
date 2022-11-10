package com.example.shop_mvc_spring.converters;

import com.example.shop_mvc_spring.dtos.PersonDto;
import com.example.shop_mvc_spring.models.Person;

public final class PersonConverter {

    public static PersonDto getPersonDto(Person person) {
        PersonDto personDto = new PersonDto();
        personDto.setFirstName(person.getFirstName());
        personDto.setLastName(person.getLastName());
        personDto.setEmail(person.getEmail());
        return personDto;
    }

    public static Person getPerson(PersonDto personDto) {
        Person person = new Person();
        person.setFirstName(personDto.getFirstName());
        person.setLastName(personDto.getLastName());
        person.setEmail(personDto.getEmail());
        return person;
    }
}
