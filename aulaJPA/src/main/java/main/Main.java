package main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();

		//insert
//		Pessoa p1 = new Pessoa(null,"Halan","halan@email.com");
//		Pessoa p2 = new Pessoa(null,"Caio","Caio@email.com");
//		Pessoa p3 = new Pessoa(null,"Pereira","pereira@email.com");
//		
//		em.getTransaction().begin();
//		em.persist(p1);
//		em.persist(p2);
//		em.persist(p3);
//		em.getTransaction().commit();
		
		//find
		Pessoa p = em.find(Pessoa.class, 2);
//		System.out.println(p);
		
		//remove
		em.getTransaction().begin();
		em.remove(p);
		em.getTransaction().commit();
		
		System.out.println("pronto!");
		em.close();
		emf.close();
	}

}
