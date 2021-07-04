package service;

public class main {
   
public static void main (String[] args){
menu objek = new menu ();
objek.form();

if(objek.total>50000){
    System.out.println("");
    System.out.println("|--------------------------------------------------|");
    System.out.println("   Ongkir            : + Rp.12000,- ");
    System.out.println("   Total Pembayaran  : Rp. "+objek.total);
    System.out.println("");
    System.out.println("|==================================================|");
    System.out.println("|                    Terima Kasih                  |");
    System.out.println("|==================================================|");
    }
else{
    System.out.println("Kembalian Anda        : Rp. "+objek.kembalian);
    }
}
    
}
