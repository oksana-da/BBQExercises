package oksana.exercises;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Bouncer {

    public static void main(String[] args) {

        int alter = -1;
        char gender = 'F';
        int gaesteAnzahl = 0;
        int maennerAnzahl = 0;
        final int GAESTENANZAHLMAX = 100;
        final int MAENNERANZAHLMAX = 40;

        do {
            System.out.print("\nWie alt sind Sie? ");
            try {
                alter = new Scanner(System.in).nextInt();
            } catch (InputMismatchException ex) {
                System.out.println("Fehler! Bitte, gib eine Zahl ein.");
            }

            System.out.print("Wählen Sie ihre Gender aus (F/M): ");
            try {
                gender = new Scanner(System.in).next().toUpperCase().charAt(0);
            } catch (InputMismatchException ex) {
                System.out.println("Fehler! Bitte, schreiben Sie 'F' oder 'M'.");
            }

            if (alter < 18) {
                System.out.println("Du darfst hier nicht rein!");
            } else if (alter >= 45) {
                System.out.println("Nur geladene Gäste.");
            } else if (gender == 'F') {
                System.out.println("Du darfst rein und bekommst ein kostenloses Getränk!");
                gaesteAnzahl++;
                System.out.print("Gästeanzahl: " + gaesteAnzahl);
                System.out.println(". MännerAnzahl: " + maennerAnzahl);
            } else if (gender == 'M' && maennerAnzahl < MAENNERANZAHLMAX) {
                System.out.println("Du darfst rein!");
                gaesteAnzahl++;
                System.out.print("GästeAnzahl: " + gaesteAnzahl);
                maennerAnzahl++;
                System.out.println(". MännerAnzahl: " + maennerAnzahl);
            } else if (gender != 'M' && gender != 'F') {
                System.out.println("Fehler! Bitte, schreiben Sie 'F' oder 'M'.");
            } else {
                System.out.println("Du muss leider warten.");
            }
        } while (gaesteAnzahl != GAESTENANZAHLMAX);
    }
}