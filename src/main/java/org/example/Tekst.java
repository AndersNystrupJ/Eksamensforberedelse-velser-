package org.example;
import java.util.*;

public class Tekst {

    private List<String> tekstLinjer = new ArrayList<>();


    public void tilføj(String tekst) {
        tekstLinjer.add(tekst);
    }


    //Smarteste metode, men må måske ikke bruges?
    /*
    public int findAntalUnikke(){
        HashSet<String> antalUnikke = new HashSet<>(tekstLinjer);
        return antalUnikke.size();
    }
     */

    public int findAntalUnikke() {
        ArrayList<String> antalUnikke = new ArrayList();
        for (int i = 0; i < tekstLinjer.size(); i++) {
            if (!antalUnikke.contains(tekstLinjer.get(i))) {
                antalUnikke.add(tekstLinjer.get(i));
            }
        }
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
        tekstInstans.findAntalUnikke();
        System.out.println(tekstInstans.findAntalUnikke());
    }
}