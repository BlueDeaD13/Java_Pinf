import java.util.Scanner;

public class VierGewinnt {
    public static void main(String[] args) {
        // (a) Spieler-Namen einlesen und speichern
        Scanner scanner = new Scanner(System.in);
        String[] spieler = new String[2];

        do {
            System.out.println("Spieler 1, bitte geben Sie Ihren Namen ein:");
            spieler[0] = scanner.nextLine();

            System.out.println("Spieler 2, bitte geben Sie Ihren Namen ein:");
            spieler[1] = scanner.nextLine();

        } while (spieler[0].isEmpty() || spieler[1].isEmpty());

        // (b) Array für Anzahl der Steine in jeder Spalte
        int[] anzahlSteine = new int[7];

        boolean spielLaeuft = true;
        int aktuellerSpieler = 0;

        while (spielLaeuft) {
            // Aktuellen Stand der Spalten ausgeben
            System.out.println("Aktueller Stand der Spalten:");
            for (int i = 0; i < anzahlSteine.length; i++) {
                System.out.println("Spalte " + (i + 1) + ": " + anzahlSteine[i] + " Steine");
            }

            // (c) Spieler nach Spalte fragen
            System.out.println(spieler[aktuellerSpieler] + ", in welche Spalte möchten Sie Ihren Stein werfen? (1-7, 0 zum Beenden):");
            String eingabe = scanner.nextLine();

            try {
                int spalte = Integer.parseInt(eingabe);

                if (spalte == 0) {
                    System.out.println("Spiel beendet. Vielen Dank fürs Spielen!");
                    spielLaeuft = false;
                } else if (spalte < 1 || spalte > 7) {
                    System.out.println("Ungültige Eingabe! Bitte wählen Sie eine Zahl zwischen 1 und 7.");
                } else if (anzahlSteine[spalte - 1] >= 6) { // (d) Spalte prüfen
                    System.out.println("Diese Spalte ist voll! Bitte wählen Sie eine andere Spalte.");
                } else {
                    // Stein hinzufügen
                    anzahlSteine[spalte - 1]++;
                    // Spieler wechseln
                    aktuellerSpieler = 1 - aktuellerSpieler;
                }
            } catch (NumberFormatException e) {
                System.out.println("Ungültige Eingabe! Bitte geben Sie eine Zahl ein.");
            }
        }

        scanner.close();
    }
}
