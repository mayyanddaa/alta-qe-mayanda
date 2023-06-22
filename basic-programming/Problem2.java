import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args){
        System.out.println("---Konversi Nilai---");
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan nilai : ");
        int studentScore = input.nextInt();
        if (studentScore >= 80 && studentScore <= 100){
            System.out.println("nilai " + studentScore + " termasuk kategori nilai A");
        } else if (studentScore >= 65 && studentScore <= 79) {
            System.out.println("nilai " + studentScore + " termasuk kategori nilai B+");
        } else if (studentScore >= 50 && studentScore <= 64) {
            System.out.println("nilai " + studentScore + " termasuk kategori nilai B");
        } else if (studentScore >= 35 && studentScore <= 49) {
            System.out.println("nilai " + studentScore + " termasuk kategori nilai C");
        } else {
            System.out.println("nilai " + studentScore + " termasuk kategori nilai D");
        }
    }
}
