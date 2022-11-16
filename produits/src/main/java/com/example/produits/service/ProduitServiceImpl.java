package com.example.produits.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.produits.entities.Catégorie;
import com.example.produits.entities.Produit;
import com.example.produits.repos.produitRepository;


@Service
public  class ProduitServiceImpl implements ProduitService {
	
	@Autowired
	produitRepository produitRepository;
	
	
	
	@Override
	public Produit saveProduit(Produit p) {
		return produitRepository.save(p);
	}
@Override
	public Produit updateProduit(Produit p) {
		return produitRepository.save(p);
	}

	@Override
	public void deleteProduit(Produit p) {
		produitRepository.delete(p);
		
	}

	@Override
	public void deleteProduitById(Long id) {
		produitRepository.deleteById(id);
		
	}

	@Override
	public Produit getProduit(Long id) {
		 return produitRepository.findById(id).get();
	}

	@Override
	public List<Produit> getAllProduits() {
		return produitRepository.findAll();
	}
	@Override
	public List<Produit> findByNomProduit(String nom) {
		// TODO Auto-generated method stub
		return produitRepository.findByNomProduit(nom);
	}
	@Override
	public List<Produit> findByNomProduitContains(String nom) {
		// TODO Auto-generated method stub
		return produitRepository.findByNomProduitContains(nom);
	}
	@Override
	public List<Produit> findByNomPrix(String nom, Double prix) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Produit> findByCategorieIdCat(Long id) {
		// TODO Auto-generated method stub
		return produitRepository.findByCatégorieIdCat(id);
	}
	@Override
	public List<Produit> findByOrderByNomProduitAsc() {
		// TODO Auto-generated method stub
		return produitRepository.findByOrderByNomProduitAsc();
	}


}
