package com.youcode;

public class Terrain extends Carte{
    private char couleur;

    public Terrain(int cout, char couleur) {
        super(cout);
        this.couleur = couleur;
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
