package tuprak7.no1;

import java.util.Scanner;

public class BilGanjilGenap {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int awal, akhir;

        // Input
        System.out.print("Masukkan Angka Awal  : ");
        awal = input.nextInt();
        System.out.print("Masukkan Angka Akhir : ");
        akhir = input.nextInt();

        // Output
        System.out.println("Angka Awal  : " + awal);
        System.out.println("Angka Akhir : " + akhir);

        int pilihan;
        do {
            System.out.println("\nPilih output:");
            System.out.println("1. Ganjil");
            System.out.println("2. Genap");
            System.out.println("3. Semua");
            System.out.println("4. Keluar Program");

            System.out.print("Masukkan pilihan (1-4): ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    int i = awal;
                    do {
                        if (i % 2 != 0) {
                            System.out.println(i);
                        }
                        i++;
                    } while (i <= akhir);
                    break;

                case 2:
                    int j = awal;
                    do {
                        if (j % 2 == 0) {
                            System.out.println(j);
                        }
                        j++;
                    } while (j <= akhir);
                    break;

                case 3:
                    int k = awal;
                    do {
                        System.out.println(k);
                        k++;
                    } while (k <= akhir);
                    break;

                case 4:
                    System.out.println("Keluar Program. Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Harap masukkan angka 1-4.");
            }

        } while (pilihan != 4);
    }
}
