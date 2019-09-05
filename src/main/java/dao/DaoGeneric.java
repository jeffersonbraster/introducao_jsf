package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import jpautil.jpautil;

public class DaoGeneric<J> {
	
	public void salvar(J entidade) {
		EntityManager entityManager = jpautil.getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		
		entityManager.persist(entidade);
		
		entityTransaction.commit();
		entityManager.close();
	}
	
	public J merge(J entidade) {
		EntityManager entityManager = jpautil.getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		
		J retorno = entityManager.merge(entidade);
		
		entityTransaction.commit();
		entityManager.close();
		
		return retorno;
	}
	
	public void deletePorId(J entidade) {
		EntityManager entityManager = jpautil.getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		
		Object id = jpautil.getPrimaryKey(entidade);
		
		entityManager.createQuery("delete from " + entidade.getClass().getCanonicalName() + " where id = " + id).executeUpdate();
		
		entityTransaction.commit();
		entityManager.close();
	}
	
	public List<J> getListEntity(Class<J> entidade) {
		EntityManager entityManager = jpautil.getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		
		List<J> retorno = entityManager.createQuery("from " + entidade.getName()).getResultList(); 
		
		entityTransaction.commit();
		entityManager.close();
		
		return retorno;
	}
}
