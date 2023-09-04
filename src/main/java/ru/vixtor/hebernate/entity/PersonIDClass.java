package ru.vixtor.hebernate.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class PersonIDClass implements Serializable {

    private String name;

    private String surname;

    private int age;
}
