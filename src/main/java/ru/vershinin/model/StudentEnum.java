package ru.vershinin.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

@Entity
public class StudentEnum {

    @Id
    int id;

    String name;

    // Thus, we indicate that the value of the enumeration will be stored in a string form
    @Enumerated(value = EnumType.STRING)
    Gender gender;

    public StudentEnum() {
    }

    public StudentEnum(String name) {
        this.name = name;
        this.gender = Gender.ALIEN;
    }
}

enum Gender {ALIEN, MALE, FEMALE}
