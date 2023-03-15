public abstract class Fahrzeug {
    protected int geschwindigkeit;

    public Fahrzeug(int geschwindigkeit) {
        this.geschwindigkeit = geschwindigkeit;
        System.out.println("Konstruktor aus Fahrzeug");
    }

    public int getGeschwindigkeit() {
        return geschwindigkeit;
    }

    public void setGeschwindigkeit(int geschwindigkeit) {
        this.geschwindigkeit = geschwindigkeit;
    }

    public abstract void  allesAusgeben();
}

