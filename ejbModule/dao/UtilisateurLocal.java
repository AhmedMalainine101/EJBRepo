package dao;

import java.util.List;

import javax.ejb.Local;

import model.Utilisateur;

@Local
public interface UtilisateurLocal {
	Utilisateur create(Utilisateur u);
	void delete(Utilisateur u);
	Utilisateur findById(int id);
	List<Utilisateur> findAll();
}
