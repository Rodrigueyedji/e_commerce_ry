package com.example.tutorialproject.model;

import com.example.tutorialproject.repository.entities.Categorie;
import com.example.tutorialproject.repository.entities.Produit;
import com.example.tutorialproject.service.CategorieService;
import com.example.tutorialproject.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class CategorieController {
    @Autowired
    CategorieService categorieService;

    @GetMapping("/categories")
    public String displayCategogie(Model model) {
        try {
            List<Categorie> categorieList = categorieService.fetchAll();
            model.addAttribute("categories", categorieList);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "categorie";//return vers la page html
    }

    @GetMapping("/categories/add")
    public String addCategorieForm() {
        return "add-categorie";
    }

    @PostMapping("/categories/add")
    public String addCategorieSubmission(CategorieDto categorieDto) {
        categorieService.save(categorieDto);
        return "redirect:/categories";
    }
}
