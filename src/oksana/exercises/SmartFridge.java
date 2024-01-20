package oksana.exercises;
import java.util.Scanner;

public class SmartFridge {

    public static void main(String[] args) {

        //Zum Anfang ist der Kühlschrank leer.

        //Das sind die Preise (Zum Beispiel, die kommen aus dem Internet-Shop, wo der Kühlschrank Waren einkauft).
        double wurstPreis = 4.20;
        double kaesePreis = 2.30;
        double brotPreis = 1;
        double durchschnittPreis = (wurstPreis + kaesePreis + brotPreis) / 3;

        //Ich plane 1 Mal pro Woche einkaufen. Das ist die Liste für jede Woche und Preise.
        int wurstMax;
        int kaeseMax;
        int brotMax;

        int wurstKaufen;
        int kaeseKaufen;
        int brotKaufen;

        double wurstGesamtPreis;
        double kaeseGesamtPreis;
        double brotGesamtPreis;

        //Produkte, die man aus dem Kühlschrank nimmt.
        int wurstGegessen;
        int kaeseGegessen;
        int brotGegessen;

        //Mein Budget für eine Woche. Beim Online-Kauf gib es kein Rest.
        double budget;
        double gesamtKaufPreis;
        double geldFehlt;

        boolean kuelschrankFunkzioniert = true;
        char auswahl;

        Scanner eingabe = new Scanner(System.in);

        System.out.println("WELCOME! Ich bin der Smart-Kühlschrank und werde dir Lebensmittel rechtzeitig und " +
                "regelmäßig kaufen \uD83D\uDC4C");
        System.out.println("Du hast eine Basis-Option: Produkte werden jeder Woche gekauft werden.");
        System.out.println("\nMomentan ist der Kühlschrank leer. " +
                "Erstell bitte eine wöchentliche Eikaufsliste für jede Woche.");
        //Hier kann mann Produkte im Internet-Shop auswählen.

        do {
            System.out.print("Wie viel Wurst (4.20 EUR): ");
            wurstMax = eingabe.nextInt();
            System.out.print("Wie viel Käse (2.30 EUR): ");
            kaeseMax = eingabe.nextInt();
            System.out.print("Wie viel Brot (1 EUR): ");
            brotMax = eingabe.nextInt();


            budget = (wurstMax * wurstPreis) + (kaeseMax * kaesePreis) + (brotMax * brotPreis);

            System.out.print("Gesamtpreis ist " + budget + "\nEs wird dein Budget für jede Woche. " +
                    "Bist du einverstanden? (J/N): ");
            auswahl = eingabe.next().toUpperCase().charAt(0);

            if (auswahl != 'J') {
                System.out.println("Korrigiere die Produktanzahl:");
            }

        } while (auswahl != 'J');

        System.out.println("\nSuper! Dein wöchentliches Budget ist: " + budget + " EUR.");
        System.out.println("\uD83C\uDF53 Ich habe Lebensmittel bestellt, und die Lieferung ist shon morgen!");

        wurstGesamtPreis = wurstMax * wurstPreis;
        kaeseGesamtPreis = kaeseMax * kaesePreis;
        brotGesamtPreis = brotMax * brotPreis;
        gesamtKaufPreis = (wurstMax * wurstPreis) + (kaeseMax * kaesePreis) + (brotMax * brotPreis);

        System.out.println("Dein Kassenbon:");
        System.out.println(String.format("%-9s %2d x %5.2f EUR", "Wurst", wurstMax, wurstPreis));
        System.out.println(String.format("%30.2f EUR", wurstGesamtPreis));
        System.out.println(String.format("%-9s %2d x %5.2f EUR", "Käse", kaeseMax, kaesePreis));
        System.out.println(String.format("%30.2f EUR", kaeseGesamtPreis));
        System.out.println(String.format("%-9s %2d x %5.2f EUR", "Brot", brotMax, brotPreis));
        System.out.println(String.format("%30.2f EUR", brotGesamtPreis));
        System.out.println("__________________________________");
        System.out.print("Gesamt");
        System.out.println(String.format("%24.2f EUR", gesamtKaufPreis));


        do {
            //Man nimmt Produkte aus dem Kühlschrank.
            System.out.println("\n\n(Eine Woche später). Was hast du die Woche gegessen: ");
            System.out.print("Wurst (0-" + wurstMax + "): ");
            wurstGegessen = eingabe.nextInt();
            System.out.print("Käse (0-" + kaeseMax + "): ");
            kaeseGegessen = eingabe.nextInt();
            System.out.print("Brot: (0-" + brotMax + "): ");
            brotGegessen = eingabe.nextInt();

            wurstKaufen = wurstMax - (wurstMax - wurstGegessen);
            kaeseKaufen = kaeseMax - (kaeseMax - kaeseGegessen);
            brotKaufen = brotMax - (brotMax - brotGegessen);

            double wurstPreisNeu = 4.20;
            double kaesePreisNeu = 2.30;
            double brotPreisNeu = 1;
            double durchschnittPreisNeu = (wurstPreisNeu + kaesePreisNeu + brotPreisNeu) / 3;

            wurstGesamtPreis = wurstKaufen * wurstPreisNeu;
            kaeseGesamtPreis = kaeseKaufen * kaesePreisNeu;
            brotGesamtPreis = brotKaufen * brotPreisNeu;
            gesamtKaufPreis = wurstGesamtPreis + kaeseGesamtPreis + brotGesamtPreis;

            if (gesamtKaufPreis > budget) {
                geldFehlt = gesamtKaufPreis - budget;
                System.out.println("\nDie Preise wurden gestiegen! Du hast nicht genug Geld. " + geldFehlt + " EUR " +
                        "fehlen.\nWas willst du machen: entweder das Budget erhöhen oder die Einkaufliste " +
                        "korrigieren... AUSWAHL...");
            } else if (gesamtKaufPreis == budget) {
                if (durchschnittPreisNeu > durchschnittPreisNeu) {
                    System.out.println("Achtung! Die Preise sind gestiegen.");
                }
                System.out.println("\nHi! Frische Produkte \uD83C\uDF53 kommen zu dir schon morgen!");
                System.out.println("Dein Kassenbon");
                System.out.println(String.format("%-9s %2d x %5.2f EUR", "Wurst", wurstKaufen, wurstPreisNeu));
                System.out.println(String.format("%30.2f EUR", wurstGesamtPreis));
                System.out.println(String.format("%-9s %2d x %5.2f EUR", "Käse", kaeseKaufen, kaesePreisNeu));
                System.out.println(String.format("%30.2f EUR", kaeseGesamtPreis));
                System.out.println(String.format("%-9s %2d x %5.2f EUR", "Brot", brotKaufen, brotPreisNeu));
                System.out.println(String.format("%30.2f EUR", brotGesamtPreis));
                System.out.println("__________________________________");
                System.out.print("Gesamt");
                System.out.println(String.format("%24.2f EUR", gesamtKaufPreis));
            } else {
                System.out.println("\nBei mir sind noch Lebensmittel übrig. Deswegen habe ich weniger bestellt." +
                        "\nIch empfehle Einkaufliste zu korregieren, um Lebensmittel nicht wegzuwerfen und Geld zu sparen.");
                if (durchschnittPreisNeu > durchschnittPreisNeu) {
                    System.out.println("Achtung! Die Preise sind gestiegen.");
                }
                System.out.println("Dein Kassenbon:");
                System.out.println(String.format("%-9s %2d x %5.2f EUR", "Wurst", wurstKaufen, wurstPreisNeu));
                System.out.println(String.format("%30.2f EUR", wurstGesamtPreis));
                System.out.println(String.format("%-9s %2d x %5.2f EUR", "Käse", kaeseKaufen, kaesePreisNeu));
                System.out.println(String.format("%30.2f EUR", kaeseGesamtPreis));
                System.out.println(String.format("%-9s %2d x %5.2f EUR", "Brot", brotKaufen, brotPreisNeu));
                System.out.println(String.format("%30.2f EUR", brotGesamtPreis));
                System.out.println("__________________________________");
                System.out.print("Gesamt");
                System.out.println(String.format("%24.2f EUR", gesamtKaufPreis));
            }
        } while (kuelschrankFunkzioniert == true);
    }
}
