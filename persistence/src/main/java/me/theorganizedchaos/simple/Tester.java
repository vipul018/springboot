package me.theorganizedchaos.simple;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

public class Tester {
  public static void main(String[] args) {
    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa-example");
    EntityManager entityManager = entityManagerFactory.createEntityManager();

    // INSERT
//    Employee employee = new Employee();
//    employee.setEmail("babloo@gmail.com");
//    employee.setFirstName("Babloo");
//    employee.setLastName("Baloo");
//
//    entityManager.getTransaction().begin();
//    entityManager.persist(employee);
//    entityManager.getTransaction().commit();

    // FIND BY ID
//    Employee e = entityManager.find(Employee.class, "86d6d179-849a-4da6-998a-266fc4d8f4d2");
//    System.out.println(e);

    // UPDATE
//    Employee e = entityManager.find(Employee.class, "0b2ec63b-eab1-42ed-9860-581c3bd7c907");
//    e.setFirstName("John");
//    e.setLastName("Doe");
//    e.setEmail("johndoe@gmail.com");
//    entityManager.getTransaction().begin();
//    entityManager.merge(e);
//    entityManager.getTransaction().commit();


    // DELETE
//    Employee e = entityManager.find(Employee.class, "290a35b5-a4dd-4923-98ac-4c10678731de");
//    entityManager.getTransaction().begin();
//    entityManager.remove(e);
//    entityManager.getTransaction().commit();

    // FIND ALL
//    TypedQuery<Employee> query = entityManager.createQuery("SELECT emp FROM Employee emp ORDER BY emp.email DESC", Employee.class);
//    List<Employee> resultList = query.getResultList();
//
//    for (Employee result: resultList) {
//      System.out.println(result.getFirstName());
//    }

    // FIND BY EMAIL
    TypedQuery<Employee> query = entityManager.createNamedQuery("Employee.findByEmail", Employee.class);
    query.setParameter("paramEmail", "johndoe@gmail.com");
    List<Employee> resultList = query.getResultList();

    for (Employee result : resultList) {
      System.out.println(result.getFirstName());
    }

    entityManager.close();
    entityManagerFactory.close();
  }
}
