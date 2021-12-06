package com.youcode;

public class Main {

    public static void main(String[] args) {

        Jeu game = new Jeu();

        game.addCarte(new Terrain('B'));
        game.addCarte(new Terrain('b'));
        game.addCarte(new Terrain('n'));
        game.addCarte(new Terrain('r'));
        game.addCarte(new Terrain('v'));

        game.addCarte(new Creature("Golem",4,6));
        game.addCarte(new Creature("Golem 2",10,4));
        game.addCarte(new Creature("Golem 3",3,7));
        game.addCarte(new Creature("Golem 4",1,4));
        game.addCarte(new Creature("Golem 5",9,4));
        game.addCarte(new Creature("Golem 6",6,7));
        game.addCarte(new Creature("Golem 7",2,5));
        game.addCarte(new Creature("Golem 8",3,9));

        game.addCarte(new Sortilege("Croissance","Gigantesque"));
        game.addCarte(new Sortilege("Croissance 2","Gigantesque"));
        game.addCarte(new Sortilege("Croissance 3","Gigantesque"));
        game.addCarte(new Sortilege("Croissance 4","Gigantesque"));
        game.addCarte(new Sortilege("Croissance 5","Gigantesque"));
        game.addCarte(new Sortilege("Croissance 6","Gigantesque"));
        game.addCarte(new Sortilege("Croissance 7","Gigantesque"));
        game.addCarte(new Sortilege("Croissance 8","Gigantesque"));



        game.jouer();

    }
}
