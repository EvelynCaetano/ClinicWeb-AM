package am.clinicweb.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public abstract class OracleConexaoDAO {
	
	
	public static EntityManager Conectar(){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Conexao");
		EntityManager em = emf.createEntityManager();
			
		return em;
	}
	
}
