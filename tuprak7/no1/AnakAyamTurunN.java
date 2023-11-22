package tuprak7.no1;
import java.util.Scanner;

public class AnakAyamTurunN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah anak ayam: ");
        int n = input.nextInt();
        
        System.out.println("\nLagu Anak Ayam Turun " + n + ":");
        for (int i = n; i >= 1; i--) {
            System.out.println("Anak ayam turunlah " + i + ", mati satu tinggallah " + (i - 1));
        }
        System.out.println("Anak ayam turunlah 0, mati semua, tinggal induknya!");
    }
}