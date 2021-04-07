package bangunruang;
import java.util.*;

public class BangunRuang {
    public static void main(String[] args) {
        Rumus math = new Rumus();
        int memilih, cek;
        Scanner input = new Scanner(System.in);
        String[] pilihan = {"Volume Kubus","Volume Balok","Volume Tabung"};
        String[] mengulang = {"Ya", "Tidak"};
        boolean ulang = true;
        
        while(ulang) {
            System.out.println("Pilih salah satu :");
            for (int j = 0; j < pilihan.length; j++) {
                System.out.printf("Masukkan %d untuk %s\n", j + 1, pilihan[j]);
            }
            
            memilih = input.nextInt();
            switch(memilih) {
                case 1:
                    math.Kubus();
                    break;
                case 2:
                    math.Balok();
                    break;
                case 3:
                    math.Tabung();
                    break;
                default:
                    System.out.println("Pilih sesuai pilihan yang ada.");
            }
            
            System.out.println("Apakah anda ingin menentukan rumus yang lain?");
            for (int m = 0; m < mengulang.length; m++) {
                System.out.printf("%d untuk %s\n", m + 1, mengulang[m]);
            }
            
            cek = input.nextInt();
            if (cek == 2) {
                break;
            }
        }
    }
}