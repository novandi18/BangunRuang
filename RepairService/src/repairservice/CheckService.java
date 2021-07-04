package repairservice;

public class CheckService extends Main {
    public void checkPerbaikan(String nama, int harga) {
        if(perbaikan.size() < 1) {
            perbaikan.add(nama);
            hargaPerbaikan.add(harga);
        } else {
            perbaikan.add(nama);
            namaPerangkat.add(namaPerangkat.get(namaPerangkat.size() - 1));
            jenisPerangkat.add(jenisPerangkat.get(jenisPerangkat.size() - 1));
            hargaPerbaikan.add(harga);

            // Pengecekan apakah perbaikan sebelumnya udah dipilih atau belum pada perangkat yang sama
            perangkatCopy.clear();
            perbaikanCopy.clear();
            jpCopy.clear();
            hargaCopy.clear();
            
            perangkatCopy.addAll(namaPerangkat);
            perbaikanCopy.addAll(perbaikan);
            jpCopy.addAll(jenisPerangkat);
            hargaCopy.addAll(hargaPerbaikan);
            
            int x = namaPerangkat.indexOf(namaPerangkat.get(namaPerangkat.size() - 1));    
            for(int i = x - 1; i >= 0; i--) {
                perangkatCopy.remove(i);
                perbaikanCopy.remove(i);
                jpCopy.remove(i);
                hargaCopy.remove(i);
            }
            
            perbaikanCopy.remove(perbaikanCopy.get(perbaikanCopy.size() - 1));
            perbaikan.remove(perbaikan.get(perbaikan.size() - 1));
            namaPerangkat.remove(namaPerangkat.get(namaPerangkat.size() - 1));
            hargaPerbaikan.remove(hargaPerbaikan.get(hargaPerbaikan.size() - 1));
            jenisPerangkat.remove(jenisPerangkat.get(jenisPerangkat.size() - 1));
            
            if(perbaikanCopy.contains(nama)) {
                System.out.println("Maaf perbaikan ini sudah dipilih sebelumnya.");
            } else {
                perbaikan.add(nama);
                namaPerangkat.add(perangkatCopy.get(perangkatCopy.size() - 1));
                hargaPerbaikan.add(harga);
                jenisPerangkat.add(jenisPerangkat.get(jenisPerangkat.size() - 1));
            }
            
//            System.out.println(namaPerangkat);
//            System.out.println(perbaikan);
//            System.out.println(jenisPerangkat);
//            System.out.println(hargaPerbaikan);
            
            if(namaPerangkat.size() > perbaikan.size()) {
                namaPerangkat.remove(namaPerangkat.size() - 1);
                jenisPerangkat.remove(jenisPerangkat.size() - 1);
            }
        }
    }
}
