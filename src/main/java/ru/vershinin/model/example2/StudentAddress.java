package ru.vershinin.model.example2;

import ru.vershinin.model.example1.StudentOneToOne;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class StudentAddress {
    @Id
    int id;

    private String street;
    private String city;

    @ManyToOne()
    StudentManyToOne studentManyToOne;

    public StudentAddress(String street, String city) {
        this.street = street;
        this.city = city;
    }
}
