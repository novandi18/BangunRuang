package tugas4;
import java.util.*;
public class Tugas4 {
    // Variabel
    int kembalian, pilihan, jumlah, total, bayar, kurang;
    String nama, pilihanKey;
    
    // Scanner
    Scanner key = new Scanner(System.in);
    
    public static void main(String[] args) {
        Tugas4 obj = new Tugas4();
        obj.transaksi();
    }
    
    public void transaksi() {
        // List Barang
        HashMap<String, Integer> barangList = new HashMap<>();
        HashMap<String, Integer> listPesanan = new HashMap<>();
        String[] barang = {"Spidol","Pulpen","Pensil","Penggaris","Tipe-X"};
        barangList.put(barang[0], 5000);
        barangList.put(barang[1], 3000);
        barangList.put(barang[2], 1000);
        barangList.put(barang[3], 2500);
        barangList.put(barang[4], 4000);
        
        System.out.println("====================================");
        System.out.println("|          Toko Alat Tulis         |");
        System.out.println("====================================");
        
        System.out.print("Masukkan nama anda : ");
        nama = key.next();
        
        boolean check = true;
        while(check) {
            while(true) {
                try {
                    System.out.println("====================================");
                    System.out.println("|  Pilih barang yang ingin dibeli  |");
                    System.out.println("====================================");

                    for(int x = 0; x < barang.length; x++) {
                        System.out.println((x + 1) + ". " + barang[x] + "\t\t Rp. " + barangList.get(barang[x]));
                    }
                    
                    System.out.print("Pilih barang yang ingin dipesan : ");
                    pilihan = key.nextInt();
                    int num = pilihan - 1;
                    for(Map.Entry<String, Integer> e: barangList.entrySet()) {
                        if(e.getValue().equals(barangList.get(barang[num]))) {
                            pilihanKey = e.getKey();
                        }
                    }
                    break;
                } catch(InputMismatchException epi) {
                    System.out.println("==== Input harus berupa angka ! ====");
                    key.next();
                } catch(Exception epe) {
                    System.out.println("==== Pilih sesuai pilihan yang ada ====");
                }
            }

            while(true) {
                try {
                    System.out.print("Masukkan jumlah yang ingin dibeli : ");
                    jumlah = key.nextInt();
                    listPesanan.put(pilihanKey, jumlah);
                    break;
                } catch(InputMismatchException eji) {
                    System.out.println("==== Input harus berupa angka ! ====");
                    key.next();
                }
            }
            
            CONFIRM:
            while(true) {
                System.out.print("Apakah anda ingin membeli barang yang lain? (Y / N) : ");
                String lagi = key.next();
                switch(lagi) {
                    case "Y":
                    case "y":
                        check = true;
                        break CONFIRM;
                    case "N":
                    case "n":
                        check = false;
                        break CONFIRM;
                    default:
                        System.out.println("Pilih sesuai pilihan yang ada.");
                        break;
                }
            }
            
            if(check == false) {
                break;
            }
        }
        
        System.out.println("==============================================");
        System.out.println("Barang\t\tHarga\t\tJumlah");
        System.out.println("----------------------------------------------");
        
        // Hitung Total Harga
        total = 0;
        for(Map.Entry<String, Integer> e: listPesanan.entrySet()) {
            String key = e.getKey();
            int value = e.getValue();
            total += (barangList.get(key) * value);
            
            System.out.println(key + "\t\tRp. " + barangList.get(key) + "\t" + value);
        }
        System.out.println("==============================================");
        System.out.println("Total Harga : Rp. " + total);
        System.out.println("==============================================");
        while(true) {
            try {
                boolean bayarcheck = true;
                while(bayarcheck) {
                    System.out.print("Bayar : Rp. ");
                    bayar = key.nextInt();
                    if(bayar < total) {
                        kurang = total - bayar;
                        System.out.println("====== Warning =======");
                        System.out.println("Bayaran anda kurang sekitar\t\t: Rp. " + kurang);
                        bayarcheck = true;
                    } else if(bayar >= total) {
                        kembalian = bayar - total;
                        System.out.println("Kembalian anda sekitar\t\t\t: Rp. " + kembalian);
                        bayarcheck = false;
                    }
                    
                    if(bayarcheck == false) {
                        break;
                    }
                }
                break;
            } catch(InputMismatchException ebi) {
                System.out.println("==== Input harus berupa angka ! ====");
                key.next();
            }
        }
        
        System.out.println("Terimakasih " + nama + " sudah berbelanja!");
    }
}