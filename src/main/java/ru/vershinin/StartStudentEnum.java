package ru.vershinin;

import ru.vershinin.model.StudentEnum;
import ru.vershinin.model.StudentTemporal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StartStudentEnum {

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("example");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        StudentEnum studentEnum = new StudentEnum("Igor");
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        entityManager.persist(studentEnum);

        entityTransaction.commit();

        entityManager.close();
        entityManagerFactory.close();
    }
}
