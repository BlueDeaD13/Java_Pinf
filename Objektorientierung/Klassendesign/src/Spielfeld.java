public class Spielfeld {
    private char[][] spielsteine;
    private static final int ZEILEN = 6;
    private static final int SPALTEN = 7;
    private static final char LEER = '-';
    private static final char SPIELER1 = 'X';
    private static final char SPIELER2 = 'O';

    public Spielfeld() {
        spielsteine = new char[ZEILEN][SPALTEN];
        for (int i = 0; i < ZEILEN; i++) {
            for (int j = 0; j < SPALTEN; j++) {
                spielsteine[i][j] = LEER;
            }
        }
    }

    public void anzeigen() {
        for (int i = 0; i < ZEILEN; i++) {
            for (int j = 0; j < SPALTEN; j++) {
                System.out.print(spielsteine[i][j] + " ");
            }
            System.out.println();
        }
        for (int j = 1; j <= SPALTEN; j++) {
            System.out.print(j + " ");
        }
        System.out.println("\n");
    }

    public int findeFreienPlatz(int spalte) {
        if (spalte < 1 || spalte > SPALTEN) {
            System.out.println("Fehler: Ungültige Spalte!");
            return -1;
        }
        for (int i = ZEILEN - 1; i >= 0; i--) {
            if (spielsteine[i][spalte - 1] == LEER) {
                return i;
            }
        }
        System.out.println("Fehler: Spalte ist voll!");
        return -1;
    }

    public boolean steinEinwerfen(int spalte, int spielerID) {
        int zeile = findeFreienPlatz(spalte);
        if (zeile == -1) return false;
        spielsteine[zeile][spalte - 1] = (spielerID == 0) ? SPIELER1 : SPIELER2;
        return true;
    }
}

