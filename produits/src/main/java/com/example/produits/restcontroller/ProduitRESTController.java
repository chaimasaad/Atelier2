package com.example.produits.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.produits.entities.Produit;
import com.example.produits.service.ProduitService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ProduitRESTController {
	
@Autowired 
ProduitService 	produitService;

@RequestMapping(method=RequestMethod.GET )
List<Produit>getAllProduits()
{
	return produitService.getAllProduits();
}

	
	
}
