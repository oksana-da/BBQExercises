package oksana.exercises;

public class Canister {

    public static void main(String[] args) {

        double fassungsVermoegen = 47.6;
        double behaelterHat = 0;
        double krug = 0.25;
        int kruegeAnzahl = 0;


        while (behaelterHat <= fassungsVermoegen - krug){
            behaelterHat += krug;
            kruegeAnzahl ++;
            System.out.println(kruegeAnzahl + " Mal - " + behaelterHat + "Liter");
        }

        System.out.println("In Behälter " + behaelterHat + " Liter (" + kruegeAnzahl + " Krüge).");
    }
}
