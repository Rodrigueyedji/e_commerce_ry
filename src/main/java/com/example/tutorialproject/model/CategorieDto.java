package com.example.tutorialproject.model;

public class CategorieDto {
    private Integer id;
    private String nomCategorie;

    public CategorieDto(String nomCategorie) {
        this.nomCategorie = nomCategorie;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomCategorie() {
        return nomCategorie;
    }

    public void setNomCategorie(String nomCategorie) {
        this.nomCategorie = nomCategorie;
    }
}
