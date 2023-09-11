package com.example.tutorialproject.model;

public class ProduitDto {
    private Long id;
    private String nom;
    private String libelle;
    private Float prix;
    private Integer qteStock;

    public ProduitDto(String nom, String libelle, Float prix, Integer qteStock) {
        this.nom = nom;
        this.libelle = libelle;
        this.prix = prix;
        this.qteStock = qteStock;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Float getPrix() {
        return prix;
    }

    public void setPrix(Float prix) {
        this.prix = prix;
    }

    public Integer getQteStock() {
        return qteStock;
    }

    public void setQteStock(Integer qteStock) {
        this.qteStock = qteStock;
    }
}
