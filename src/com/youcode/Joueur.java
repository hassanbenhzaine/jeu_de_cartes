package com.youcode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Joueur {
    private List<Carte> cartes = new ArrayList<>();

    public void setCartes(List<Carte> cartes) {
        this.cartes = cartes;
    }

    public List<Carte> getCartes() {
        return cartes;
    }

    public Carte getCardByIndex(Integer index){
        return cartes.get(index);
    }

    public boolean removeCard(Carte carte){
        return cartes.remove(carte);
    }


    public List<Carte> getCards(){
        return cartes;
    }
}
