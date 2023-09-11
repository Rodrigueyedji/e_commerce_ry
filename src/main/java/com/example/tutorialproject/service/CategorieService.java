package com.example.tutorialproject.service;

import com.example.tutorialproject.model.CategorieDto;
import com.example.tutorialproject.model.ProduitDto;
import com.example.tutorialproject.repository.CategorieRepository;
import com.example.tutorialproject.repository.ProduitRepository;
import com.example.tutorialproject.repository.entities.Categorie;
import com.example.tutorialproject.repository.entities.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CategorieService {
    @Autowired
    private CategorieRepository categorieRepository;
    public List<Categorie> fetchAll() {
        return categorieRepository.findAll();
    }

    public List<Categorie> findByNomCategorieContaining(String nomCategorie) {
        return categorieRepository.findAll();
    }

    public Categorie fetchById(Long id) throws Exception {
        Optional<Categorie> categ = categorieRepository.findById(id);
        return categ.orElseThrow(() -> new Exception());
    }

    public void save(CategorieDto dto) {
        Categorie newCategorie = new Categorie(dto.getNomCategorie());
        categorieRepository.save(newCategorie);
    }
}
