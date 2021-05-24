package repairservice;
import java.lang.reflect.Method;
import java.util.InputMismatchException;

public class Menu extends Main {
    Computer pc = new Computer();
    Smartphone hp = new Smartphone();
    String rs;
    int service, voidNum;
    
    public void Computer() throws Exception {
        System.out.println("|  Pilih yang ingin diperbaiki  |");
        for(int i = 0; i < pc.servicePC.length; i++) {
            System.out.printf("%d. %s\n", i + 1, pc.servicePC[i]);
        }
        
        boolean check = false;
        while(!check) {
            try {
                boolean validcheck = true;
                MENU:
                while(validcheck) {
                    System.out.println("=================================");
                    System.out.print("Masukkan angka: ");
                    service = key.nextInt();

                    for(int x = 0; x < pc.servicePC.length; x++) {
                        if(service == x) {
                            voidNum = service - 1;
                            rs = pc.servicePC[voidNum].replaceAll("\\s", "");
                            Method m = Computer.class.getMethod(rs);
                            m.invoke(pc);
                            validcheck = false;
                        }
                    }

                    if(validcheck == false) {
                        break;
                    }
                }
                check = true;
            } catch(InputMismatchException emci) {
                System.out.println("=================================");
                System.out.println("|   Input harus berupa angka !  |");
                System.out.println("=================================");
                key.next();
            } catch(ArrayIndexOutOfBoundsException emca) {
                System.out.println("=================================");
                System.out.println("| Pilih sesuai pilihan yang ada |");
                System.out.println("=================================");
                key.next();
            }
        }
    }
    
    public void Smartphone() throws Exception {
        System.out.println("|  Pilih yang ingin diperbaiki  |");
        
        for(int i = 0; i < hp.serviceHp.length; i++) {
            System.out.printf("%d. %s\n", i + 1, hp.serviceHp[i]);
        }
        
        boolean check = false;
        while(!check) {
            try {
                boolean validcheck = true;
                MENU:
                while(validcheck) {
                    System.out.println("=================================");
                    System.out.print("Masukkan angka: ");
                    service = key.nextInt();

                    for(int x = 0; x < hp.serviceHp.length; x++) {
                        if(service == x) {
                            voidNum = service - 1;
                            rs = hp.serviceHp[voidNum].replaceAll("\\s", "");
                            Method m = Smartphone.class.getMethod(rs);
                            m.invoke(hp);
                            validcheck = false;
                        }
                    }
                    
                    if(validcheck == false) {
                        break;
                    }
                }
                check = true;
            } catch(InputMismatchException emsi) {
                System.out.println("=================================");
                System.out.println("|   Input harus berupa angka !  |");
                System.out.println("=================================");
                key.next();
            } catch(ArrayIndexOutOfBoundsException emsa) {
                System.out.println("=================================");
                System.out.println("| Pilih sesuai pilihan yang ada |");
                System.out.println("=================================");
                key.next();
            }
        }
    }
}
