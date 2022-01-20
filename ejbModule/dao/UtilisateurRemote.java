package dao;

import java.util.List;

import javax.ejb.Remote;

import model.Utilisateur;

@Remote
public interface UtilisateurRemote {
	Utilisateur create(Utilisateur u);
	void delete(Utilisateur u);
	Utilisateur findById(int id);
	List<Utilisateur> findAll();
}
