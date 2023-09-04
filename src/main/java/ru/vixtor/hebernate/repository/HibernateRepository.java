package ru.vixtor.hebernate.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.springframework.stereotype.Repository;
import ru.vixtor.hebernate.entity.Person;

import java.util.List;

@Repository
public class HibernateRepository {
    @PersistenceContext
    private EntityManager entityManager;

    public List<?> getPersonsByCity(String city) {
        Query query = entityManager
                .createQuery(
                        "select person from Person person  " +
                                "where person.cityOfLiving = :city", Person.class);
        query.setParameter("city", city);
        return query.getResultList();
    }


}
