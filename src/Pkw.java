public class Pkw extends Fahrzeug {
    private int anzahlSitze;

    public Pkw(int anzahlSitze, int geschwindigkeit) {
        // Konstruktor der Oberklasse aufrufen
        super(geschwindigkeit);
        this.anzahlSitze = anzahlSitze;
        System.out.println("Konstuktor aus Pkw");
    }

    public int getAnzahlSitze() {
        return anzahlSitze;
    }

    public void setAnzahlSitze(int anzahlSitze) {
        this.anzahlSitze = anzahlSitze;
    }

    public void allesAusgeben() {
        System.out.println("Anzahl Sitze" + anzahlSitze);
        System.out.println("Geschwindigkeit" + geschwindigkeit);
    }
}
