package com.example.tutorialproject.repository;

import com.example.tutorialproject.repository.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

// CRUD JPA sur entité Produit
@Repository
public interface ProduitRepository extends JpaRepository<Produit, Long> {

}
