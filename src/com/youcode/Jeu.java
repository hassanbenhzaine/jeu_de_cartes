package com.youcode;

import java.util.*;

public class Jeu {
    private List<Carte> cartes = new ArrayList<>();
    private List<Joueur> joueurs = new ArrayList<>();

    public Jeu() {
        this.joueurs.add(new Joueur());
        this.joueurs.add(new Joueur());
    }

    public void addCarte(Carte carte) {
//        if(cartes.size() <= 10){
//            this.cartes.put(cartes.size(),carte);
//        }
        this.cartes.add(carte);
    }


    public Optional<Carte> carteFort(Carte carte1, Carte carte2){
        Optional<Carte> carteFort = Optional.empty();

        if(carte1.getClass() == carte2.getClass()){
           carteFort = carte1.getCout() > carte2.getCout() ? Optional.of(carte1) : Optional.of(carte2);
        }else{
            if(carte1 instanceof Sortilege || carte2 instanceof Sortilege){
                carteFort = Optional.of(carte1);
            }else if(carte2 instanceof Sortilege){
                carteFort = Optional.of(carte2);
            }else{
                if(carte1 instanceof Creature){
                    carteFort = Optional.of(carte1);
                }else if(carte2 instanceof Creature){
                    carteFort = Optional.of(carte2);
                }
            }
        }

        return carteFort;
    }

    public void start(){
        Collections.shuffle(cartes);

        Joueur joueur1 = joueurs.get(0);
        Joueur joueur2 = joueurs.get(1);

        joueur1.setCartes(cartes.subList(0,12));
        joueur2.setCartes(cartes.subList(12,24));

        for (int i = 0; i < 10; i++) {
            Optional<Carte> carte = Optional.empty();
            while (!joueur1.getCartes().isEmpty() && !joueur2.getCartes().isEmpty() ){


                System.out.println("\nLà, j'ai en stock :");

                printCards();

                System.out.print("\nJe joue la carte : ");
                Scanner sc = new Scanner(System.in);

                carte = Optional.of(joueur1.getCardByIndex(sc.nextInt()));
            }
            System.out.println(joueur1.removeCard(carte.get()));

        }

    }

    public void printCards(){
        List<Carte> cartesJoueur1 = joueurs.get(0).getCards();
        List<Carte> cartesJoueur2 = joueurs.get(1).getCards();

        System.out.println("\nplayer 1");
        cartesJoueur1.forEach(x -> System.out.println(cartesJoueur1.indexOf(x)+1 +" - "+  x));
        System.out.println("\nplayer 2");
        cartesJoueur1.forEach(x -> System.out.println(cartesJoueur1.indexOf(x)+1 +" - "+  x));
    }


}
