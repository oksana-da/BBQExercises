package oksana.exercises;

import java.util.Scanner;

public class Lift {

    public static void main(String[] args) {

        int etage = 0;
        String meldung = "Fahrstuhl hält: ";
        int etagenummer = 0;

        Scanner eingabe = new Scanner(System.in);
        System.out.print("Wo fahren Sie hin: ");
        etagenummer = eingabe.nextInt();

        switch (etagenummer) {
            case 0:
                System.out.println(meldung + " Erdgeschoss");
                break;
            case 1:
                System.out.println(meldung + "1. Obergeschoss");
                break;
            case 2:
                System.out.println(meldung + "2. Obergeschoss");
                break;
            case 3:
                System.out.println(meldung + "Dachgeschoss");
                break;
            default:
                System.out.println("Eingabefehler");
                break;
        }
    }
}
