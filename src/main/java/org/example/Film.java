package org.example;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Film {
    private String filmtitel;
    private int udgivelsesår;
    private Producer producer;

    LocalDateTime localDate = LocalDateTime.now();
    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd MM, YYYY");

    public Film (String filmtitel, int udgivelsesår, Producer producer) {
        this.filmtitel = filmtitel;
        this.udgivelsesår = localDate.getYear();
        this.producer = producer;
    }

    public void FilmÅrgivet (String filmtitel, int udgivelsesår, Producer producer) {
        this.filmtitel = filmtitel;
        this.udgivelsesår = LocalDate.EPOCH.getYear();
        this.producer = producer;
    }



    public String toString(){
        return "Filmtitel: " + filmtitel + "\n" + "Udgivelsesår: " + udgivelsesår + "\n" + "Producer: " + producer;
    }

    public static void main(String[] args) {
        Producer producer01 = new Producer("Anders Jensen");
        Film film1 = new Film("Shrek 2", 2008, producer01);
        System.out.println(film1);
    }
}
