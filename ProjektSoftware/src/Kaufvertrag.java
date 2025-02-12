public class Kaufvertrag {
    private Vertragspartner verkaeufer;
    private Vertragspartner kaeufer;
    private Ware ware;
    private String zahlungsArten;

    public Kaufvertrag(Vertragspartner verkaeufer, Vertragspartner kaeufer, Ware ware, String zahlungsArten) {
        this.verkaeufer = verkaeufer;
        this.kaeufer = kaeufer;
        this.ware = ware;
        this.zahlungsArten = zahlungsArten;
    }

    @Override
    public String toString() {
        return "Kaufvertrag (" +" "+
                "Verkaeufer: " + verkaeufer +" "+
                "Kaeufer: " + kaeufer +" "+
                "Ware: " + ware +" "+
                "Zahlungsmodalitaeten: " + zahlungsArten + ")";
    }

    public Vertragspartner getVerkaeufer() {
        return verkaeufer;
    }

    public void setVerkaeufer(Vertragspartner verkaeufer) {
        this.verkaeufer = verkaeufer;
    }

    public Vertragspartner getKaeufer() {
        return kaeufer;
    }

    public void setKaeufer(Vertragspartner kaeufer) {
        this.kaeufer = kaeufer;
    }

    public Ware getWare() {
        return ware;
    }

    public void setWare(Ware ware) {
        this.ware = ware;
    }

    public String getZahlungsArten() {
        return zahlungsArten;
    }

    public void setZahlungsArten(String zahlungsArten) {
        this.zahlungsArten = zahlungsArten;
    }
}
