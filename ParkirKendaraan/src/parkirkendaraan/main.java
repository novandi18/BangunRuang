package parkirkendaraan;
import java.text.DecimalFormat;
import java.util.Scanner;

public class main {
    String pesan;
    Double jam, bayar, kembalian, total, diskon, kurang;
    Scanner key = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat();
    
    public static void main(String[] args) {
        subMain sm = new subMain();
        sm.Transaksi();
        
        if(sm.total > 50000) {
            System.out.println("------- Transaksi anda melebihi Rp. 50000 -------");
            if(sm.pesan.equals("Mobil") || sm.pesan.equals("mobil")) {
                System.out.println("------- Anda mendapatkan cashback 10% -------");
            } else {
                System.out.println("------- Anda mendapatkan cashback 5% -------");
            }
            System.out.println("");
            System.out.println("Pembayaran\t: Rp. " + sm.total);
            System.out.println("Uang anda\t: Rp. " + sm.bayar);
            System.out.println("Cashback anda\t: Rp. " + sm.diskon);
            System.out.println("Kembalian anda\t: Rp. " + sm.kembalian);
            System.out.println("--------------- Terimakasih ----------------");
        } else if(sm.bayar < sm.total) {
            System.out.println("");
            System.out.println("Uang anda kurang\t: Rp. " + sm.kurang);
            System.out.println("--------------- Terimakasih ----------------");
        } else {
            System.out.println("");
            System.out.println("Kembalian anda\t: Rp. " + sm.kembalian);
            System.out.println("--------------- Terimakasih ----------------");
        }
    }
}
