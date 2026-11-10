import java.util.Scanner;

public class Tugas1 {
    static void genapGanjil(Scanner in) {
        System.out.print("Masukkan angka = ");
        int n = in.nextInt();
        System.out.println(n % 2 == 0 ? n + " adalah Genap" : n + " adalah Ganjil");
    }
}
