package org.example;

public class UserMain {
    public static void main(String[] args) {

        User instansUser = new User("Anders Jensen");

        instansUser.createUserID();
        System.out.println(instansUser.validUserID());
        System.out.println(instansUser.getUserID());

    }
}
