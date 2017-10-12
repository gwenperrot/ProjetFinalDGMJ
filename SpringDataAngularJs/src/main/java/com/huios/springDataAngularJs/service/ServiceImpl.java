package com.huios.springDataAngularJs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huios.springDataAngularJs.dao.ProduitDao;
import com.huios.springDataAngularJs.metier.Produit;


@Service
public class ServiceImpl implements IService {
	@Autowired
	ProduitDao produitDao;

	@Override
	public Produit createProduit(Produit p) {
		return produitDao.save(p);

	}

	@Override
	public void deleteProduit(Long id) {
		produitDao.deleteById(id);

	}

	@Override
	public Produit updateProduit(Produit p) {
		return produitDao.saveAndFlush(p);

	}

	@Override
	public List<Produit> ListerProduit() {
		return produitDao.findAll();
	}

	@Override
	public Produit getProduit(Long id) {
		return produitDao.findById(id).get();
	}

	@Override
	public List<Produit> rechercherParDesignation(String designation) {
		// TODO Auto-generated method stub
		return produitDao.findByDesignation(designation);
	}

	@Override
	public List<Produit> rechercherParMc(String mc) {
		// TODO Auto-generated method stub
		return produitDao.rechercherParMc("%"+mc+"%");
	}

}
