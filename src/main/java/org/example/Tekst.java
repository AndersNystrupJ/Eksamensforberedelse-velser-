package org.example;
import java.util.*;
import java.util.stream.Collectors;

public class Tekst {

    private List<String> tekstLinjer = new ArrayList<>();




    public void tilføj(String tekst){
        tekstLinjer.add(tekst);
    }


    public int findAntalUnikke(){
        HashSet<String> antalUnikke = new HashSet<>(tekstLinjer);
        return antalUnikke.size();

    }

    public static void main(String[] args) {
        Tekst tekstInstans = new Tekst();
        tekstInstans.tekstLinjer.add("Gulerod");
        tekstInstans.tekstLinjer.add("tomat");
        tekstInstans.tekstLinjer.add("tomat");
        Scanner scan = new Scanner(System.in);
        String tekstTilføj = scan.nextLine();
        tekstInstans.tilføj(tekstTilføj);
        System.out.println(tekstInstans.findAntalUnikke());

        }
    }
