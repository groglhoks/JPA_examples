package ru.vershinin.model.example1;


import javax.persistence.*;

@Entity
public class StudentOneToOne {

    @Id
    int id;

    String name;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "addressId")
    StudentAddress studentAddress;

    public StudentOneToOne() {
    }

    public StudentOneToOne(String name, StudentAddress studentAddress) {
        this.name = name;
        this.studentAddress = studentAddress;
    }
}
