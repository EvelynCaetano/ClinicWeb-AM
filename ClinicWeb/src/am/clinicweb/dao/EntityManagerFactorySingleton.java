package am.clinicweb.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactorySingleton {
	
	private static EntityManagerFactory emf = null;
	
	EntityManagerFactorySingleton(){
		super();
	}
	
	public EntityManager getInstance(){
		
		if(emf == null){
			emf = Persistence.createEntityManagerFactory("Conexao");
		}
		return emf.createEntityManager();
	}
}
