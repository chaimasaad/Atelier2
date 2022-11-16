package com.example.produits.repos;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.produits.entities.Catégorie;
import com.example.produits.entities.Produit;

public interface produitRepository extends JpaRepository<Produit, Long> {

	List<Produit> findByNomProduit(String nom);

	List<Produit> findByNomProduitContains(String nom);
	
	
	
	/*@Query("select p from Produit p where p.nomProduit like %?1 and p.prixProduit > ?2")
	List<Produit> findByNomPrix (String nom, Double prix);*/
	
	@Query("select p from Produit p where p.nomProduit like %:nom and p.prixProduit > :prix")
	List<Produit> findByNomPrix (@Param("nom") String nom,@Param("prix") Double prix);
	

	@Query("select p from Produit p where p.categorie = ?1")
	List<Produit> findByCatégorie (Catégorie Catégorie);
	List<Produit> findByCatégorieIdCat (Long id);
	List<Produit> findByOrderByNomProduitAsc();


	@Query("select p from Produit p order by p.nomProduit ASC, p.prixProduit DESC")
	List<Produit> trierProduitsNomsPrix ();

	
	
	
	
	
}
