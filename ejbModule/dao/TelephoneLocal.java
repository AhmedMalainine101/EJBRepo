package dao;

import java.util.List;

import javax.ejb.Local;

import model.Telephone;

@Local
public interface TelephoneLocal {
	Telephone create(Telephone p,int u);
	void delete(Telephone p);
	Telephone findByImei(String imei);
	Telephone findById(int id);
	List<Telephone> findAll();
	List<Telephone> getPhonesByUser(int uid);
}
