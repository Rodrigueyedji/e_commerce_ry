package com.example.tutorialproject.service;

import com.example.tutorialproject.model.ProduitDto;
import com.example.tutorialproject.repository.ProduitRepository;
import com.example.tutorialproject.repository.entities.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class ProduitService {
//    //pas testée
//    @Autowired
//    private ProduitRepository produitRepository;
//
//    // save operation
//    @Override
//    public Produit saveProduit(Produit produit) {
//        return produitRepository.save(produit);
//    }
//
//    // read operation
//    @Override
//    public List<Produit> fetchProduitList() {
//        return (List<Produit>) produitRepository.findAll();
//    }
//
//    // update operation
//    @Override
//    public Produit updateProduit(Produit produit, Long id) {
//        Produit prods = produitRepository.findById(id).get();
//        if (Objects.nonNull(produit.getNom()) && !"".equalsIgnoreCase(produit.getNom())) {
//            prods.setNom(produit.getNom());
//        }
//        if (Objects.nonNull(produit.getLibelle()))
//            if (!"".equalsIgnoreCase(produit.getLibelle())) {
//                prods.setLibelle(produit.getLibelle());
//            }
//        return produitRepository.save(prods);
//    }
//    // delete operation
//    @Override
//    public void deleteProduitById(Long id) {
//        produitRepository.deleteById(id);
//    }

//testée
    @Autowired
  private ProduitRepository produitRepository;
    public List<Produit> fetchAll() {
        return produitRepository.findAll();
    }

    public List<Produit> findByNomContaining(String nom) {
        return produitRepository.findAll();
    }

    public Produit fetchById(Long id) throws Exception {
        Optional<Produit> tuto = produitRepository.findById(id);
        return tuto.orElseThrow(() -> new Exception());
    }

    public void save(ProduitDto dto) {
        Produit newProduit = new Produit(dto.getNom(), dto.getLibelle(), dto.getPrix(), dto.getQteStock());
        produitRepository.save(newProduit);
    }
}
