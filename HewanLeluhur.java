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
public abstract class HewanLeluhur {
    public abstract void sukaTanduk();
    
    public void punyaSarang() {
        System.out.println("Sarang dari hewan leluhur");
    }

    public void belajar() {
        System.out.println("Belajar tentang perilaku hewan");
    }

    // Metode yang akan di-override
    public void melakukanKegiatan() {
        System.out.println("Hewan leluhur melakukan kegiatan umum");
    }
    
    // Metode yang akan di-overload
    public void melakukanKegiatan(String kegiatan) {
        System.out.println("Hewan leluhur melakukan kegiatan: " + kegiatan);
    }
}

