package ru.vixtor.hebernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.vixtor.hebernate.entity.Person;
import ru.vixtor.hebernate.entity.PersonIDClass;

import java.util.List;

@org.springframework.stereotype.Repository
public interface  Repository extends JpaRepository<Person, PersonIDClass> {

    List<Person> findByCityOfLiving(String city);

    List<Person> findByAgeLessThanOrderByAge(int age);

    List<Person> findByNameAndSurname(String name, String surname);

}
