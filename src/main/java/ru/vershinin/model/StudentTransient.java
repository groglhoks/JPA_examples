package ru.vershinin.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class StudentTransient {

    @Id
    int id;

    String name;

//    @Transient and transient these two characteristics mean that the columns in the database will not be created

    @Transient
    int age = 22;

    transient int ageSec = 23;
}
