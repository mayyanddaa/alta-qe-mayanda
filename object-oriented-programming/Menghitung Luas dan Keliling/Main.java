import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("***Menghitung Luas dan Keliling***");
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan sisi persegi : ");
        int sisi = input.nextInt();
        Persegi persegi = new Persegi(sisi);
        System.out.print("masukkan alas segitiga : ");
        int alas = input.nextInt();
        System.out.print("masukkan tinggi segitiga : ");
        int tinggi = input.nextInt();
        SegiTiga segiTiga = new SegiTiga(alas,tinggi);
        System.out.print("Masukkan panjang persegi panjang : ");
        int panjang = input.nextInt();
        System.out.print("Masukkan lebar persegi panjang: ");
        int lebar = input.nextInt();
        PersegiPanjang persegiPanjang = new PersegiPanjang(panjang, lebar);

        System.out.println("---Luas Bangun Datar---");
        persegi.luas();
        segiTiga.luas();
        persegiPanjang.luas();

        System.out.println("---Keliling Bangun Datar---");
        persegi.keliling();
        segiTiga.keliling();
        persegiPanjang.keliling();

    }
}