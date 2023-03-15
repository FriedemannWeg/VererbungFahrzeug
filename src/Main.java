public class Main {
    public static void main(String[] args) {
        Pkw p = new Pkw(4, 120);
        Lkw l = new Lkw("Kise", 50);

        System.out.println("Sitze\t" + p.getAnzahlSitze() + "\nGeschwindigkeit\t" + p.getGeschwindigkeit());
        p.setGeschwindigkeit(150);
        System.out.println(p.geschwindigkeit);

        Fahrzeug[] fzarray = new Fahrzeug[2];
        fzarray[0] = p;
        fzarray[1] = l;

        System.out.println(fzarray[0].getGeschwindigkeit());
        System.out.println(((Pkw) fzarray[0]).getAnzahlSitze());

    }
}
