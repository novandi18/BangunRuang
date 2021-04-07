package tugas3pbo;
import java.util.Scanner;

public class Kelas2 {
    Scanner key = new Scanner(System.in);
    int diskon, jumlah, total;
    int hargaBarang = 30000;
    
    public void member() {
        System.out.println("------ Selamat Datang ------");
        System.out.println("Harga Hand Sanitizer : Rp. 30.000,-");
        System.out.print("Jumlah yang dibeli : ");
        jumlah = key.nextInt();
        diskon = (hargaBarang * jumlah) * 10 / 100;
        System.out.println("Anda mendapatkan diskon : Rp. " + diskon);
        total = hargaBarang * jumlah - diskon;
        System.out.println("Total keseluruhan : Rp. " + total);
    }
    
    public void nonmember() {
        System.out.println("------ Selamat Datang ------");
        System.out.println("Harga Hand Sanitizer : Rp. 30.000,-");
        System.out.print("Jumlah yang dibeli : ");
        jumlah = key.nextInt();
        System.out.println("Anda tidak mendapatkan diskon karena anda bukan member.");
        total = hargaBarang * jumlah;
        System.out.println("Total keseluruhan : Rp. " + total);
    }
}
