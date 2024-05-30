package org.example;

public class ImageMain {

    public static void main(String[] args) {
        Image instansImage = new Image();

        System.out.println(instansImage.isKnownFileType());

        System.out.println(instansImage.isPortrait());
        System.out.println(instansImage.isLandscape());
    }
}
