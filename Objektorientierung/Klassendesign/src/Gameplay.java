import java.util.Scanner;

public class Gameplay {
    private static String[] spielernamen = new String[2];
    private static Spielfeld feld;

    public static void init() {
        feld = new Spielfeld();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name von Spieler 1 (X): ");
        spielernamen[0] = scanner.nextLine();
        System.out.print("Name von Spieler 2 (O): ");
        spielernamen[1] = scanner.nextLine();
    }

    public static int spaltenAbfrage(int spielerID) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print(spielernamen[spielerID] + ", wähle eine Spalte (1-7) oder 0 zum Beenden: ");
            int spalte = scanner.nextInt();
            if (spalte == 0) {
                System.out.println("Spiel wird beendet.");
                return 0;
            } else if (spalte >= 1 && spalte <= 7) {
                return spalte;
            } else {
                System.out.println("Ungültige Eingabe! Bitte 1-7 oder 0 eingeben.");
            }
        }
    }

    public static void main(String[] args) {
        init();
        int aktuellerSpieler = 0;
        while (true) {
            feld.anzeigen();
            int spalte = spaltenAbfrage(aktuellerSpieler);
            if (spalte == 0) break;

            if (feld.steinEinwerfen(spalte, aktuellerSpieler)) {
                aktuellerSpieler = 1 - aktuellerSpieler; // Spielerwechsel
            } else {
                System.out.println("Fehler: Spalte nicht verfügbar!");
            }
        }
    }
}