import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class VierGewinnt {
    public static void main(String[] args) {
        // Durch eine foreach-Schleife wird mit wenig Code ein Programmabschnitt mehrmals ausgeführt.

        String[] player = new String[2];
        Scanner scObj = new Scanner(System.in);

        for (int i = 0; i < player.length; i++) {
            System.out.println("Enter the name of the player: ");
            player[i] = scObj.nextLine();
        }
        for (int i = 1; i < player.length; i++) {
            System.out.println(1 + " Spieler : " + player[i]);
        }

        int[] anzahlSteine = new int[7];
        anzahlSteine(anzahlSteine);



    }

    public static void anzahlSteine(int[] anzahlSteine) {
        for (int j : anzahlSteine) {
            System.out.println(j);
        }
    }
}
