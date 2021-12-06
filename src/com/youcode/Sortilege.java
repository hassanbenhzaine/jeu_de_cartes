package com.youcode;

public class Sortilege extends Carte{
    private String nom;
    private String explication;

    public Sortilege(String nom, String explication) {
        this.nom = nom;
        this.explication = explication;
    }

    @Override
    public String toString() {
        return "Un sortilège " + nom +" "+ explication;
    }
}
