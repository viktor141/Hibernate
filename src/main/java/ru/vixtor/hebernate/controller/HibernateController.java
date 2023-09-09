package ru.vixtor.hebernate.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.vixtor.hebernate.entity.Person;
import ru.vixtor.hebernate.repository.Repository;

import java.util.List;


@RestController
public class HibernateController {

    private final Repository repository;
    public HibernateController(Repository repository) {
        this.repository = repository;
    }

    @GetMapping("/persons/by-city")
    public List<Person> getlistPersonInCity(@RequestParam String city) {
        return repository.findByCityOfLiving(city);
    }

    @GetMapping("/persons/by-age")
    public List<Person> getlistPersonInCity(@RequestParam int age) {
        return repository.findByAgeLessThanOrderByAge(age);
    }

    @GetMapping("/persons/by-name-surname")
    public List<Person> getlistPersonInCity(@RequestParam String name, String surname) {
        return repository.findByNameAndSurname(name, surname);
    }

}
