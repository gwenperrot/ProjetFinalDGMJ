package com.huios.springDataAngularJs.metier;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Component;

@Component
@Entity
public class Produit {
	@Id@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@NotEmpty
	@Size(min=4,max=20)
	private String designation;
	private int quantite;
	private double prix;
	
	
	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}
	//Getters and setters
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	
	//Affichage
	@Override
	public String toString() {
		return "Produit [id=" + id + ", designation=" + designation + ", quantite=" + quantite + ", prix=" + prix + "]";
	}
	
	
	
}
