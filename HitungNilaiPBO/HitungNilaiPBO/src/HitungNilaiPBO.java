import java.util.Scanner;

class Mahasiswa {
    String nama;
    String nim;
    double nilaiTubes;
    double nilaiQuiz;
    double nilaiTugas;
    double nilaiUTS;
    double nilaiUAS;
    double totalNilai;
}

public class HitungNilaiPBO {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input dari pengguna
        Scanner input = new Scanner(System.in);

        // Membuat objek Mahasiswa
        Mahasiswa mahasiswa = new Mahasiswa();

        // Memasukkan data dari pengguna
        System.out.print("Nama: ");
        mahasiswa.nama = input.nextLine();
        System.out.print("NIM: ");
        mahasiswa.nim = input.nextLine();
        System.out.print("Nilai Tubes: ");
        mahasiswa.nilaiTubes = input.nextDouble();
        System.out.print("Nilai Quiz: ");
        mahasiswa.nilaiQuiz = input.nextDouble();
        System.out.print("Nilai Tugas: ");
        mahasiswa.nilaiTugas = input.nextDouble();
        System.out.print("Nilai UTS: ");
        mahasiswa.nilaiUTS = input.nextDouble();
        System.out.print("Nilai UAS: ");
        mahasiswa.nilaiUAS = input.nextDouble();

        // Menghitung total nilai berdasarkan rumus yang diberikan
        mahasiswa.totalNilai = (0.30 * mahasiswa.nilaiTubes) + (0.10 * mahasiswa.nilaiQuiz) + (0.10 * mahasiswa.nilaiTugas) + (0.25 * mahasiswa.nilaiUTS) + (0.25 * mahasiswa.nilaiUAS);

        // Menampilkan output
        System.out.println("\nNilai Matakuliah Pemrograman Berorientasi Objek:");
        System.out.println("Nama  : " + mahasiswa.nama);
        System.out.println("NIM   : " + mahasiswa.nim);
        System.out.println("Total Nilai : " + mahasiswa.totalNilai);

        // Menutup objek Scanner
        input.close();
    }
}
