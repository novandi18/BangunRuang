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
    final static ArrayList<String> bio = new ArrayList<>();
    final static List<String> jenisPerangkat = new ArrayList<>();
    final static List<String> namaPerangkat = new ArrayList<>();
    final static ArrayList<String> perbaikan = new ArrayList<>();
    final static ArrayList<Integer> hargaPerbaikan = new ArrayList<>();
    
    public static void main(String[] args) throws Exception {
        Form form = new Form();
        Transaksi transaksi = new Transaksi();
        form.Biodata();
        form.FormPerbaikan();
        
        Set<String> setPerangkat = new LinkedHashSet(namaPerangkat);
        ArrayList<String> perangkatFix = new ArrayList(setPerangkat);
        
        System.out.println("");
        System.out.println("======================================");
        System.out.println("|            Rincian Data            |");
        System.out.println("======================================");
        System.out.println("|  Harap ditunjukkan ketika dilokasi |");
        System.out.println("======================================");
        System.out.println("Nama\t\t: " + bio.get(0));
        System.out.println("No HP\t\t: " + bio.get(1));
        System.out.println("Alamat\t\t: " + bio.get(2));
        System.out.println("Barang Diantar\t: " + bio.get(3));
        System.out.println("Kode Transaksi\t: " + bio.get(4));
        System.out.println("Tanggal order\t: " + bio.get(5));
        System.out.println("--------------------------------------");
        
        int totalHarga = 0;
        for(int i = 0; i < namaPerangkat.size(); i++) {
            System.out.println("Perangkat\t: " + namaPerangkat.get(i));
            System.out.println("Jenis Perangkat\t: " + jenisPerangkat.get(i));
            System.out.println("Perbaikan\t: " + perbaikan.get(i));
            System.out.println("Harga\t\t: Rp. " + hargaPerbaikan.get(i));
            totalHarga += hargaPerbaikan.get(i);
            System.out.println("--------------------------------------");
        }
        
        if("Ya".equals(bio.get(3))) {
            if(perangkatFix.size() > 1) {
                int diskon = totalHarga * 5 / 100;
                System.out.println("Anda mendapatkan diskon Rp. " + diskon);
                System.out.println("Ongkir\t\t: Gratis");
                System.out.println("Total\t\t: Rp. " + (totalHarga - diskon));
                System.out.println("======================================");
                System.out.println("");
                transaksi.Pembayaran(totalHarga - diskon);
            } else {
                System.out.println("Ongkir\t\t: + Rp. " + 12000);
                System.out.println("Total\t\t: Rp. " + (totalHarga + 12000));
                System.out.println("======================================");
                System.out.println("");
                transaksi.Pembayaran(totalHarga + 12000);
            } 
        } else {
            System.out.println("Total\t\t: Rp. " + totalHarga);
            System.out.println("======================================");
            System.out.println("");
            transaksi.Pembayaran(totalHarga);
        }
    }
}

