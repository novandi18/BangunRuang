package tugas3pbo;
import java.util.*;

public class Kelas1 {
    public static void main(String[] args) {
        int pilihan;
        Scanner key = new Scanner(System.in);
        Kelas2 obj = new Kelas2();
        System.out.println("---- Menu Pilihan ----");
        System.out.println("1. Ya");
        System.out.println("2. Tidak");
        System.out.println("----------------------");
        System.out.print("Apakah anda member? : ");
        
        boolean loop = false;
        while(!loop) {
            try {
                boolean valid = true;
                INNER:
                while(valid) {
                    pilihan = key.nextInt();
                    switch(pilihan) {
                        case 1:
                            obj.member();
                            break INNER;
                        case 2:
                            obj.nonmember();
                            break INNER;
                        default:
                            System.out.println("=================================");
                            System.out.println("| Pilih sesuai pilihan yang ada |");
                            System.out.println("=================================");
                            System.out.print("Apakah anda member? : ");
                            break;
                    }
                }
                loop = true;
            } catch(InputMismatchException e) {
                System.out.println("=================================");
                System.out.println("|   Input harus berupa angka !  |");
                System.out.println("=================================");
                System.out.print("Apakah anda member? : ");
                key.next();
            }
        }
    }
}
