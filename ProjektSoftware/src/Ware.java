import java.util.ArrayList;

public class Ware {
    private String bezeichnung;
    private String beschreibung;
    private double preis;
    private ArrayList<String> besonderheiten;
    private ArrayList<String> maengel;

    public Ware(String bezeichnung, String beschreibung, double preis) {
        this.bezeichnung = bezeichnung;
        this.beschreibung = beschreibung;
        this.preis = preis;
        this.besonderheiten = new ArrayList<>();
        this.maengel = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Ware (" + " "+
                "Bezeichnung: " + bezeichnung +" "+
                "Beschreibung: " + beschreibung +" "+
                "Preis: " + preis + " "+
                "Besonderheiten: " + besonderheiten +" "+
                "Maengel: " + maengel + ")";
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public ArrayList<String> getBesonderheiten() {
        return besonderheiten;
    }

    public ArrayList<String> getMaengel() {
        return maengel;
    }
}
