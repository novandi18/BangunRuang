package repairservice;

public class Transaksi extends Main {
    public void Pembayaran(int tagihan) {
        while(true) {
            System.out.println("----------------------------------------------------------------------------------");
            System.out.print("Silahkan masukkan pembayaran anda : Rp. ");
            bayar = key.nextInt();
            if(bayar < tagihan) {
                System.out.println("Maaf uang anda kurang Rp. " + (tagihan - bayar) + ", silahkan masukkan kembali pembayaran anda.");
            } else {
                System.out.println("----------------------------------------------------------------------------------");
                System.out.println("Kembalian anda : Rp. " + (bayar - tagihan));
                System.out.println("==================================================================================");
                System.out.println("|                     Terimakasih sudah menggunakan jasa kami                    |");
                System.out.println("|                    Harap bawa rincian data tersebut dilokasi                   |");
                System.out.println("==================================================================================");
                break;
            }
        }
    }
}
