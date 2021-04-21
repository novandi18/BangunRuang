package travel;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Travel {
    Scanner key = new Scanner(System.in);
    String pilih;
    int kembalian, bayar, jumlah, total;
    
    public void Transaksi() {
        System.out.println("---------- Selamat Datang para Traveler ----------");
        System.out.println("Silahkan pilih menu perjalanan anda :");
        System.out.println("1. Paket A : Perjalanan dari Serang ke Bandung (Rp. 100.000,-)");
        System.out.println("2. Paket B : Perjalanan dari Serang ke Cirebon (Rp. 175.000,-)");
        System.out.println("3. Paket C : Perjalanan dari Serang ke Yogyakarta (Rp. 320.000,-)");
        System.out.println("4. Paket D : Perjalanan dari Serang ke Surabaya (Rp. 475.000,-)");
        System.out.println("");
        
        boolean check = true;
        while(check) {
            System.out.print("Masukkan Rute yang anda tuju : ");
            pilih = key.nextLine();
            switch(pilih) {
                case "Bandung":
                    check = false;
                    PaketA();
                    break;
                case "Cirebon":
                    check = false;
                    PaketB();
                    break;
                case "Yogyakarta":
                    check = false;
                    PaketC();
                    break;
                case "Surabaya":
                    check = false;
                    PaketD();
                    break;
                default:
                    System.out.println("Rute yang anda tuju tidak ditemukan.");
                    break;
            }
            
            if(check == false) {
                break;
            }
        }
    }
    
    public void PaketA() {
        System.out.println("----------------- Menu Transaksi -----------------");
        System.out.println("Anda memilih Rute Serang ke Bandung (Rp. 100.000,-)");
        while(true) {
            try {
                System.out.print("Masukkan jumlah tiket yang ingin dibeli : ");
                jumlah = key.nextInt();
                total = 100000 * jumlah;
                System.out.println("Total Tagihan Anda : Rp. " + total);
                break;
            } catch(InputMismatchException tpa) {
                System.out.println("Inputan harus berupa angka.");
                key.next();
            }
        }
        
        while(true) {
            try {
                System.out.print("Silahkan masukkan pembayaran anda : Rp. ");
                bayar = key.nextInt();
                kembalian = bayar - total;
                System.out.println("Kembalian Anda : Rp. " + kembalian);
                System.out.println("------------ Terimakasih sudah memesan! ----------");
                break;
            } catch(InputMismatchException kpa) {
                System.out.println("Inputan harus berupa angka.");
                key.next();
            }
        }
    }
    
    public void PaketB() {
        System.out.println("----------------- Menu Transaksi -----------------");
        System.out.println("Anda memilih Rute Serang ke Cirebon (Rp. 175.000,-)");
        while(true) {
            try {
                System.out.print("Masukkan jumlah tiket yang ingin dibeli : ");
                jumlah = key.nextInt();
                total = 175000 * jumlah;
                System.out.println("Total Tagihan Anda : Rp. " + total);
                break;
            } catch(InputMismatchException tpb) {
                System.out.println("Inputan harus berupa angka.");
                key.next();
            }
        }
        
        while(true) {
            try {
                System.out.print("Silahkan masukkan pembayaran anda : Rp. ");
                bayar = key.nextInt();
                kembalian = bayar - total;
                System.out.println("Kembalian Anda : Rp. " + kembalian);
                System.out.println("------------ Terimakasih sudah memesan! ----------");
                break;
            } catch(InputMismatchException kpb) {
                System.out.println("Inputan harus berupa angka.");
                key.next();
            }
        }
    }
    
    public void PaketC() {
        System.out.println("----------------- Menu Transaksi -----------------");
        System.out.println("Anda memilih Rute Serang ke Yogyakarta (Rp. 320.000,-)");
        while(true) {
            try {
                System.out.print("Masukkan jumlah tiket yang ingin dibeli : ");
                jumlah = key.nextInt();
                total = 320000 * jumlah;
                System.out.println("Total Tagihan Anda : Rp. " + total);
                break;
            } catch(InputMismatchException tpc) {
                System.out.println("Inputan harus berupa angka.");
                key.next();
            }
        }
        
        while(true) {
            try {
                System.out.print("Silahkan masukkan pembayaran anda : Rp. ");
                bayar = key.nextInt();
                kembalian = bayar - total;
                System.out.println("Kembalian Anda : Rp. " + kembalian);
                System.out.println("------------ Terimakasih sudah memesan! ----------");
                break;
            } catch(InputMismatchException kpc) {
                System.out.println("Inputan harus berupa angka.");
                key.next();
            }
        }
    }
    
    public void PaketD() {
        System.out.println("----------------- Menu Transaksi -----------------");
        System.out.println("Anda memilih Rute Serang ke Surabaya (Rp. 475.000,-)");
        while(true) {
            try {
                System.out.print("Masukkan jumlah tiket yang ingin dibeli : ");
                jumlah = key.nextInt();
                total = 475000 * jumlah;
                System.out.println("Total Tagihan Anda : Rp. " + total);
                break;
            } catch(InputMismatchException tpd) {
                System.out.println("Inputan harus berupa angka.");
                key.next();
            }
        }
        
        while(true) {
            try {
                System.out.print("Silahkan masukkan pembayaran anda : Rp. ");
                bayar = key.nextInt();
                kembalian = bayar - total;
                System.out.println("Kembalian Anda : Rp. " + kembalian);
                System.out.println("------------ Terimakasih sudah memesan! ----------");
                break;
            } catch(InputMismatchException kpd) {
                System.out.println("Inputan harus berupa angka.");
                key.next();
            }
        }
    }
    
    public static void main(String[] args) {
        Travel obj = new Travel();
        obj.Transaksi();
    }
}
