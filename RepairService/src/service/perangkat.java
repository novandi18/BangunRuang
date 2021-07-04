package service;

import java.util.Scanner;

public class perangkat {
    
    String jawab;
    String wndws1, wndws2, wndws3, wndws4, wndws5;
    String instal1, instal2, instal3, instal4, instal5;
    String keyboard1, touchpad1, bios1, speaker1, baterai1, mobo1, engsel1, prosessor1;
    String suarahilang1, icpower1, icsinyal1, iccharger1, konektorcharger1, ghosttouch1;
    String portheadset1, tombolpower1, konektorbaterai1, emmc1, bateraibermasalah1, lupapola1;
    String resethp1, bootloop1, hpkonslet1, hpmati1, flashhp1, imeihilang1;
    int windows10, windows8, windows7, windowsV, windowsXP;
    int keyboard, touchpad, bios, speaker, baterai, mobo, engsel, prosessor;
    int kerusakankomputer, kerusakansmartphone;
    int suarahilang, icpower, icsinyal, iccharger, konektorcharger, ghosttouch;
    int portheadset, tombolpower, konektorbaterai, emmc, bateraibermasalah, lupapola;
    int resethp, bootloop, hpkonslet, hpmati, flashhp, imeihilang;
    boolean hp1, hp2, hp3, hp4, hp5, hp6, hp7, hp8, hp9;
    boolean hp10, hp11, hp12, hp13, hp14, hp15, hp16, hp17, hp18;
    boolean kom1, kom2, kom3, kom4, kom5, kom6, kom7, kom8, kom9;
    boolean com1, com2, com3, com4, com5;
    Scanner input = new Scanner (System.in);
    
    void komputer ()
    {       
        jawab = "N";
        do{
        System.out.println ("|----------------------------------------------|");      
        System.out.println ("|          PILIH YANG INGIN DIPERBAIKI         |");
        System.out.println ("|----------------------------------------------|");
        System.out.println ("   1. Install Ulang");
        System.out.println ("   2. Keyboard Rusak");
        System.out.println ("   3. Touchpad Rusak");
        System.out.println ("   4. BIOS Corrupt");
        System.out.println ("   5. Speaker Rusak");
        System.out.println ("   6. Baterai Bocor");
        System.out.println ("   7. Motherboard Rusak");
        System.out.println ("   8. Engsel Longgar");
        System.out.println ("   9. Prosessor Panas");
        System.out.println ("================================================");
        System.out.print ("Masukkan Angka : ");
        kerusakankomputer = input.nextInt();
        switch(kerusakankomputer){
            case 1:
            System.out.println ("|------------------------------------------|");      
            System.out.println ("|               Install Ulang              |");      
            System.out.println ("|          Pilih OS yang diinginkan        |");
            System.out.println ("|------------------------------------------|");
            System.out.println ("  1. Windows 10");
            System.out.println ("  2. Windows 8");
            System.out.println ("  3. Windows 7");
            System.out.println ("  4. Windows Vista");
            System.out.println ("  5. Windows XP");
            System.out.println ("============================================");
            System.out.print ("Masukkan Angka : ");
            kerusakankomputer = input.nextInt();
                switch(kerusakankomputer){
                    case 1:
                        windows10 = 50000;
                        wndws1 = "Windows 10";
                        instal1 = "Instal Ulang";
                        com1 = true;
                    break;  
                    case 2:
                        windows8 = 40000;
                        wndws2 = "Windows 8";
                        instal2 = "Instal Ulang";
                        com2 = true;
                    break;  
                    case 3:
                        windows7 = 30000;
                        wndws3 = "Windows 7";
                        instal3 = "Instal Ulang";
                        com3 = true;
                    break;  
                    case 4:
                        windowsV = 25000;
                        wndws4 = "Windows Vista";
                        instal4 = "Instal Ulang";
                        com4 = true;
                    break;  
                    case 5:
                        windowsXP = 20000;
                        wndws5 = "Windows XP";
                        instal5 = "Instal Ulang";
                        com5 = true;
                    break;  
                default:
                }
            break;  
            case 2:
                keyboard = 300000;
                keyboard1 = "Kayboard Rusak";
                kom2 = true;
            break; 
            case 3:
                touchpad = 200000;
                touchpad1 = "Touchpad Rusak";
                kom3 = true;
            break; 
            case 4:
                bios = 350000;
                bios1 = "BIOS Corrupt";
                kom4 = true;
            break; 
            case 5:
                speaker = 120000;
                speaker1 = "Speaker Rusak";
                kom5 = true;
            break; 
            case 6:
                baterai = 200000;
                baterai1 = "Baterai Bocor";
                kom6 = true;
            break; 
            case 7:
                mobo = 1300000;
                mobo1 = "Motherboard Rusak";
                kom7 = true;
            break; 
            case 8:
                engsel = 1800000;
                engsel1 = "Engsel Longgar";
                kom8 = true;
            break; 
            case 9:
                prosessor = 100000;
                prosessor1 = "Prosessor Panas";
                kom9 = true;
            break;
        default:
    System.out.println ("|------------------------------------------|"); 
    System.out.println ("|       Pilih Kerusakan Pada Komputer      |");
    System.out.println ("|------------------------------------------|");
        }
        System.out.print("Apakah anda ingin melakukan perbaikan yang lain? (Y / N) :");
        jawab = input.next();
            }while(jawab.equals("y"));
    }
    
