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
public class HewanInduk extends HewanLeluhur {
    public void mencariMakan() {
        System.out.println("Hewan induk mencari makan");
    }
    
    @Override
    public void sukaTanduk() {
        System.out.println("Suka tanduk dari kelas HewanLeluhur");
    }

    @Override
    public void melakukanKegiatan() {
        System.out.println("Hewan induk melakukan kegiatan spesifik");
    }
    
    // Tidak perlu override metode melakukanKegiatan(String), karena overload otomatis.
}
