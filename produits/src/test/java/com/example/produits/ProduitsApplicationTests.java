package com.example.produits;



import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.produits.entities.Catégorie;
import com.example.produits.entities.Produit;

import com.example.produits.repos.produitRepository;

@SpringBootTest
class ProduitsApplicationTests {


	@Autowired
	private produitRepository produitRepository;

	
	
	@Test
	public void testCreateProduit() {
	Produit prod = new Produit(" imprimante Epson", 1.500,new Date());
	produitRepository.save(prod);
	}
	
	
	
	@Test
	public void testFindProduit()
	{ 
		Produit p = produitRepository.findById(1L).get();
		System.out.println(p);
	
	}
	@Test
	public void testUpdateProduit()
	{ 
		Produit p = produitRepository.findById(1L).get();
		p.setPrixProduit(2000.0);
		produitRepository.save(p);
		System.out.println(p);
	
	}
	@Test
	public void testDeleteProduit()
	{ 
		 produitRepository.deleteById(1L);
	
	}

	
	@Test
	public void testFindAllProduits()
	{ 
		List<Produit> prods =produitRepository.findAll();
		 
	for (Produit p:prods)
		System.out.println(p);
	}
	
	@Test
	public void testFindProduitByNom()
	{ 
		List <Produit> prods = produitRepository.findByNomProduit("PC Asus");
		for (Produit p:prods)
			System.out.println(p);
	}
	
	@Test
	public void testFindProduitByNomContains()
	{ 
		List <Produit> prods = produitRepository.findByNomProduitContains("P");
		for (Produit p:prods)
			System.out.println(p);
	}
	@Test
	public void testfindByNomPrix()
	{
	List<Produit> prods = produitRepository.findByNomPrix("	\n"
			+ "PC Asus", 1500.5);
	   for (Produit p : prods)
	{
	System.out.println(p);
	}
	}
	
	@Test
	public void testfindByCatégorie()
	{
	Catégorie cat= new Catégorie();
	cat.setIdCat(1L);
	List<Produit> prods = produitRepository.findByCatégorie(cat);
	for (Produit p : prods)
	{
	System.out.println(p);
	}
	}
	@Test
	public void findByCategorieIdCat()
	{
	List<Produit> prods = produitRepository.findByCatégorieIdCat(1L);
	for (Produit p : prods)
	{
	  System.out.println(p);
	}
	 }
	@Test
	public void testfindByOrderByNomProduitAsc()
	{
	List<Produit> prods = 
	produitRepository.findByOrderByNomProduitAsc();
	for (Produit p : prods)
	{
	System.out.println(p);
	}
	}

	@Test
	public void testTrierProduitsNomsPrix()
	{
	List<Produit> prods = produitRepository.trierProduitsNomsPrix();
	for (Produit p : prods)
	{
	System.out.println(p);
	}
	}

	
	
	

}
