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
public class Guru implements Informasi {
    private String namaGuru;
    private String mataPelajaranYangDiajarkan;

    public Guru(String namaGuru, String mataPelajaranYangDiajarkan) {
        this.namaGuru = namaGuru;
        this.mataPelajaranYangDiajarkan = mataPelajaranYangDiajarkan;
    }

    @Override
    public void cetakInfo() {
        System.out.println("Nama Guru: " + namaGuru);
        System.out.println("Mata Pelajaran yang Diajarkan: " + mataPelajaranYangDiajarkan);
    }
}