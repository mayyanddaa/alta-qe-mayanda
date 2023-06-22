public class Tabung {
    double jari2;
    double tinggi;

    public Tabung(double jari2, double tinggi) {
        this.jari2 = jari2;
        this.tinggi = tinggi;
    }

    public double volume(){
        double volume = (Math.PI * jari2 * jari2) * tinggi;
        System.out.println("Tabung : " + volume);
        return volume;
    }
}
