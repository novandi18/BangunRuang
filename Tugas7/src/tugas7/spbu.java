package tugas7;
import java.util.InputMismatchException;

public class spbu extends kuis {
    public void Bensin() {
        System.out.println("--------------- SPBU Serang Raya ---------------");
        boolean form = true;
        while(form) {
            System.out.println("Silahkan pilih jenis BBM yang anda inginkan : ");
            System.out.println("1. SR - Lite\t\tRp. 8.000,-/Liter");
            System.out.println("2. SR - Max\t\tRp. 10.000,-/Liter");
            System.out.println("3. Super - SR\t\tRp. 15.000,-/Liter");
            System.out.println("------------------------------------------------");
            
            while(true) {
                try {
                    boolean check = true;
                    PILIHBENSIN:
                    while(check) {
                        System.out.print("Masukkan angka : ");
                        pilihBensin = key.nextInt();
                        
                        switch(pilihBensin) {
                            case 1:
                                bensin = "SR - Lite";
                                harga = 8000;
                                liter = 1.0;
                                break;
                            case 2:
                                bensin = "SR - Max";
                                harga = 10000;
                                liter = 1.0;
                                break;
                            case 3:
                                bensin = "Super - SR";
                                harga = 15000;
                                liter = 1.0;
                                break;
                            default:
                                System.out.println("Pilih sesuai pilihan yang ada!");
                        }
                        
                        if(listBBM.contains(bensin)) {
                            System.out.println("Anda sudah memilih " + bensin + " sebelumnya, mohon pilih jenis BBM yang lain.");
                            check = true;
                        } else {
                            listBBM.add(bensin);
                            check = false;
                        }

                        if(check == false) {
                            break;
                        }
                    }

                    break;
                } catch(InputMismatchException eb) {
                    System.out.println("Input harus berupa angka!");
                    key.next();
                }
            }

            while(true) {
                try {
                    boolean check = true;
                    BELI:
                    while(check) {
                        System.out.print("Ingin beli berapa rupiah? : ");
                        beli = key.nextDouble();
                        if(beli < harga) {
                            System.out.println("Uang anda kurang.");
                        } else {
                            liter = beli / Double.valueOf(harga);
                            listHarga.add(beli);
                            listLiter.add(liter);
                            check = false;
                        }

                        if(check == false) {
                            break;
                        }
                    }

                    break;
                } catch(InputMismatchException eb) {
                    System.out.println("Input harus berupa angka!");
                    key.next();
                }
            }
            
            LAGI:
            while(true) {
                System.out.print("Apakah anda ingin membeli BBM yang lain? (Y / N) : ");
                beliLagi = key.next();
                switch(beliLagi) {
                    case "Y":
                    case "y":
                        form = true;
                        break LAGI;
                    case "N":
                    case "n":
                        form = false;
                        break LAGI;
                    default:
                        System.out.println("Masukkan pilihan yang ada!");
                        break;
                }
            }
            
            if(form == false) {
                break;
            } else {
                if(listBBM.size() == 3) {
                    System.out.println("Maaf, anda sudah memilih semua jenis BBM.");
                    break;
                }
            }
        }
    }
}
