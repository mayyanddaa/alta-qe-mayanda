import java.util.Scanner;
public class Problem1 {
    public static void main(String[] args) {
        System.out.println("---Menghitung Luas Segitiga---");
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan alas = ");
        Float alas = input.nextFloat();
        System.out.print("masukkan tinggi = ");
        Float tinggi = input.nextFloat();
        Float luas = (alas * tinggi) / 2;
        System.out.print("luas segitiga = " + luas);
    }
}