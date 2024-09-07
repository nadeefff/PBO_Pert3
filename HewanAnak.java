/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo_task3;

/**
 *
 * @author LENOVO
 */
    public class HewanAnak extends HewanInduk {
    // Override metode dari kelas induk
    @Override
    public void mencariMakan() {
        System.out.println("Hewan anak mencari makan");
    }
    
    // Metode baru khusus untuk kelas ini
    public void membantuInduk() {
        System.out.println("Membantu induk mencari makanan");
    }
    
    // Metode overload
    public void membantuInduk(String tugas) {
        System.out.println(tugas);
    }
    
    // Metode untuk memeriksa semua perilaku
    public void periksa() {
        // Memanggil metode dari kelas ini atau kelas induknya
        mencariMakan();
        belajar();
        sukaTanduk();
        punyaSarang();
        melakukanKegiatan();
        melakukanKegiatan("berlari");
    }
}
