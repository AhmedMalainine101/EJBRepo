package service;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import dao.UtilisateurLocal;
import dao.UtilisateurRemote;
import model.Utilisateur;


@Stateless
public class UtilisateurService implements UtilisateurLocal, UtilisateurRemote {
	@PersistenceContext
	private EntityManager em;

	public UtilisateurService() {
		
	}

	public Utilisateur create(Utilisateur u) {
		em.persist(u);
		return u;
	}
	
	public Utilisateur findById(int id) {
		Utilisateur u = em.find(Utilisateur.class, id);
		if(u == null)
			throw new RuntimeException("User Not Exist");
		return u;
	}
	
	public void delete(Utilisateur u) {
		em.remove(u);
	}
	
	public List<Utilisateur> findAll() {
		Query q = em.createQuery("select u from Utilisateur u");
		return q.getResultList();		
	}
	
	
}
