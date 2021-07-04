package repairservice;

public class Smartphone extends Main {
    CheckService cs = new CheckService();
    int harga;
    String[] serviceHp = {"Tidak Keluar Suara", "IC Power Rusak", "IC Sinyal Rusak", "IC Charger Rusak", "Konektor Charger Rusak", "Ghost Touch", "Port Headset Rusak", "Tombol Power Rusak", "Konektor Baterai Rusak", "Emmc Rusak", "Baterai Bermasalah", "Lupa Pola", "Reset HP", "Bootloop", "Hp Konslet", "Hp Mati Total", "Flash HP", "IMEI Hilang"};
    
    public void TidakKeluarSuara() {
        harga = 230000;
        nama = serviceHp[0];
        cs.checkPerbaikan(nama, harga);
    }
    
    public void ICPowerRusak() {
        harga = 300000;
        nama = serviceHp[1];
        cs.checkPerbaikan(nama, harga);
    }
    
    public void ICSinyalRusak() {
        harga = 100000;
        nama = serviceHp[2];
        cs.checkPerbaikan(nama, harga);
    }
    
    public void ICChargerRusak() {
        harga = 150000;
        nama = serviceHp[3];
        cs.checkPerbaikan(nama, harga);
    }
    
    public void KonektorChargerRusak() {
        harga = 120000;
        nama = serviceHp[4];
        cs.checkPerbaikan(nama, harga);
    }
    
    public void GhostTouch() {
        harga = 400000;
        nama = serviceHp[5];
        cs.checkPerbaikan(nama, harga);
    }
    
    public void PortHeadsetRusak() {
        harga = 230000;
        nama = serviceHp[6];
        cs.checkPerbaikan(nama, harga);
    }
    
    public void TombolPowerRusak() {
        harga = 50000;
        nama = serviceHp[7];
        cs.checkPerbaikan(nama, harga);
    }
    
    public void KonektorBateraiRusak() {
        harga = 70000;
        nama = serviceHp[8];
        cs.checkPerbaikan(nama, harga);
    }
    
    public void EmmcRusak() {
        harga = 500000;
        nama = serviceHp[9];
        cs.checkPerbaikan(nama, harga);
    }
    
    public void BateraiBermasalah() {
        harga = 160000;
        nama = serviceHp[10];
        cs.checkPerbaikan(nama, harga);
    }
    
    public void LupaPola() {
        harga = 100000;
        nama = serviceHp[11];
        cs.checkPerbaikan(nama, harga);
    }
    
    public void ResetHP() {
        harga = 50000;
        nama = serviceHp[12];
        cs.checkPerbaikan(nama, harga);
    }
    
    public void Bootloop() {
        harga = 80000;
        nama = serviceHp[13];
        cs.checkPerbaikan(nama, harga);
    }
    
    public void HpKonslet() {
        harga = 450000;
        nama = serviceHp[14];
        cs.checkPerbaikan(nama, harga);
    }
    
    public void HpMatiTotal() {
        harga = 150000;
        nama = serviceHp[15];
        cs.checkPerbaikan(nama, harga);
    }
    
    public void FlashHP() {
        harga = 200000;
        nama = serviceHp[16];
        cs.checkPerbaikan(nama, harga);
    }
    
    public void IMEIHilang() {
        harga = 70000;
        nama = serviceHp[17];
        cs.checkPerbaikan(nama, harga);
    }
}
