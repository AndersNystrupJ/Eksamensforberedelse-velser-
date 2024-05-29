package org.example;

public class DateAgeCalculator {

    private int yourAge = 30;
    private int dateAge = 23;

    private int lowest = 0;
    public int lowestAcceptableDateAge(){
        lowest = (yourAge / 2) + 7;
        return lowest;
    }

    public String ageTooLow(){
        lowestAcceptableDateAge();
        String tooLowOrOK;
        if (dateAge < lowest) {
            tooLowOrOK = "For ung";
        } else {
            tooLowOrOK = "Ikke for ung";
        }
        return tooLowOrOK;
    }

    public static void main(String[] args) {
        DateAgeCalculator instansDateAgeCalculator = new DateAgeCalculator();
        instansDateAgeCalculator.ageTooLow();
        System.out.println(instansDateAgeCalculator.ageTooLow());

    }
}
