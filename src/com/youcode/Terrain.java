package com.youcode;

public class Terrain extends Carte{
    private char couleur;

    public Terrain(char couleur) {
        this.couleur = couleur;
        this.setCout(0);
    }

    @Override
    public String toString() {
        switch (couleur){
            case 'B':
                return "Un terrain blanc";
            case 'b':
                return "Un terrain bleu";
            case 'n':
                return "Un terrain noir";
            case 'r':
                return "Un terrain rouge";
            case 'v':
                return "Un terrain vert";
            default:
                return "Un terrain " + couleur;
        }
    }

}
