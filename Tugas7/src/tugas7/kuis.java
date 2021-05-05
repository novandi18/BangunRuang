package tugas7;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class kuis {
    Scanner key = new Scanner(System.in);
    String bensin, beliLagi;
    int pilihBensin, cashback, jumlah, harga;
    Double liter, beli;
    ArrayList<String> listBBM = new ArrayList<>();
    ArrayList<Double> listLiter = new ArrayList<>();
    ArrayList<Double> listHarga = new ArrayList<>();
    
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.#");
        spbu obj = new spbu();
        obj.Bensin();
        
        System.out.println("");
        obj.jumlah = 0;
        for(int x = 0; x < obj.listHarga.size(); x++) {
            obj.jumlah += obj.listHarga.get(x);
        }
        
        if(obj.jumlah >= 250000) {
            System.out.println("----- Terimakasih sudah membeli BBM di SPBU Serang Raya -----");
            System.out.println("---------------- Anda mendapatkan cashback 5% ---------------");
            System.out.println("-------------------------------------------------------------");
            for(int i = 0; i < obj.listBBM.size(); i++) {
                System.out.println("Jenis BBM\t: " + obj.listBBM.get(i));
                System.out.println("Liter\t\t: " + df.format(obj.listLiter.get(i)) + " Liter");
                System.out.println("Harga\t\t: Rp. " + df.format(obj.listHarga.get(i)));
                System.out.println("-------------------------------------------------------------");
            }
            System.out.println("Cashback\t: Rp. " + df.format(obj.jumlah * 0.05));
            System.out.println("Jumlah\t\t: Rp. " + obj.jumlah);
        } else {
            System.out.println("----- Terimakasih sudah membeli BBM di SPBU Serang Raya -----");
            System.out.println("-------------------------------------------------------------");
            for(int i = 0; i < obj.listBBM.size(); i++) {
                System.out.println("Jenis BBM\t: " + obj.listBBM.get(i));
                System.out.println("Liter\t\t: " + df.format(obj.listLiter.get(i)) + " Liter");
                System.out.println("Harga\t\t: Rp. " + df.format(obj.listHarga.get(i)));
                System.out.println("-------------------------------------------------------------");
            }
            System.out.println("Jumlah\t\t: Rp. " + obj.jumlah);
        }
    }
}
