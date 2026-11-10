import java.util.Scanner;

public class Tugas2 {
    static void positifNegatif(Scanner in) {
        System.out.print("Masukkan angka = ");
        double n = in.nextDouble();
        if (n > 0) {
            System.out.println("Positif");
        } else if (n < 0) {
            System.out.println("Negatif");
        } else {
            System.out.println("Nol");
        }
    }

}
