public class Balok {
    int panjang;
    int lebar;
    int tinggi;

    public Balok(int panjang, int lebar, int tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    public int volume(){
        int volume = panjang * lebar * tinggi;
        System.out.println("Balok : " + volume);
        return volume;
    }
}
