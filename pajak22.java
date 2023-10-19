
import java.util.Scanner;

public class pajak22 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("== UTS PRAKTIKUM DASAR PEMROGRAMAN TI-1F ==");
        System.out.println("Nama : Rafiqo Adib Destarachmad ");
        System.out.println("NIM : 2341720214");
        System.out.println("Kelas/Absen : 1F/22 ");

        System.out.print("Apakah Anda memiliki usaha? (y/tdk): ");
        String memilikiUsaha = scanner.nextLine();

        double penghasilan = 0;
        if (memilikiUsaha.equalsIgnoreCase("ya")) {
            System.out.print("Masukkan penghasilan dalam 1 tahun: ");
            penghasilan = scanner.nextDouble();
            scanner.nextLine();
        }
        double pajakPenghasilan = 0.15 * penghasilan;
        System.out.print("Masukkan jenis harta kekayaan yang Anda miliki: ");
        int jumlahHarta = scanner.nextInt();
        scanner.nextLine();
        double totalHarta = 0;
        for (int i = 0; i < jumlahHarta; i++) {
            System.out.print("Masukkan nama harta " + (i + 1) + ": ");
            String namaHarta = scanner.nextLine();
            System.out.print("Masukkan nilai jual " + namaHarta + ": ");
            double nilaiJual = scanner.nextDouble();
            scanner.nextLine();

            totalHarta += nilaiJual;
        }

        System.out.print("Apakah Anda sudah memiliki keluarga? (y/tk): ");
        String berkeluarga = scanner.nextLine();

        double potonganPajak = 0;
        if (berkeluarga.equalsIgnoreCase("ya")) {
            System.out.println("Berapa anak Anda yang kuliah?");
            int anakKuliah = scanner.nextInt();

            System.out.println("Berapa anak Anda yang SMA?");
            int anakSMA = scanner.nextInt();

            if (anakKuliah == 1 && anakSMA == 1 && totalHarta >= 50000000) {
                potonganPajak = 0.10;
            } else if (anakKuliah == 0 && anakSMA == 0 && totalHarta < 50000000) {
                potonganPajak = 0.05;
            }
        }

        double totalPajak = (pajakPenghasilan + totalHarta) * (1 - potonganPajak);
        double hartaKeseluruhan = (penghasilan + totalHarta);
        double hartaSetelahPajak = (hartaKeseluruhan - totalPajak);

        System.out.printf("\nJumlah harta anda sebelum terkena pajak adalah: Rp %.0f\n", hartaKeseluruhan);
        System.out.printf("Total pajak yang harus anda bayar sebesar Rp %.0f\n", totalPajak);
        System.out.printf("Jumlah harta anda setelah terkena pajak adalah: Rp %.0f\n", hartaSetelahPajak);
    }
}