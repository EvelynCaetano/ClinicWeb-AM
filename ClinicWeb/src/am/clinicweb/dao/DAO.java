package am.clinicweb.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaQuery;


public class DAO<T> {

	private final Class<T> classe;

	public DAO(Class<T> classe) {
		this.classe = classe;
	}
	
	public void remover(T t) {
		EntityManager em = new EntityManagerFactorySingleton().getInstance();
		em.getTransaction().begin();
		em.remove(em.merge(t));
		em.getTransaction().commit();
		em.close();
	}
	
	public void atualizar(T t) {
		EntityManager em = new EntityManagerFactorySingleton().getInstance();
		em.getTransaction().begin();
		em.merge(t);
		em.getTransaction().commit();
		em.close();
	}

	public void cadastrar(T t) {
		//consegue a entity manager
		EntityManager em = new EntityManagerFactorySingleton().getInstance();
		//abre transacao
		em.getTransaction().begin();
		//persiste o objeto
		em.persist(t);
		//commit da transacao
		em.getTransaction().commit();
		//fecha a entity manager
		em.close();
	}
	
	public T buscaPorId(int id) {
		EntityManager em = new EntityManagerFactorySingleton().getInstance();
		return em.find(this.classe, id);
	}

	public List<T> listarTodos() {

		EntityManager em = new EntityManagerFactorySingleton().getInstance();
		CriteriaQuery<T> query = em.getCriteriaBuilder().createQuery(classe);
		query.select(query.from(classe));

		List<T> lista = em.createQuery(query).getResultList();
		em.close();

		return lista;
	}

}
