public class Lkw extends Fahrzeug {
    private String ladung;

    public Lkw(String ladung, int geschwindigkeit) {
        super(geschwindigkeit);
        this.ladung = ladung;
    }

    public String getLadung(String ladung) {
        return ladung;
    }

    public void setLadung(String ladung) {
        this.ladung = ladung;
    }

    public void allesAusgeben() {
        System.out.println("Anzahl Sitze" + ladung);
        System.out.println("Geschwindigkeit" + geschwindigkeit);
    }
}