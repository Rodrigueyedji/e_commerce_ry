package com.example.tutorialproject.controller;

import com.example.tutorialproject.repository.entities.Categorie;
import com.example.tutorialproject.service.CategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins="*")
@RestController
@RequestMapping(value = "/apicategorie")
public class CategorieRestController {
    @Autowired
    CategorieService categorieService;
    @GetMapping("/categories")
    public ResponseEntity<List<Categorie>> getAllCategories(@RequestParam(value = "nomCategorie") String searchedNomCategorie) {
        List<Categorie> categ = new ArrayList<>();

        if (searchedNomCategorie == null) {
            categorieService.fetchAll().forEach(c -> categ.add(c));
        } else {
            categorieService.findByNomCategorieContaining(searchedNomCategorie).forEach(c -> categ.add(c));
        }
        if (categ.isEmpty()) {
            // HTTP 204 : sans contenu
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        } else {
            // HTTP 200 avec les tutos
            return ResponseEntity.status(HttpStatus.OK).body(categ);
        }

    }
}
