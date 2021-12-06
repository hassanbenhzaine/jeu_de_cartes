package com.youcode;

import java.util.*;

public class Jeu {
    private HashMap<Integer, Carte> cartes = new HashMap<>();

    public void addCarte(Carte carte) {
//        if(cartes.size() <= 10){
//            this.cartes.put(cartes.size(),carte);
//        }
        this.cartes.put(cartes.size(),carte);
    }

    public void jouer(){

        Scanner sc = new Scanner(System.in);

        while (!cartes.isEmpty()){
            System.out.println("\nLà, j'ai en stock :");

            for (Map.Entry<Integer, Carte> carte : cartes.entrySet()) {
                System.out.println(carte.getKey() + " - " + carte.getValue());
            }

            System.out.print("\nJe joue une carte : ");
            int idCarte = sc.nextByte();
            System.out.println("La carte jouée est : " + cartes.get(idCarte));
            cartes.put(idCarte, null);
        }
    }
}
