import java.util.Scanner;

public class Soal_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai: ");
        double nilai = scanner.nextDouble();

        String kategori = "";
        
        if (nilai >= 80.00 && nilai <= 100) {
            kategori = "Nilai A";
        } else if (nilai >= 77.50 && nilai < 80.00) {
            kategori = "Nilai A-";
        } else if (nilai >= 75.00 && nilai < 77.50) {
            kategori = "Nilai A/B";
        } else if (nilai >= 72.50 && nilai < 75.00) {
            kategori = "Nilai B+";
        } else if (nilai >= 70.00 && nilai < 72.50) {
            kategori = "Nilai B";
        } else if (nilai >= 67.50 && nilai < 70.00) {
            kategori = "Nilai B-";
        } else if (nilai >= 65.00 && nilai < 67.50) {
            kategori = "Nilai B/C";
        } else if (nilai >= 62.50 && nilai < 65.00) {
            kategori = "Nilai C+";
        } else if (nilai >= 60.00 && nilai < 62.50) {
            kategori = "Nilai C";
        } else if (nilai >= 55.00 && nilai < 60.00) {
            kategori = "Nilai C-";
        } else if (nilai >= 50.00 && nilai < 55.00) {
            kategori = "Nilai C/D";
        } else if (nilai >= 45.00 && nilai < 50.00) {
            kategori = "Nilai D+";
        } else if (nilai >= 40.00 && nilai < 45.00) {
            kategori = "Nilai D";
        } else if (nilai < 40.00) {
            kategori = "Nilai E";
        }

        System.out.println("Kategori nilai: " + kategori);
    }
}
