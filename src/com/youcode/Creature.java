package com.youcode;

public class Creature extends Carte{
    private String nom;
    private int pointsDegats;
    private int pointsVie;

    public Creature(String nom, int pointsDegats, int pointsVie) {
        this.nom = nom;
        this.pointsDegats = pointsDegats;
        this.pointsVie = pointsVie;
    }

    @Override
    public String toString() {
        return "Une créature "+ nom +" "+ pointsDegats +"/"+pointsVie;
    }
}
