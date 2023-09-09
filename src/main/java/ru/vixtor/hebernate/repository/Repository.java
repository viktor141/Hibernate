package ru.vixtor.hebernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.vixtor.hebernate.entity.Person;
import ru.vixtor.hebernate.entity.PersonIDClass;

import java.util.List;

@org.springframework.stereotype.Repository
public interface  Repository extends JpaRepository<Person, PersonIDClass> {

    @Query(value = "from Person where cityOfLiving =?1")
    List<Person> findByCityOfLiving(String city);

    @Query(value = "from Person where age <= ?1")
    List<Person> findByAgeLessThanOrderByAge(int age);

    @Query(value = "from Person where name = ?1 and surname = ?2")
    List<Person> findByNameAndSurname(String name, String surname);

}
