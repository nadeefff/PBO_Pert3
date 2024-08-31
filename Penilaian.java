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
public class Penilaian implements Informasi {
    private String jenisPenilaian;
    private int skor;

    public Penilaian(String jenisPenilaian, int skor) {
        this.jenisPenilaian = jenisPenilaian;
        this.skor = skor;
    }

    @Override
    public void cetakInfo() {
        System.out.println("Jenis Penilaian: " + jenisPenilaian);
        System.out.println("Skor: " + skor);
    }
}
