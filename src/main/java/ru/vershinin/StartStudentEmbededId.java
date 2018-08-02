package ru.vershinin;

import ru.vershinin.model.StudentEmbededIDSec;
import ru.vershinin.model.StudentEmbededId;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StartStudentEmbededId {

    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("example");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        EntityTransaction entityTransaction = entityManager.getTransaction();

        StudentEmbededId studentEmbededId = new StudentEmbededId("Igor", "Vershinin", 22);
        StudentEmbededIDSec studentEmbededSecId = new StudentEmbededIDSec("Igor", "Vershinin", 22);

        entityTransaction.begin();

        entityManager.persist(studentEmbededId);
        entityManager.persist(studentEmbededSecId);

        entityTransaction.commit();

        entityManager.close();
        entityManagerFactory.close();
    }


}
