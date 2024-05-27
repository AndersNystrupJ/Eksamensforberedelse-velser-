package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Keyword {
    private String word = "hejsa";
    private String definition = "En nonchalant hilsen";

    Scanner scan = new Scanner(System.in);

    public String matches(){
        String jaNej;
        String søgeOrd = scan.nextLine();
        if (word.toLowerCase().contains(søgeOrd.toLowerCase())) {
            jaNej = "Match";
            } else {
                jaNej = "Intet match";
            }
        return jaNej;
    }


    public String toString(){
        return "Ord: " + word + "\n" + "Definition: " + definition;
    }

    public static void main(String[] args) {
        Keyword keywordInstans = new Keyword();
        System.out.println("Indtast søgeord: ");
        System.out.println(keywordInstans.matches());
        System.out.println(keywordInstans);

    }
}
