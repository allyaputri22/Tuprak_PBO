package tuprak7.no2;

import java.util.Scanner;

public class TabelPerkalian {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai n (<= 10): ");
        int n = scanner.nextInt();

        if (n <= 10) {
            System.out.println("Tabel Perkalian " + n + " x " + n + ":");

            // Header
            System.out.print("  |");
            for (int i = 1; i <= n; i++) {
                System.out.printf("%4d", i);
            }
            System.out.println("\n--------------------------------------------");

            // Isi Tabel
            for (int i = 1; i <= n; i++) {
                System.out.print(i + " |");
                for (int j = 1; j <= n; j++) {
                    System.out.printf("%4d", i * j);
                }
                System.out.println();
            }
        } else {
            System.out.println("Masukkan nilai n kurang dari atau sama dengan 10.");
        }
    }
}