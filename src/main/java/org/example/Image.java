package org.example;

public class Image {
    private String fileName = "Mona_Lisa.jpeg";
    private double width = 85.00;
    private double height = 58.5;

    /*
    public boolean isKnownFileType(){
        boolean known;
        if (fileName.endsWith(".gif") || fileName.endsWith(".jpg") || fileName.endsWith(".jpeg") || fileName.endsWith(".png") || fileName.endsWith(".webp") || fileName.endsWith(".bmp")){
           known = true;
        } else {
            known = false;
        }
        return known;
    }
     */

    public boolean isKnownFileType(){
        boolean known;
        try {
            String[] filnavn = fileName.split("\\.");
            if (filnavn[1].equalsIgnoreCase("gif") || filnavn[1].equalsIgnoreCase("jpg") || filnavn[1].equalsIgnoreCase("jpeg") || filnavn[1].equalsIgnoreCase("png") || filnavn[1].equalsIgnoreCase("webp") || filnavn[1].equalsIgnoreCase("bmp")) {
                known = true;
            } else {
                known = false;
            }
        } catch (Exception e) {
            known = false;
        }

            return known;
    }



    public boolean isPortrait(){
        boolean portrait;
        if (height > width) {
            portrait = true;
        } else {
            portrait = false;
        }
        return portrait;
    }

    public boolean isLandscape(){
        boolean landscape;
        if (height < width) {
            landscape = true;
        } else {
            landscape = false;
        }
        return landscape;
    }



}
