package com.huios.springDataAngularJs.controller;



import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.huios.springDataAngularJs.metier.Produit;
import com.huios.springDataAngularJs.service.IService;

//@Controller remplacement pour avoir du format json
@CrossOrigin
@RestController
public class ProduitController {
	@Autowired
	private IService service;

	@RequestMapping("/index")
	public List<Produit> home(Produit p) {
		return service.ListerProduit();
	}

	@RequestMapping("/mc")
	public List<Produit> rechercherParMc(String mc){
		return service.rechercherParMc(mc);
	}
	
	
	@RequestMapping(value="/saveProduit",method=RequestMethod.POST)
	public Produit save(@RequestBody Produit p) {
		
		return service.createProduit(p);
	}

	@RequestMapping("/deleteProduit")
	public void delete( Long id) {

		 service.deleteProduit(id);

	}

	@RequestMapping("/updateProduit")
	public Produit update(Produit p) {
		return service.updateProduit(p);

	}

	public IService getService() {
		return service;
	}

	public void setService(IService service) {
		this.service = service;
	}



}
