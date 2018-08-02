package ru.vershinin.model;


import javax.persistence.*;

@Entity
public class StudentBasic {

    @Id
    int id;

    // optional = true that means the column may be null
    @Basic(optional = true)
    String name;

    // This condition for a big objects that only needed when we request then.
    @Lob
    @Basic(fetch = FetchType.LAZY)
    byte[] img;

    public StudentBasic(String name, byte[] img) {
        this.name = name;
        this.img = img;
    }

    public StudentBasic() {
    }
}
