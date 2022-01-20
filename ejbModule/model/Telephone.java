package model;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;
import model.Utilisateur;

/**
 * Entity implementation class for Entity: Telephone
 *
 */
@Entity

public class Telephone implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String imei;
	@ManyToOne(fetch = FetchType.EAGER)
	private Utilisateur utilisateur;
	@OneToMany(fetch = FetchType.EAGER)
	private List<Localisation> localisations;
	
	private static final long serialVersionUID = 1L;

	public Telephone() {
		super();
	}   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public String getImei() {
		return this.imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}   
	public Utilisateur getUtilisateur() {
		return this.utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	
	@Override
	public String toString() {
		return "Phone [id=" + id + ", imei=" + imei + ", user=" + utilisateur + "]";
	}
   
}
