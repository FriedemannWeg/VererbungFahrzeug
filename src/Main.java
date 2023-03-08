public class Main {
    public static void main(String[] args) {
    Pkw p =new Pkw(4, 120);
        System.out.println("Sitze\t"+p.getAnzahlSitze()+"\nGeschwindigkeit\t"+ p.getGeschwindigkeit());
p.setGeschwindigkeit(150);
        System.out.println(p.geschwindigkeit);

    }
}
