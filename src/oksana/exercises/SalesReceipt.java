package oksana.exercises;

public class SalesReceipt {

    public static void main(String[] args) {

        int wurstAnzahl = 1;
        int kaeseAnzahl = 1;
        int brotAnzahl = 1;
        int dVdAnzahl = 2;

        double wurstPreis = 4.20;
        double kaesePreis = 2.30;
        double brotPreis = 2.10;
        double dvdPreis = 4.20;

        double briefTasche = 200;
        double rest;

        double wurstGesamtPreis = wurstAnzahl * wurstPreis;
        double kaeseGesamtPreis = kaeseAnzahl * kaesePreis;
        double brotGesamtPreis = brotAnzahl * brotPreis;
        double dvdGesamtPreis = dVdAnzahl * dvdPreis;

        double gesamtPreis = wurstGesamtPreis + kaeseGesamtPreis + brotGesamtPreis + dvdGesamtPreis;

        if (gesamtPreis > briefTasche) {
            rest = gesamtPreis - briefTasche;
            System.out.println(("Sie haben nicht genug Geld in Ihrer Brieftasche. " + rest + " EUR fehlen."));
        } else {
            rest = briefTasche - gesamtPreis;
            System.out.println(String.format("%-9s %2d x %5.2f EUR", "Wurst", wurstAnzahl, wurstPreis));
            System.out.println(String.format("%30.2f EUR", wurstGesamtPreis));
            System.out.println(String.format("%-9s %2d x %5.2f EUR", "Käse", kaeseAnzahl, kaesePreis));
            System.out.println(String.format("%30.2f EUR", kaeseGesamtPreis));
            System.out.println(String.format("%-9s %2d x %5.2f EUR", "Brot", brotAnzahl, brotPreis));
            System.out.println(String.format("%30.2f EUR", brotGesamtPreis));
            System.out.println(String.format("%-9s %2d x %5.2f EUR", "DVD", dVdAnzahl, dvdPreis));
            System.out.println(String.format("%30.2f EUR", dvdGesamtPreis));
            System.out.println("__________________________________");
            System.out.print("Gesamt");
            System.out.println(String.format("%24.2f EUR", gesamtPreis));
            System.out.print("Gegeben");
            System.out.println(String.format("%23.2f EUR", briefTasche));
            System.out.println(" ");
            System.out.print("Zurück");
            System.out.println(String.format("%24.2f EUR", rest));
        }
    }
}

