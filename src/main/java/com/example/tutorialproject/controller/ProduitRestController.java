package com.example.tutorialproject.controller;

import com.example.tutorialproject.repository.entities.Produit;
import com.example.tutorialproject.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins="*")
@RestController
@RequestMapping(value = "/apiproduit")
public class ProduitRestController {
    @Autowired
    ProduitService produitService;
    @GetMapping("/produits")
    public ResponseEntity<List<Produit>> getAllProduits(@RequestParam(value = "nom") String searchedNom) {
        List<Produit> prods = new ArrayList<>();

        if (searchedNom == null) {
            produitService.fetchAll().forEach(t -> prods.add(t));
        } else {
            produitService.findByNomContaining(searchedNom).forEach(t -> prods.add(t));
        }
        if (prods.isEmpty()) {
            // HTTP 204 : sans contenu
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        } else {
            // HTTP 200 avec les tutos
            return ResponseEntity.status(HttpStatus.OK).body(prods);
        }

    }
}
