package service;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import dao.LocalisationLocal;
import dao.LocalisationRemote;
import model.Localisation;

@Stateless
public class LocalisationService implements LocalisationLocal, LocalisationRemote {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Localisation create(Localisation l) {
		em.persist(l);
		return l;
	}

	@Override
	public void delete(Localisation l) {
		em.remove(l);
	}

	@Override
	public Localisation findById(int id) {
		Localisation l = em.find(Localisation.class, id);
		if(l == null)
			throw new RuntimeException("La Localisation est introuvable");
		return l;
	}

	@Override
	public List<Localisation> findAll() {
		Query q = em.createQuery("select l from Localisation l");
		return q.getResultList();
	}

}
