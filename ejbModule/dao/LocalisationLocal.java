package dao;

import java.util.List;

import javax.ejb.Local;

import model.Localisation;

@Local
public interface LocalisationLocal {
	Localisation create(Localisation l);
	void delete(Localisation l);
	Localisation findById(int id);
	List<Localisation> findAll();
}
