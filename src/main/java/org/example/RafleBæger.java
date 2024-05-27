package org.example;

import java.util.ArrayList;
import java.util.Random;

public class RafleBæger {
   private int antalTerningerIBæger;

    Random random = new Random();


    public RafleBæger (int antalTerningerIBæger) {
        this.antalTerningerIBæger = antalTerningerIBæger;
    }

    ArrayList<Integer> terningerSlag = new ArrayList<Integer>();

    int sum = 0;

    public int ryst(){
        terningerSlag.clear();
        for (int i = 1; i <= antalTerningerIBæger; i++) {
           int kast = random.nextInt(6)+1;
           terningerSlag.add(kast);
           sum += kast;
        }
        return sum;
    }

    public ArrayList<Integer> se(){
        return terningerSlag;
        }

    public static void main(String[] args) {
        RafleBæger rafleBægerinstans = new RafleBæger(2);
        System.out.println(rafleBægerinstans.ryst());
        System.out.println(rafleBægerinstans.se());
    }

}
