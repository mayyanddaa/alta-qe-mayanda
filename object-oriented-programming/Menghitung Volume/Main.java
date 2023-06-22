import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("***Menghitung volume***");
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan sisi kubus : ");
        int sisi = input.nextInt();
        Kubus kubus = new Kubus(sisi);
        System.out.print("masukkan panjang balok : ");
        int panjang = input.nextInt();
        System.out.print("masukkan lebar balok : ");
        int lebar = input.nextInt();
        System.out.print("masukkan tinggi balok : ");
        int tinggi = input.nextInt();
        Balok balok = new Balok(panjang, lebar, tinggi);
        System.out.print("masukkan jari - jari tabung : ");
        double jari2 = input.nextDouble();
        System.out.print("masukkan tinggi tabung : ");
        double tinggiTabung = input.nextDouble();
        Tabung tabung = new Tabung(jari2, tinggiTabung);

        System.out.println("---Volume Bangun Ruang---");
        kubus.volume();
        balok.volume();
        tabung.volume();
    }
}