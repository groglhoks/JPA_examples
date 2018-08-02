package ru.vershinin;

import ru.vershinin.model.StudentCollection;
import ru.vershinin.model.example1.StudentAddress;
import ru.vershinin.model.example1.StudentOneToOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StartStudentOneToOne {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("example");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        StudentAddress studentAddress = new StudentAddress("Arbatskaya st.","Moscow");
        StudentOneToOne studentOneToOne = new StudentOneToOne("Igor", studentAddress);
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        entityManager.persist(studentOneToOne);

        entityTransaction.commit();

        entityManager.close();
        entityManagerFactory.close();
    }
}
