package repairservice;

public class CheckService extends Main {
    public void checkPerbaikan(String nama, int harga) {
        if(perbaikan.size() < 1) {
            perbaikan.add(nama);
            hargaPerbaikan.add(harga);
        } else if(perbaikan.contains(nama)) {
            if(namaPerangkat.contains(namaPerangkat.get(namaPerangkat.size() - 1))) {
                System.out.println("Maaf, anda sudah memilih perbaikan ini sebelumnya.");
            } else {
                perbaikan.add(nama);
                hargaPerbaikan.add(harga);
            }
        } else {
            perbaikan.add(nama);
            hargaPerbaikan.add(harga);
            namaPerangkat.add(namaPerangkat.get(namaPerangkat.size() - 1));
            jenisPerangkat.add(jenisPerangkat.get(jenisPerangkat.size() - 1));
            
            if(namaPerangkat.size() > perbaikan.size()) {
                namaPerangkat.remove(namaPerangkat.size() - 1);
                jenisPerangkat.remove(jenisPerangkat.size() - 1);
            }
        }
    }
}
