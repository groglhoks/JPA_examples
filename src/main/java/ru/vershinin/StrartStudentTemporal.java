package ru.vershinin;

import ru.vershinin.model.StudentSecTable;
import ru.vershinin.model.StudentTemporal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StrartStudentTemporal {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("example");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        StudentTemporal studentTemporal = new StudentTemporal("Igor");
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        entityManager.persist(studentTemporal);

        entityTransaction.commit();

        entityManager.close();
        entityManagerFactory.close();
    }
}
