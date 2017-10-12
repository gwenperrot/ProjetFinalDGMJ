package com.huios.springDataAngularJs.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.huios.springDataAngularJs.metier.Produit;



@Repository
public interface ProduitDao extends JpaRepository<Produit, Long>{
	List<Produit> findByDesignation(String designation);
	
	@Query("select p from Produit p where p.designation like :x")
	List<Produit> rechercherParMc(@Param("x")String mc);

}
