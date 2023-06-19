package School_Onetomany.main;

import java.sql.Types;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.google.protobuf.Type;

import School_Onetomany.dto.Games;
import School_Onetomany.dto.Plays;

public class Controller {
	
	public static void main(String[] args) {
		
		Games games=new Games();
		games.setName("PlayStore");
		games.setSource("C_Programe");
		
		Plays p1=new Plays();
		p1.setName("Freefire");
		p1.setSize("34mb");
		p1.setGames(games);
		
		Plays p2=new Plays();
		p2.setName("Frfire");
		p2.setSize("32mb");
		p2.setGames(games);
		
		Plays p3=new Plays();
		p3.setName("Freefox");
		p3.setSize("32mb");
		p3.setGames(games);
		
		
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("root");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(games);
		entityManager.persist(p1);
		entityManager.persist(p2);
		entityManager.persist(p2);
		entityTransaction.commit();
		
		
	}

}
