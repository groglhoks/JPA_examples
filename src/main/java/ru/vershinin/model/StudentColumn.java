package ru.vershinin.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentColumn {

    @Id
    int id;

    // Some definition of column
    @Column(name = "my_name", unique = true, nullable = true, updatable = false, length = 45)
    String name;

    @Column(columnDefinition = "varchar(55) null")
    String surName;

    public StudentColumn() {
    }

}
