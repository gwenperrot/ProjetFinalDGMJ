package com.huios.springDataAngularJs.service;

import java.util.List;

import com.huios.springDataAngularJs.metier.Produit;



public interface IService {
	public Produit createProduit(Produit p);
	public void deleteProduit(Long id);
	public Produit updateProduit(Produit p);
	public List<Produit> ListerProduit();
	public Produit getProduit(Long id);
	
	public List<Produit> rechercherParDesignation(String designation);
	
	List<Produit> rechercherParMc(String mc);
	

}
