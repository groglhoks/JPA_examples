package ru.vershinin.model.example1;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class StudentAddress {
    @Id
    int id;

    String street;
    String city;

    @OneToOne(mappedBy = "studentAddress")
    StudentOneToOne studentOneToOne;

    public StudentAddress(String street, String city) {
        this.street = street;
        this.city = city;
    }
}
