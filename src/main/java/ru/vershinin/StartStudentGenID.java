package ru.vershinin;

import ru.vershinin.model.StudentGenID;
import ru.vershinin.model.StudentSecTable;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StartStudentGenID {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("example");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        StudentGenID studentGenID = new StudentGenID("Igor");
        StudentGenID studentGenID2 = new StudentGenID("Sergey");
        StudentGenID studentGenID3 = new StudentGenID("Petya");

        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        entityManager.persist(studentGenID);
        entityManager.persist(studentGenID2);
        entityManager.persist(studentGenID3);

        entityTransaction.commit();

        StudentGenID studentGenID4 = new StudentGenID("Igor_");
        StudentGenID studentGenID5 = new StudentGenID("Sergey_");
        StudentGenID studentGenID6 = new StudentGenID("Petya_");

        entityTransaction.begin();

        entityManager.persist(studentGenID4);
        entityManager.persist(studentGenID5);
        entityManager.persist(studentGenID6);

        entityTransaction.commit();

        entityManager.close();
        entityManagerFactory.close();
    }
}
