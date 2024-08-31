/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo_2;

/**
 *
 * @author LENOVO
 */

public class Sekolah implements Informasi {
    private String namaSekolah;
    private String alamatSekolah;

    public Sekolah(String namaSekolah, String alamatSekolah) {
        this.namaSekolah = namaSekolah;
        this.alamatSekolah = alamatSekolah;
    }

    @Override
    public void cetakInfo() {
        System.out.println("Nama Sekolah: " + namaSekolah);
        System.out.println("Alamat Sekolah: " + alamatSekolah);
    }
}