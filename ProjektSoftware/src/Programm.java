import java.io.*;

public class Programm {

    public static void main(String[] args) throws IOException {
        Adresse adresse = new Adresse("1", "1", "1", "1");
        Adresse adresse2 = new Adresse("1", "1", "1", "1");
        Vertragspartner kaeufer = new Vertragspartner("Hi", "du", "69", adresse);
        Vertragspartner verkaeufer = new Vertragspartner("Du", "geiler", "96", adresse2);
        Ware ware1 = new Ware("Schrott für mich glück für dich", "Stück von Darth Vaders originaler Maske", 10);
        ware1.getMaengel().add("fck me");
        ware1.getBesonderheiten().add("hi");
        Kaufvertrag kaufvertrag1 = new Kaufvertrag(verkaeufer, kaeufer, ware1, "Kreditcard");
        System.out.println("\n" +
                verkaeufer +
                "\n" + kaeufer +
                "\n" + ware1 +
                "\n" + kaufvertrag1.getZahlungsArten());
    }
}
