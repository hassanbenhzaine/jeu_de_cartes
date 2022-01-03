package com.youcode;

public abstract class Carte {

    private int cout;

    public Carte(int cout) {
        this.cout = cout;
    }


    public int getCout() {
        return cout;
    }

    public void setCout(int cout) {
        this.cout = cout;
    }

}
