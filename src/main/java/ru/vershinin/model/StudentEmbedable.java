package ru.vershinin.model;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentEmbedable {

    @Id
    int id;

    String name;

    StudentAddress studentAddress = new StudentAddress();

    public StudentEmbedable(String name) {
        this.name = name;
        studentAddress.city = "Moscow";
        studentAddress.street = "Arbatskaya st.";
    }

    public StudentEmbedable() {
    }
}

@Embeddable
class StudentAddress {
    String city;
    String street;
}