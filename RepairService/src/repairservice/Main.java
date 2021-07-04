package repairservice;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.LinkedHashSet;

public class Main {
    Scanner key = new Scanner(System.in);
    String nama, noHp, perangkat, alamat, antar, pesanLain;
    int pilihan, bayar;
    String[] jenis = {"Komputer","Smartphone"};
    
    // Menampung data diri, jenis perangkat, nama perangkat, perbaikan, dan harga perbaikan yang dipilih
    final static ArrayList<String> bio = new ArrayList<>();
    final static List<String> jenisPerangkat = new ArrayList<>();
    final static List<String> namaPerangkat = new ArrayList<>();
    final static ArrayList<String> perbaikan = new ArrayList<>();
    final static ArrayList<Integer> hargaPerbaikan = new ArrayList<>();
    
    /*  Menampung cadangan semua data yang nanti akan digunakan untuk pengecekan apakah perbaikan sudah ada atau belum di
        perangkat yang sama  */
    final static ArrayList<String> perangkatCopy = new ArrayList<>();
    final static ArrayList<String> perbaikanCopy = new ArrayList<>();
    final static ArrayList<String> jpCopy = new ArrayList<>();
    final static ArrayList<Integer> hargaCopy = new ArrayList<>();
    
    /*
        Memisahkan perbaikan, jenis, nama dan harga antar perangkat
    */
    final static List<String> trimPerangkat = new ArrayList<>();
    final static List<String> trimPerbaikan = new ArrayList<>();
    final static List<String> trimJP = new ArrayList<>();
    final static List<Integer> trimHarga = new ArrayList<>();
    
    public static void main(String[] args) throws Exception {
        Form form = new Form();
        Transaksi transaksi = new Transaksi();
        form.Biodata();
        form.FormPerbaikan();
        
        /*  Menghapus duplikasi nama perangkat yang ada di array 'namaPerangkat' sehingga kita dapat mengetahui
            jumlah perangkat yang diperbaiki  */
        Set<String> setPerangkat = new LinkedHashSet(namaPerangkat);
        ArrayList<String> perangkatFix = new ArrayList(setPerangkat);
        
        // Rincian data
        System.out.println("");
        System.out.println("==================================================================================");
        System.out.println("|                                 Rincian Data                                   |");
        System.out.println("==================================================================================");
        System.out.println("|                       Harap ditunjukkan ketika dilokasi                        |");
        System.out.println("==================================================================================");
        System.out.println("Nama\t\t: " + bio.get(0));
        System.out.println("No HP\t\t: " + bio.get(1));
        System.out.println("Alamat\t\t: " + bio.get(2));
        System.out.println("Barang Diantar\t: " + bio.get(3));
        System.out.println("Kode Transaksi\t: " + bio.get(4));
        System.out.println("Tanggal order\t: " + bio.get(5));
        System.out.println("----------------------------------------------------------------------------------");
        
        // Menampilkan perangkat yang diperbaiki dan menghitung harga per perbaikannya
        // { a, b, c, ... n } = { a + b + c + ... n }
        int totalHarga = 0;
        for(int i = 0; i < namaPerangkat.size(); i++) {
            System.out.println("Perangkat\t: " + namaPerangkat.get(i));
            System.out.println("Jenis Perangkat\t: " + jenisPerangkat.get(i));
            System.out.println("Perbaikan\t: " + perbaikan.get(i));
            System.out.println("Harga\t\t: Rp. " + hargaPerbaikan.get(i));
            totalHarga += hargaPerbaikan.get(i);
            System.out.println("----------------------------------------------------------------------------------");
        }
        
        // Jika perangkat yang diservice lebih dari 1, maka akan mendapatkan diskon 5% dan gratis ongkir
        if("Ya".equals(bio.get(3))) {
            if(perangkatFix.size() > 1) {
                int diskon = totalHarga * 5 / 100;
                System.out.println("Anda mendapatkan diskon Rp. " + diskon);
                System.out.println("Ongkir\t\t: Gratis");
                System.out.println("Total\t\t: Rp. " + (totalHarga - diskon));
                System.out.println("==================================================================================");
                System.out.println("");
                transaksi.Pembayaran(totalHarga - diskon);
            } else {
                System.out.println("Ongkir\t\t: + Rp. " + 12000);
                System.out.println("Total\t\t: Rp. " + (totalHarga + 12000));
                System.out.println("==================================================================================");
                System.out.println("");
                transaksi.Pembayaran(totalHarga + 12000);
            } 
        } else {
            System.out.println("Total\t\t: Rp. " + totalHarga);
            System.out.println("==================================================================================");
            System.out.println("");
            transaksi.Pembayaran(totalHarga);
        }
    }
}

