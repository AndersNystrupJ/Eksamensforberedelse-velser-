package org.example;
import java.util.*;
import java.lang.*;


public class User {


    private String fullName;
    private String userID;


    public User (String fullName) {
        this.fullName = fullName;
    }

    public boolean validUserID(){
        boolean valid;
        if (Character.isLowerCase(userID.charAt(0)) && Character.isLowerCase(userID.charAt(1)) && Character.isLowerCase(userID.charAt(2)) && Character.isLowerCase(userID.charAt(3)) && Character.isDigit(userID.charAt(4)) && Character.isDigit(userID.charAt(5)) && Character.isDigit(userID.charAt(6)) && Character.isDigit(userID.charAt(7))) {
            valid = true;
        } else {
            valid = false;
        }
        return valid;
    }

    public void createUserID(){
        Random rand = new Random();
        String[] todelingAfNavn = fullName.split(" ");
        this.userID = String.valueOf(todelingAfNavn[0].toLowerCase().charAt(0)) + String.valueOf(todelingAfNavn[0].toLowerCase().charAt(1) + String.valueOf(todelingAfNavn[1].toLowerCase().charAt(0)) + String.valueOf(todelingAfNavn[1].toLowerCase().charAt(1))) + rand.nextInt(10) + rand.nextInt(10) + rand.nextInt(10) + rand.nextInt(10);
    }


    public String getUserID(){
        return userID;
    }
        }
