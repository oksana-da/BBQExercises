package oksana.exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Battery {

    public static void main(String[] args) {

        String geraeteTyp;
        int akkuLadestand = -1;

        Scanner eingabe = new Scanner(System.in);

        try {
            System.out.print("Gib deinen Gerätetyp ein: ");
            geraeteTyp = eingabe.next();
            System.out.print("Gib deine Ladestand in % ein: ");
            akkuLadestand = eingabe.nextInt();

            if (akkuLadestand >= 0 && akkuLadestand < 25) {
                System.out.println("ROT");
            } else if (akkuLadestand >= 25 && akkuLadestand < 50) {
                System.out.println("GELB");
            } else if (akkuLadestand >= 50 && akkuLadestand < 75) {
                System.out.println("GRÜN");
            } else if (akkuLadestand <= 100) {
                System.out.println("dein Gerät ist vollgeladen");
            } else {
                System.out.println("Dein Gerät ist kaputt oder du hast falsche Daten eingegeben.");
            }
        } catch (InputMismatchException ex) {
            System.out.println("Dein Gerät ist kaputt oder du hast falsche Daten eingegeben.");
        }
    }
}