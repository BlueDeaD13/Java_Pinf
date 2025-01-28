package ChatGPT;

// Klasse Spielfeld
public class Spielfeld {
    private char[][] spielsteine;
    private static final int ZEILEN = 6;
    private static final int SPALTEN = 7;
    private static final char LEER = '.';

    // Konstruktor
    public Spielfeld() {
        spielsteine = new char[ZEILEN][SPALTEN];
        for (int i = 0; i < ZEILEN; i++) {
            for (int j = 0; j < SPALTEN; j++) {
                spielsteine[i][j] = LEER;
            }
        }
    }

    // Methode: Spielfeld anzeigen
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
        System.out.println();
    }

    // Methode: Freien Platz in einer Spalte finden
    public int findeFreienPlatz(int spalte) {
        if (spalte < 1 || spalte > SPALTEN) {
            System.out.println("Ungültige Spaltennummer!");
            return -1;
        }
        for (int i = ZEILEN - 1; i >= 0; i--) {
            if (spielsteine[i][spalte - 1] == LEER) {
                return i;
            }
        }
        System.out.println("Spalte " + spalte + " ist voll!");
        return -1;
    }

    // Methode: Stein einwerfen
    public boolean steinEinwerfen(int spalte, int spielerID) {
        int zeile = findeFreienPlatz(spalte);
        if (zeile != -1) {
            char stein = (spielerID == 0) ? 'X' : 'O';
            spielsteine[zeile][spalte - 1] = stein;
            return true;
        }
        return false;
    }
}



