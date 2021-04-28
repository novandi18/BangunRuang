package parkirkendaraan;
import java.util.InputMismatchException;

public class subMain extends main {
    public void Transaksi() {
        System.out.println("---------------------------------------------");
        System.out.println("|              Selamat Datang               |");
        System.out.println("|     Tempat Parkir Teraman dan Termurah    |");
        System.out.println("---------------------------------------------");
        System.out.println("1. Mobil");
        System.out.println("2. Motor");
        System.out.println("---------------------------------------------");
        
        boolean check = true;
        while(check) {
            System.out.print("Masukkan pilihan anda : ");
            pesan = key.nextLine();
            switch(pesan) {
                case "Mobil":
                case "mobil":
                    System.out.println("Pilihan anda\t\t: Mobil");
                    System.out.println("Harga\t\t\t: Rp. 5000,-/jam");
                    
                    INPUTAN:
                    while(true) {
                        try {
                            System.out.print("Berapa jam\t\t: ");
                            jam = key.nextDouble();
                            break;
                        } catch(InputMismatchException ejam) {
                            System.out.println("Inputan harus berupa angka!");
                            key.next();
                        }
                    }
                    
                    total = jam * 5000;
                    System.out.println("Total Pembayaran\t\t: Rp. " + total);
                    diskon = 0.1 * total;
                    
                    KURANG:
                    while(true) {
                        BAYAR:
                        while(true) {
                            try {
                                System.out.print("Uang anda\t\t\t: Rp. ");
                                bayar = key.nextDouble();
                                break;
                            } catch(InputMismatchException ebayar) {
                                System.out.println("Inputan harus berupa angka!");
                                key.next();
                            }
                        }
                        
                        kembalian = bayar - total;
                        kurang = total - bayar;
                        if(bayar < total) {
                            System.out.println("Uang anda kurang sebesar Rp. " + kurang);
                        } else {
                            break;
                        }
                    }
                    
                    check = false;
                    break;
                case "Motor":
                case "motor":
                    System.out.println("Pilihan anda\t\t: Motor");
                    System.out.println("Harga\t\t\t: Rp. 2500,-/jam");
                    
                    INPUTAN:
                    while(true) {
                        try {
                            System.out.print("Berapa jam\t\t: ");
                            jam = key.nextDouble();
                            break;
                        } catch(InputMismatchException ejam) {
                            System.out.println("Inputan harus berupa angka!");
                            key.next();
                        }
                    }
                    
                    total = jam * 2500;
                    System.out.println("Total Pembayaran\t\t: Rp. " + total);
                    diskon = 0.05 * total;
                    
                    KURANG:
                    while(true) {
                        BAYAR:
                        while(true) {
                            try {
                                System.out.print("Uang anda\t\t\t: Rp. ");
                                bayar = key.nextDouble();
                                break;
                            } catch(InputMismatchException ebayar) {
                                System.out.println("Inputan harus berupa angka!");
                                key.next();
                            }
                        }
                        
                        kembalian = bayar - total;
                        kurang = total - bayar;
                        if(bayar < total) {
                            System.out.println("Uang anda kurang sebesar Rp. " + kurang);
                        } else {
                            break;
                        }
                    }
                    
                    check = false;
                    break;
                default:
                    System.out.println("Masukkan pilihan yang ada (Mobil / Motor).");
            }

            if(check == false) {
                break;
            }
        }
    }
}