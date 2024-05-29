package org.example;

public class BMI {
    private double height = 1.85;
    private double weight = 80;


    private double BMI;

    public double BMIBeregner(){
        BMI = weight / (height * height);
        return BMI;
    }

    public boolean isUnderWeight(){
        BMIBeregner();
        boolean underWeight;
        if (BMI < 18.5) {
        underWeight = true;
        } else {
            underWeight = false;
        }
        return underWeight;
    }

    public boolean isOverWeight(){
        BMIBeregner();
        boolean overWeight;
        if (BMI > 25) {
            overWeight = true;
        } else {
            overWeight = false;
        }
        return overWeight;
    }

    public boolean isNormalWeight(){
        BMIBeregner();
        boolean normalWeight;
        if (BMI > 18 && BMI < 25) {
            normalWeight = true;
        }
        else {
            normalWeight = false;
        }
        return normalWeight;
    }

    public static void main(String[] args) {
        org.example.BMI instansBMI = new BMI();

        instansBMI.isUnderWeight();
        System.out.println(instansBMI.isUnderWeight());

        instansBMI.isOverWeight();
        System.out.println(instansBMI.isOverWeight());

        instansBMI.isNormalWeight();
        System.out.println(instansBMI.isNormalWeight());
    }
}
