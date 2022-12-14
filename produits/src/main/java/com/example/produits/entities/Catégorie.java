package com.example.produits.entities;
import java.util.List;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;












@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Catégorie {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long idCat;
private String nomCat;
private String descriptionCat;
@JsonIgnore
@OneToMany(mappedBy = "catégorie")
private List<Produit> produits;
}

