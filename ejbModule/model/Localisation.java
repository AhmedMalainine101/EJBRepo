package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import model.Telephone;

/**
 * Entity implementation class for Entity: Localisation
 *
 */
@Entity

public class Localisation implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private double latitude;
	private double longtitude;
	private Date date;
	@ManyToOne(fetch = FetchType.EAGER)
	private Telephone telephone;

	private static final long serialVersionUID = 1L;
	
	public Localisation(double latitude, double longtitude, Date date) {
		super();
		this.latitude = latitude;
		this.longtitude = longtitude;
		this.date = date;
	}

	public Localisation() {
		super();
	}   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public double getLatitude() {
		return this.latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}   
	public double getLongtitude() {
		return this.longtitude;
	}

	public void setLongtitude(double longtitude) {
		this.longtitude = longtitude;
	}   
	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}   
	public Telephone getTelephone() {
		return this.telephone;
	}

	public void setTelephone(Telephone telephone) {
		this.telephone = telephone;
	}

	@Override
	public String toString() {
		return "Localisation [id=" + id + ", latitude=" + latitude + ", longtitude=" + longtitude + ", date=" + date
				+ "]";
	}
   
}
