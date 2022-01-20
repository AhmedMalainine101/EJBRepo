package dao;

import java.util.List;

import javax.ejb.Remote;

import model.Telephone;


@Remote
public interface TelephoneRemote {
	Telephone create(Telephone p,int u);
	void delete(Telephone p);
	Telephone findByImei(String imei);
	Telephone findById(int id);
	List<Telephone> findAll();
	List<Telephone> getPhonesByUser(int uid);
}
