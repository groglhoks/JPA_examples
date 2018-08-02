package ru.vershinin.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
public class StudentTemporal {

    @Id
    int id;

    String name;

    @Temporal(value = TemporalType.DATE)
    Date dateFrst = new Date();

    @Temporal(value = TemporalType.TIME)
    Date dateSec = new Date();

    @Temporal(value = TemporalType.TIMESTAMP)
    Date dateThird = new Date();

    Date dateFourth = new Date();

    LocalDateTime localDateTime = LocalDateTime.now();
    public StudentTemporal(String name) {
        this.name = name;
    }

    public StudentTemporal() {
    }
}
