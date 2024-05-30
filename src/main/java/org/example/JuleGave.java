package org.example;

import java.util.Random;

public class JuleGave {
    private boolean isSoft;
    private boolean isRectangular;
    private boolean doesRattle;

    Random rand = new Random();


    public JuleGave () {
        this.isSoft = rand.nextBoolean();
        this.isRectangular = rand.nextBoolean();
        this.doesRattle = rand.nextBoolean();
    }

    public boolean couldBeLego() {
        boolean lego;
        if (isSoft && isRectangular && doesRattle) {
            lego = true;
        } else {
            lego = false;
        }
        return lego;
    }

    public boolean getIsSoft(){
        return isSoft;
    }

    public boolean getIsRectangular(){
        return isRectangular;
    }

    public boolean getDoesRattle(){
        return doesRattle;
    }
}
