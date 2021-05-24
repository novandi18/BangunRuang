package repairservice;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;

public class Computer extends Main {
    CheckService cs = new CheckService();
    String[] servicePC = {"Install Ulang", "Keyboard Rusak", "Touchpad Rusak", "BIOS Corrupt", "Speaker Rusak", "Baterai Bocor", "Motherboard Rusak", "Engsel Longgar", "Prosessor Panas"};
    String[] windows = {"Windows 10","Windows 8","Windows 7","Windows Vista","Windows XP"};
    HashMap<String, Integer> win = new HashMap<>();
    
    String namaPerbaikan;
    int harga;
    
    public void InstallUlang() {
        win.put(windows[0], 50000);
        win.put(windows[1], 40000);
        win.put(windows[2], 30000);
        win.put(windows[3], 25000);
        win.put(windows[4], 20000);
        
        System.out.println("=================================");
        System.out.println("|         Install Ulang         |");
        System.out.println("=================================");
        System.out.println("|    Pilih OS yang diinginkan   |");
        System.out.println("=================================");
        for(int w = 0; w < windows.length; w++) {
            System.out.printf("%d. %s\n", w + 1, windows[w]);
        }
        
        System.out.println("=================================");
        while(true) {
            try {
                System.out.print("Masukkan angka: ");
                harga = key.nextInt();
                int num = harga - 1;
                for(Map.Entry<String, Integer> w: win.entrySet()) {
                    if(w.getValue().equals(win.get(windows[num]))) {
                        nama = w.getKey();
                    }
                }
                harga = win.get(windows[num]);
                break;
            } catch(InputMismatchException eios) {
                System.out.println("=================================");
                System.out.println("|   Input harus berupa angka !  |");
                System.out.println("=================================");
                key.next();
            } catch(Exception eitos) {
                System.out.println("=================================");
                System.out.println("| Pilih sesuai pilihan yang ada |");
                System.out.println("=================================");
            }
        }
        
        namaPerbaikan = servicePC[0];
        cs.checkPerbaikan(namaPerbaikan, harga);
    }
    
    public void KeyboardRusak() {
        harga = 300000;
        namaPerbaikan = servicePC[1];
        cs.checkPerbaikan(namaPerbaikan, harga);
    }
    
    public void TouchpadRusak() {
        harga = 200000;
        namaPerbaikan = servicePC[2];
        cs.checkPerbaikan(namaPerbaikan, harga);
    }
    
    public void BIOSCorrupt() {
        harga = 350000;
        namaPerbaikan = servicePC[3];
        cs.checkPerbaikan(namaPerbaikan, harga);
    }
    
    public void SpeakerRusak() {
        harga = 120000;
        namaPerbaikan = servicePC[4];
        cs.checkPerbaikan(namaPerbaikan, harga);
    }
    
    public void BateraiBocor() {
        harga = 200000;
        namaPerbaikan = servicePC[5];
        cs.checkPerbaikan(namaPerbaikan, harga);
    }
    
    public void MotherboardRusak() {
        harga = 1300000;
        namaPerbaikan = servicePC[6];
        cs.checkPerbaikan(namaPerbaikan, harga);
    }
    
    public void EngselLonggar() {
        harga = 1800000;
        namaPerbaikan = servicePC[7];
        cs.checkPerbaikan(namaPerbaikan, harga);
    }
    
    public void ProsessorPanas() {
        harga = 100000;
        namaPerbaikan = servicePC[8];
        cs.checkPerbaikan(namaPerbaikan, harga);
    }
}
