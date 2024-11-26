import java.util.Scanner;// Die Scanner-Klasse importieren
public class UserInput {
    public static void main(String[] args) {
        Scanner scObj= new Scanner(System.in);// Scanner-Objekt erzeugen
        System.out.println("Hallo, wer bist du denn?");
        String userName= scObj.nextLine();// User-Input einlesen
        if (userName.isEmpty()) {
            System.out.println("Du musst schon etwas eintippen!");
        } else {
            System.out.println("Willkommen, " + userName + " !");// Name ausgeben
        }

        InputUndWhileSchleife();
    }

    public static void InputUndWhileSchleife () {
        Scanner scObj = new Scanner(System.in);
        String userName;
        do {
            System.out.println("Hallo, wer bist du denn?");
            userName = scObj.nextLine();
            if (userName.isEmpty()) {
                System.out.println("Du musst schon etwas eintipen!");
            }
        } while (userName.isEmpty());
        System.out.println("Willkommen, " + userName + " !");

    }
}
