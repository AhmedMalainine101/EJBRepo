package dao;

import java.util.List;

import javax.ejb.Remote;

import model.Localisation;
@Remote
public interface LocalisationRemote {
	Localisation create(Localisation l);
	void delete(Localisation l);
	Localisation findById(int id);
	List<Localisation> findAll();
}
