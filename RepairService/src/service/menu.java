package service;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class menu extends main
{

String jawab, pesan, nama, alamat, cod, y, n, nohp, jenis1, jenis2;
String smartphone, computer, perbaikan, code, tanggal, perangkat1, perangkat2;
int  jenis;
int harga, bayar, kembalian, total, diskon, kurang;
boolean fix1, fix2, Y, N;

Scanner input = new Scanner(System.in);
perangkat objek = new perangkat ();

void form(){
    
    jawab = "N";
    System.out.println("|==================================================|");
    System.out.println("|                  Selamat Datang                  |");
    System.out.println("|       Ditempat perbaikan - Repair Service        |");
    System.out.println("|==================================================|");
    System.out.println(" ");
    System.out.print("   Masukan Nama               : ");
    nama = input.nextLine();
    System.out.print("   Nomor HP                   : ");
    nohp = input.nextLine();
    System.out.print("   Masukan Alamat             : ");
    alamat = input.nextLine();
    System.out.println(" ");
    System.out.println("|--------------------------------------------------|");
    System.out.print("Apakah barang ingin diantar ke rumah ketika selesai diperbaiki? (Y/N) : ");
    cod = input.next();
    switch(cod){
        case ("y"):
        case ("Y"):
            y = "Ya";
            Y = true;
            break;
        case ("n"):
        case ("N"):
            n = "Tidak";
            N = true;
            break;
        default:
            System.out.println("|--------------------------------------------------|");
            System.out.println("|               Silahkan Pilih Lagi!               |");
            System.out.println("|--------------------------------------------------|");
    }
    do{
    System.out.println ("|----------------------------------------------|");
    input.nextLine();
    System.out.print("   Nama Perangkat             : ");
    if(perangkat1 == null) {
        perangkat1 = input.nextLine();
    } else {
        perangkat2 = input.nextLine();
    }
    System.out.println ("|----------------------------------------------|");
    System.out.println("Pilih Jenis Perangkat yang ingin diservice :");
    System.out.println("   Masukkan 1 untuk Komputer");
    System.out.println("   Masukkan 2 untuk Smartphone");
    System.out.print("Masukkan Angka : ");
    jenis = input.nextInt();
    switch(jenis){
        case 1:
            objek.komputer();
            jenis1 = "Komputer";
            fix1 = true;
        break;  
        case 2:
            objek.smartphone();
            jenis2 = "Smartphone";
            fix2 = true;
        break;
    default:
    System.out.println("|--------------------------------------------------|");
    System.out.println("|  Silahkan pilih perangkat yang ingin diperbaiki  |");
    System.out.println("|--------------------------------------------------|");
    }
        System.out.print("Apakah anda ingin melakukan perbaikan untuk perangkat yang berbeda? (Y / N) : ");
        jawab = input.next();
            }while(jawab.equals("y"));
    
    System.out.println("|==================================================|");
    System.out.println("|                    Rincian Data                  |");
    System.out.println("|          Harap ditujukkan ketika dilokasi        |");
    System.out.println("|==================================================|");
    System.out.println("   Nama              : "+nama);
    System.out.println("   No HP             : "+nohp);
    System.out.println("   Alamat            : "+alamat);
    if (Y==true){
    System.out.println("   Barang Diantar    : "+y);
    }
    if (N==true){
    System.out.println("   Barang Diantar    : "+n);
    }
        Date kode = new Date();
        SimpleDateFormat tgl = new SimpleDateFormat("yyyyMMddHHmm");
        code = (tgl.format(kode));
    System.out.println("   Kode Transaksi    : RS"+code);
        Date date = new Date();
        SimpleDateFormat order = new SimpleDateFormat("yyyy/MM/dd 'Pada:' HH:mm:ss a");
        tanggal = (order.format(date));
    System.out.println("   Tanggal Order     : "+tanggal);
    System.out.println("|--------------------------------------------------|");
    System.out.println("   Perangkat         : "+perangkat1);
    if(perangkat2 != null) {
        System.out.println("   Perangkat         : "+perangkat2);
    }
    
    if (fix1==true){
    System.out.println("   Jenis Perangkat   : "+jenis1);
    }
    if (objek.com1==true){
    System.out.println("   Perbaikan         : "+objek.instal1);
    System.out.println("   OS yang dipilih   : "+objek.wndws1);
    System.out.println("   Harga             : Rp."+objek.windows10);
    }
    if (objek.com2==true){
    System.out.println("   Perbaikan         : "+objek.instal1);
    System.out.println("   OS yang dipilih   : "+objek.wndws2);
    System.out.println("   Harga             : Rp."+objek.windows8);
    }
    if (objek.com3==true){
    System.out.println("   Perbaikan         : "+objek.instal1);
    System.out.println("   OS yang dipilih   : "+objek.wndws3);
    System.out.println("   Harga             : Rp."+objek.windows7);
    }
    if (objek.com4==true){
    System.out.println("   Perbaikan         : "+objek.instal1);
    System.out.println("   OS yang dipilih   : "+objek.wndws4);
    System.out.println("   Harga             : Rp."+objek.windowsV);
    }
    if (objek.com5==true){
    System.out.println("   Perbaikan         : "+objek.instal1);
    System.out.println("   OS yang dipilih   : "+objek.wndws5);
    System.out.println("   Harga             : Rp."+objek.windowsXP);
    }
    if (objek.kom2==true){
    System.out.println("   Perbaikan         : "+objek.keyboard1);
    System.out.println("   Harga             : Rp."+objek.keyboard);
    }
    if (objek.kom3==true){
    System.out.println("   Perbaikan         : "+objek.touchpad1);
    System.out.println("   Harga             : Rp."+objek.touchpad);
    }
    if (objek.kom4==true){
    System.out.println("   Perbaikan         : "+objek.bios1);
    System.out.println("   Harga             : Rp."+objek.bios);
    }
    if (objek.kom5==true){
    System.out.println("   Perbaikan         : "+objek.speaker1);
    System.out.println("   Harga             : Rp."+objek.speaker);
    }
    if (objek.kom6==true){
    System.out.println("   Perbaikan         : "+objek.baterai1);
    System.out.println("   Harga             : Rp."+objek.baterai);
    }
    if (objek.kom7==true){
    System.out.println("   Perbaikan         : "+objek.mobo1);
    System.out.println("   Harga             : Rp."+objek.mobo);
    }
    if (objek.kom8==true){
    System.out.println("   Perbaikan         : "+objek.engsel1);
    System.out.println("   Harga             : Rp."+objek.engsel);
    }
    if (objek.kom9==true){
    System.out.println("   Perbaikan         : "+objek.prosessor1);
    System.out.println("   Harga             : Rp."+objek.prosessor);
    }
    System.out.println("|--------------------------------------------------|");
    System.out.println("   Perangkat         : "+perangkat1);
    if(perangkat2 != null) {
        System.out.println("   Perangkat         : "+perangkat2);
    }
    if (fix2==true){
    System.out.println("   Jenis Perangkat   : "+jenis2);
    }
    if (objek.hp1==true){
    System.out.println("   Perbaikan         : "+objek.suarahilang1);
    System.out.println("   Harga             : Rp."+objek.suarahilang);
    }
    if (objek.hp2==true){
    System.out.println("   Perbaikan         : "+objek.icpower1);
    System.out.println("   Harga             : Rp."+objek.icpower);
    }
    if (objek.hp3==true){
    System.out.println("   Perbaikan         : "+objek.icsinyal1);
    System.out.println("   Harga             : Rp."+objek.icsinyal);
    }
    if (objek.hp4==true){
    System.out.println("   Perbaikan         : "+objek.iccharger1);
    System.out.println("   Harga             : Rp."+objek.iccharger);
    }
    if (objek.hp5==true){
    System.out.println("   Perbaikan         : "+objek.konektorcharger1);
    System.out.println("   Harga             : Rp."+objek.konektorcharger);
    }
    if (objek.hp6==true){
    System.out.println("   Perbaikan         : "+objek.ghosttouch1);
    System.out.println("   Harga             : Rp."+objek.ghosttouch);
    }
    if (objek.hp7==true){
    System.out.println("   Perbaikan         : "+objek.portheadset1);
    System.out.println("   Harga             : Rp."+objek.portheadset);
    }
    if (objek.hp8==true){
    System.out.println("   Perbaikan         : "+objek.tombolpower1);
    System.out.println("   Harga             : Rp."+objek.tombolpower);
    }
    if (objek.hp9==true){
    System.out.println("   Perbaikan         : "+objek.konektorbaterai1);
    System.out.println("   Harga             : Rp."+objek.konektorbaterai);
    }
    if (objek.hp10==true){
    System.out.println("   Perbaikan         : "+objek.emmc1);
    System.out.println("   Harga             : Rp."+objek.emmc);
    }
    if (objek.hp11==true){
    System.out.println("   Perbaikan         : "+objek.bateraibermasalah1);
    System.out.println("   Harga             : Rp."+objek.bateraibermasalah);
    }
    if (objek.hp12==true){
    System.out.println("   Perbaikan         : "+objek.lupapola1);
    System.out.println("   Harga             : Rp."+objek.lupapola);
    }
    if (objek.hp13==true){
    System.out.println("   Perbaikan         : "+objek.resethp1);
    System.out.println("   Harga             : Rp."+objek.resethp);
    }
    if (objek.hp14==true){
    System.out.println("   Perbaikan         : "+objek.bootloop1);
    System.out.println("   Harga             : Rp."+objek.bootloop);
    }
    if (objek.hp15==true){
    System.out.println("   Perbaikan         : "+objek.hpkonslet1);
    System.out.println("   Harga             : Rp."+objek.hpkonslet);
    }
    if (objek.hp16==true){
    System.out.println("   Perbaikan         : "+objek.hpmati1);
    System.out.println("   Harga             : Rp."+objek.hpmati);
    }
    if (objek.hp17==true){
    System.out.println("   Perbaikan         : "+objek.flashhp1);
    System.out.println("   Harga             : Rp."+objek.flashhp);
    }
    if (objek.hp18==true){
    System.out.println("   Perbaikan         : "+objek.imeihilang1);
    System.out.println("   Harga             : Rp."+objek.imeihilang);
    }
    System.out.println("|--------------------------------------------------|");
    total =  +objek.keyboard + +objek.touchpad + +objek.bios + +objek.speaker + +objek.baterai + +objek.mobo + +objek.engsel + +objek.prosessor + +objek.windows10 + +objek.windows8 + +objek.windows7 + +objek.windowsV + +objek.windowsXP  + +objek.suarahilang + +objek.icpower + +objek.icsinyal + +objek.iccharger + +objek.konektorcharger + +objek.ghosttouch + +objek.portheadset + +objek.tombolpower + +objek.konektorbaterai + +objek.emmc + +objek.bateraibermasalah + +objek.lupapola + +objek.resethp + +objek.bootloop + +objek.hpkonslet + +objek.hpmati + +objek.flashhp + +objek.imeihilang;

    if (Y==true) {
        System.out.println("   Ongkir            : + Rp.12000,- ");
    }
    if (N==true) {
        
    }
    System.out.println("   Total Pembayaran  : Rp. "+total);
    System.out.println("|================= Repair Service =================|");
    }

}