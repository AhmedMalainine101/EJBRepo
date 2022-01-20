package service;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import dao.TelephoneLocal;
import dao.TelephoneRemote;
import dao.UtilisateurLocal;
import model.Telephone;
import model.Utilisateur;

@Stateless
public class TelephoneService implements TelephoneRemote, TelephoneLocal{
	
	@PersistenceContext
	private EntityManager em;
	@EJB
	private UtilisateurLocal us;
	
    public TelephoneService() {
        // TODO Auto-generated constructor stub
    }

	public Telephone create(Telephone p,int user) {
		Utilisateur u = us.findById(user);
		p.setUtilisateur(u);
		em.persist(p);
		return p;
	}

	public void delete(Telephone p) {
		em.remove(p);
	}

	public Telephone findById(int id) {
		Telephone p = em.find(Telephone.class, id);
		if(p == null)
			throw new RuntimeException("Telephone introuvable");
		return p;
	}
	public Telephone findByImei(String imei) {
		Query q = em.createQuery("select p from Telephone p where p.imei=:imei");
		q.setParameter("imei", imei);
		return (Telephone)q.getSingleResult();
	}
	public List<Telephone> findAll() {
		Query q = em.createQuery("select p from Telephone p");
		return q.getResultList();
	}
	
	public List<Telephone> getPhonesByUser(int uid) {
		Query q = em.createQuery("select p from Phone p where p.user.id=:id");
		q.setParameter("id", uid);
		return q.getResultList();
	}

	
	

	
		
	

	

}
