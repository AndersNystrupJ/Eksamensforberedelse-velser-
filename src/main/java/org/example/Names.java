package org.example;

public class Names {

    String firstName;
    String middleName;
    String lastName;

    public Names(String fullName) {
        // Splitter den fulde navnstreng ved mellemrum.
        String[] deleAfNavn = fullName.split(" ");
        if (deleAfNavn.length == 2) {
            this.firstName = deleAfNavn[0];
            this.middleName = "";
            this.lastName = deleAfNavn[1];
        } else if (deleAfNavn.length == 3) {
            this.firstName = deleAfNavn[0];
            this.middleName = deleAfNavn[1];
            this.lastName = deleAfNavn[2];
        } else {
            System.out.println("Navn skal indholde fornavn og efternavn");
        }
    }



    public String toString() {
        return "Fornavn: " + firstName + "\n Mellemnavn: " + middleName + "\n Efternavn: " + lastName;
    }
}

