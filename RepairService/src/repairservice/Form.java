package repairservice;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.InputMismatchException;

public class Form extends Main {
    Menu menu = new Menu();
    // Buat kode transaksi
    private void kodeOrder(String nama) {
        // Buat format tanggal dan waktu menggunakan DateFormat (TahunBulanHariJamMenit)
        DateFormat tgl = new SimpleDateFormat("yyyyMMddHHmm");
        // Dapatkan tanggal hari ini menggunakan Calendar object
        Date tglNow = Calendar.getInstance().getTime();
        // Gunakan format method dari DateFormat untuk membuat menjadi string
        // Representasikan tanggal dengan format tanggal yang telah ditentukan
        String tglKode = tgl.format(tglNow);
        // Taro kedalam ArrayList datadiri
        bio.add("RS" + tglKode + Character.toString(nama.charAt(0)));
    }
    
    private void tanggalOrder() {
        DateFormat tglWaktu = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date tglWaktuNow = Calendar.getInstance().getTime();
        String order = tglWaktu.format(tglWaktuNow);
        bio.add(order);
    }
    
    // Form Biodata
    public void Biodata() {
        // Nama
        while(true) {
            System.out.print("Masukkan nama : ");
            nama = key.nextLine();
            // Cek apakah nama berisi angka
            if(nama.matches("[a-zA-Z\\s]+")) {
                // Masukkan nama kedalam Array Bio
                bio.add(nama);
                break;
            } else {
                System.out.println("| Nama tidak boleh mengandung angka! |");
            }
        }
        
        // Nomor HP
        while(true) {
            System.out.print("Nomor HP : ");
            noHp = key.nextLine();
            // Cek apakah inputan berisikan nomor apa tidak
            if(noHp.matches("[0-9]+")) {
                // Masukkan nomor HP kedalam Array Bio
                bio.add(noHp);
                break;
            } else {
                System.out.println("| Nomor HP harus mengandung angka! |");
            }
        }
        
        // Alamat
        System.out.print("Masukkan alamat : ");
        alamat = key.nextLine();
        bio.add(alamat);
        
        // Barang diantar / tidak
        boolean checkantar = true;
        while(checkantar) {
            System.out.print("Apakah barang ingin diantar ke rumah ketika selesai diperbaiki? (Y / N) : ");
            antar = key.next();
            switch(antar) {
                case "Y":
                case "y":
                    bio.add("Ya");
                    checkantar = false;
                    break;
                case "N":
                case "n":
                    bio.add("Tidak");
                    checkantar = false;
                    break;
                default:
                    System.out.println("| Pilih sesuai pilihan yang ada |");
            }
            
            if(checkantar == false) {
                break;
            }
        }
        
        // Buat kode transaksi
        this.kodeOrder(nama);
        
        // Buat tanggal transaksi
        this.tanggalOrder();
    }
    
    public void FormPerbaikan() throws Exception {
        boolean form = true;
        while(form) {
            System.out.print("Nama Perangkat : ");
            key.nextLine();
            perangkat = key.nextLine();
            namaPerangkat.add(perangkat);
            
            boolean ulang = true;
            while(ulang) {
                System.out.println("Pilih Jenis Perangkat yang ingin diservice :");
                for(int j = 0; j < jenis.length; j++) {
                    System.out.printf("Masukkan %d untuk %s\n", j + 1, jenis[j]);
                }
                System.out.println("---------------------------------------------");

                boolean pilihPerangkat = false;
                while(!pilihPerangkat) {
                    try {
                        boolean valid = true;
                        INNER:
                        while(valid) {
                            System.out.print("Masukkan angka: ");
                            pilihan = key.nextInt();
                            switch(pilihan) {
                                case 1:
                                    jenisPerangkat.add("Komputer");
                                    menu.Computer();
                                    break INNER;
                                case 2:
                                    jenisPerangkat.add("Smartphone");
                                    menu.Smartphone();
                                    break INNER;
                                default:
                                    System.out.println("| Pilih sesuai pilihan yang ada |");
                                    break;
                            }
                        }

                        pilihPerangkat = true;
                    } catch(InputMismatchException ei) {
                        System.out.println("|   Input harus berupa angka !  |");
                        key.next();
                    } catch(ArrayIndexOutOfBoundsException ea) {
                        System.out.println("| Pilih sesuai pilihan yang ada |");
                        key.next();
                    }
                }

                boolean checkulang = true;
                while(checkulang) {
                    System.out.print("Apakah anda ingin melakukan perbaikan yang lain? (Y / N) : ");
                    
                    ULANG:
                    while(true) {
                        pesanLain = key.next();
                        switch (pesanLain) {
                            case "N": 
                            case "n":
                                checkulang = false;
                                ulang = false;
                                break ULANG;
                            case "Y":
                            case "y":
                                String idx = jenisPerangkat.get(jenisPerangkat.size() - 1);
                                if("Komputer".equals(idx)) {
                                    menu.Computer();
                                } else {
                                    menu.Smartphone();
                                }
                                ulang = true;
                                checkulang = true;
                                break ULANG;
                            default:
                                System.out.println("Pilih sesuai pilihan yang ada.");
                                System.out.print("Apakah anda ingin melakukan perbaikan yang lain? (Y / N) : ");
                                break;
                        }
                    }

                    if(checkulang == false) {
                        break;
                    }
                }

                if(form == false) {
                    break;
                }
            }
            
            // Konfirmasi pesanan
            LAST:
            while(true) {
                System.out.print("Apakah anda ingin melakukan perbaikan untuk perangkat yang berbeda? (Y / N) : ");
                pesanLain = key.next();
                switch (pesanLain) {
                    case "N": 
                    case "n":
                        form = false;
                        break LAST;
                    case "Y":
                    case "y":
                        form = true;
                        break LAST;
                    default:
                        System.out.println("Pilih sesuai pilihan yang ada.");
                        break;
                }
            }
            
            if(form == false) {
                break;
            }
        }
    }
}