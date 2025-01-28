public class Spielfeld {
    // Konstanten
    private static final byte SPALTEN = 7;
    private static final byte ZEILEN = 6;
    private static final char LEERES_SYMBOL = '◌';
    private static final char SYMBOL_1 = '●';
    private static final char SYMBOL_2 = '○';

    // Attribute
    private char[][] spielsteine = new char[ZEILEN][SPALTEN];

    // Konstruktor
    public Spielfeld() {
        for (int zeile = 0; zeile < ZEILEN; zeile++) {
            for (int spalte = 0; spalte < SPALTEN; spalte++) {
                spielsteine[zeile][spalte] = LEERES_SYMBOL;
            }
        }
    }

    // Methoden
    public void anzeigen() {
        for (int zeile = 0; zeile < ZEILEN; zeile++) {
            for (int spalte = 0; spalte < SPALTEN; spalte++) {
                System.out.print(spielsteine[zeile][spalte] + " ");
            }
            System.out.println();
        }
    }

    public int findeFreienPlatz(int spalte) {
        // Überprüft von unten nach oben die erste freie Zeile in der Spalte
        for (int zeile = ZEILEN - 1; zeile >= 0; zeile--) {
            if (spielsteine[zeile][spalte] == LEERES_SYMBOL) {
                return zeile;
            }
        }
        return -1; // Gibt -1 zurück, wenn die Spalte voll ist
    }

    public boolean steinWerfen(int spalte, int spielerID) {
        // Überprüft, ob die Spalte gültig ist
        if (spalte < 0 || spalte >= SPALTEN) {
            System.out.println("Ungültige Spalte. Bitte wähle eine Spalte zwischen 0 und " + (SPALTEN - 1));
            return false;
        }

        // Findet die erste freie Zeile
        int freieZeile = findeFreienPlatz(spalte);
        if (freieZeile == -1) {
            System.out.println("Die Spalte " + spalte + " ist voll. Wähle eine andere Spalte.");
            return false;
        }

        // Legt den Stein basierend auf der Spieler-ID in die Spalte
        spielsteine[freieZeile][spalte] = (spielerID == 1) ? SYMBOL_1 : SYMBOL_2;
        return true;
    }
}

