package com.example.tutorialproject.model;

import com.example.tutorialproject.repository.entities.Produit;
import com.example.tutorialproject.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
//posibilité de mettre un url pour le controller
@Controller
public class ProduitController {
    @Autowired
    ProduitService produitService;

//    @GetMapping("/produits")
//    public String displayTutorial(Model model) {
//        try {
//            List<Produit> produitList = produitService.fetchAll();
//            model.addAttribute("produits", produitList);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return "produit";//return vers la page html
//    }

    @GetMapping("/produits/add")
    public String addProduitForm() {
        return "add-produit";
    }

    @PostMapping("/produits/add")
    public String addProduitSubmission(ProduitDto produitDto) {
        produitService.save(produitDto);
        return "redirect:/produits";
    }
}
