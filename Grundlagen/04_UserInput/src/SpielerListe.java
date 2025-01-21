import java.util.ArrayList; // Importiert die Klasse ArrayList
import java.util.Scanner;

public class SpielerListe {
    public static void main(String[] args) {
    // Erzeuge eine Array-Liste:
        ArrayList<String> playerNames = new ArrayList<>();
        Scanner scObj = new Scanner(System.in);
        String userName;
        do {
            System.out.println("Hallo, wer bist du denn?");
            userName = scObj.nextLine();
            if (userName.isEmpty()) {
                System.out.println("Spielerliste ist Fertig");
            } else {
                System.out.println("Willkommen, " + userName + " !");
                playerNames.add(userName);
            }
        } while (!userName.isEmpty());
        for (int i = 0; i < playerNames.size(); i++) {
            System.out.println(playerNames.indexOf(playerNames.get(i+1)) + " Spieler : " + playerNames.get(i));
        }
    }
}
