package com.example.tutorialproject;
import com.example.tutorialproject.repository.CategorieRepository;
import com.example.tutorialproject.repository.entities.Categorie;
import com.example.tutorialproject.repository.entities.Produit;
import com.example.tutorialproject.repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProduitprojectApplication implements CommandLineRunner {
	@Autowired
	private ProduitRepository produitRepository;
	private CategorieRepository categorieRepository;

	public ProduitprojectApplication(CategorieRepository categorieRepository) {
		this.categorieRepository = categorieRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(ProduitprojectApplication.class, args);
	}
	// Lancement au démarrage du projet
	// Pratique pour exécuter des lignes de commandes
	@Override
	public void run(String... args) throws Exception {
		Produit myProduit1 = new Produit();
		myProduit1.setNom("Chemise");
		myProduit1.setLibelle("Col rond");
		myProduit1.setPrix(120f);
		myProduit1.setQteStock(120);
		produitRepository.save(myProduit1);

		Produit myProduit2 = new Produit();
		myProduit2.setNom("t-shirt");
		myProduit2.setLibelle("Col V");
		myProduit2.setPrix(1200f);
		myProduit2.setQteStock(1200);
		produitRepository.save(myProduit2);


		Categorie myCategorie1 = new Categorie();
		myCategorie1.setNomCategorie("Vetement Homme");
		categorieRepository.save(myCategorie1);

		Categorie myCategorie2 = new Categorie();
		myCategorie2.setNomCategorie("Vetement Femme");
		categorieRepository.save(myCategorie2);
	}

}
