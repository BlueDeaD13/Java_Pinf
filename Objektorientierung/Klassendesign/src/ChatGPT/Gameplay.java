package ChatGPT;

import java.util.Scanner;

// Klasse Gameplay
class Gameplay {
    private static String[] spielernamen = new String[2];
    private static Spielfeld feld;

    // Methode: Initialisierung
    public static void init() {
        feld = new Spielfeld();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            System.out.print("Name von Spieler " + (i + 1) + ": ");
            spielernamen[i] = scanner.nextLine();
        }
    }

    // Methode: Spaltenabfrage
    public static int spaltenAbfrage(int spielerID) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print(spielernamen[spielerID] + ", wähle eine Spalte (1-7) oder 0 zum Beenden: ");
            int spalte = scanner.nextInt();
            if (spalte == 0 || (spalte >= 1 && spalte <= 7)) {
                return spalte;
            }
            System.out.println("Ungültige Eingabe! Versuche es erneut.");
        }
    }

    // Main-Methode: Spielablauf
    public static void main(String[] args) {
        init();
        boolean spielLaeuft = true;
        int aktuellerSpieler = 0;

        while (spielLaeuft) {
            feld.anzeigen();
            int spalte = spaltenAbfrage(aktuellerSpieler);
            if (spalte == 0) {
                System.out.println(spielernamen[aktuellerSpieler] + " hat das Spiel beendet.");
                spielLaeuft = false;
                break;
            }
            if (feld.steinEinwerfen(spalte, aktuellerSpieler)) {
                aktuellerSpieler = 1 - aktuellerSpieler; // Wechsel des Spielers
            } else {
                System.out.println("Zug ungültig, versuche es erneut.");
            }
        }
    }
}
