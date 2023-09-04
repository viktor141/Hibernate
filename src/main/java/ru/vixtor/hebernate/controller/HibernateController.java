package ru.vixtor.hebernate.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.vixtor.hebernate.repository.HibernateRepository;


@RestController
public class HibernateController {

    private final HibernateRepository repository;
    public HibernateController(HibernateRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/persons/by-city")
    public ResponseEntity<?> getPersonsByCity(@RequestParam String city) {
        return new ResponseEntity<>(repository.getPersonsByCity(city), HttpStatus.OK);
    }

}