    void smartphone ()
    {    
        jawab= "N";
        do{
        System.out.println ("|----------------------------------------------|");      
        System.out.println ("|          PILIH YANG INGIN DIPERBAIKI         |");
        System.out.println ("|----------------------------------------------|");
        System.out.println ("   1. Tidak Keluar Suara");
        System.out.println ("   2. IC Power Rusak");
        System.out.println ("   3. IC Sinyal Rusak");
        System.out.println ("   4. IC Charger Rusak");
        System.out.println ("   5. Konektor Charger Rusak");
        System.out.println ("   6. Ghost Touch");
        System.out.println ("   7. Port Headset Rusak");
        System.out.println ("   8. Tombol Power Rusak");
        System.out.println ("   9. Konektor Baterai Rusak");
        System.out.println ("   10. Emmc Rusak");
        System.out.println ("   11. Baterai Bermasalah");
        System.out.println ("   12. Lupa Pola");
        System.out.println ("   13. Reset HP");
        System.out.println ("   14. Bootloop");
        System.out.println ("   15. Hp Konslet");
        System.out.println ("   16. Hp Mati Total");
        System.out.println ("   17. Flash HP");
        System.out.println ("   18. IMEI Hilang");
        System.out.println ("================================================");
        System.out.print ("Masukkan Angka : ");
        kerusakansmartphone = input.nextInt();
        switch(kerusakansmartphone){
            case 1:
                suarahilang = 230000;
                suarahilang1 = "Tidak Keluar Suara";
                hp1 = true;
            break;  
            case 2:
                icpower = 300000;
                icpower1 = "IC Power Rusak";
                hp2 = true;
            break; 
            case 3:
                icsinyal = 100000;
                icsinyal1 = "IC Sinyal Rusak";
                hp3 = true;
            break; 
            case 4:
                iccharger = 150000;
                iccharger1 = "IC Charger Rusak";
                hp4 = true;
            break; 
            case 5:
                konektorcharger = 120000;
                konektorcharger1 = "Konektor Charger Rusak";
                hp5 = true;
            break; 
            case 6:
                ghosttouch = 400000;
                ghosttouch1 = "Ghost Touch";
                hp6 = true;
            break; 
            case 7:
                portheadset = 230000;
                portheadset1 = "Port Headset Rusak";
                hp7 = true;
            break; 
            case 8:
                tombolpower = 50000;
                tombolpower1 = "Tombol Power Rusak";
                hp8 = true;
            break; 
            case 9:
                konektorbaterai = 70000;
                konektorbaterai1 = "Konektor Baterai Rusak";
                hp9 = true;
            break;
            case 10:
                emmc = 500000;
                emmc1 = "Emmc Rusak";
                hp10 = true;
            break;
            case 11:
                bateraibermasalah = 160000;
                bateraibermasalah1 = "Baterai Bermasalah";
                hp11 = true;
            break;
            case 12:
                lupapola = 100000;
                lupapola1 = "Lupa Pola";
                hp12 = true;
            break;
            case 13:
                resethp = 50000;
                resethp1 = "Reset HP";
                hp13 = true;
            break;
            case 14:
                bootloop = 80000;
                bootloop1 = "Bootloop";
                hp14 = true;
            break;
            case 15:
                hpkonslet = 450000;
                hpkonslet1 = "HP Konslet";
                hp15 = true;
            break;
            case 16:
                hpmati = 150000;
                hpmati1 = "HP Mati Total";
                hp16 = true;
            break;
            case 17:
                flashhp = 200000;
                flashhp1 = "Flash HP";
                hp17 = true;
            break;
            case 18:
                imeihilang = 70000;
                imeihilang1 = "IMEI Hilang";
                hp18 = true;
            break;
        default:
    System.out.println ("|------------------------------------------|"); 
    System.out.println ("|      Pilih Kerusakan Pada Smartphone     |");
    System.out.println ("|------------------------------------------|");
        }
        System.out.print("Apakah anda ingin melakukan perbaikan yang lain? (Y / N) :");
        jawab = input.next();
            }while(jawab.equals("y"));
    }
}
