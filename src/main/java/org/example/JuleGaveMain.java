package org.example;

public class JuleGaveMain {

    public static void main(String[] args) {
        JuleGave instansJulegave = new JuleGave();

        System.out.println(instansJulegave.getIsSoft());
        System.out.println(instansJulegave.getIsRectangular());
        System.out.println(instansJulegave.getDoesRattle());
        System.out.println();
        System.out.println("Could be Lego: ");
        System.out.println(instansJulegave.couldBeLego());

    }



}
