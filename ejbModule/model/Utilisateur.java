package model;

import java.io.Serializable;
import java.lang.String;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Utilisateur
 *
 */
@Entity

public class Utilisateur implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nom;
	@Temporal(TemporalType.DATE)
	private Date dateNaissance;
	private String email;
	@Transient
	@OneToMany(fetch = FetchType.EAGER)
	private List<Telephone> telephones;
	private static final long serialVersionUID = 1L;
	
	public Utilisateur(String nom, Date dateNaissance, String email) {
		super();
		this.nom = nom;
		this.dateNaissance = dateNaissance;
		this.email = email;
	}
	

	public Utilisateur(String nom, Date dateNaissance, String email, List<Telephone> telephones) {
		super();
		this.nom = nom;
		this.dateNaissance = dateNaissance;
		this.email = email;
		this.telephones = telephones;
	}


	public Utilisateur() {
		super();
	}   
	
	
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}   
	public Date getDateNaissance() {
		return this.dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}   
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
   
}
