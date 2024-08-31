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
public class Siswa implements Informasi {
    private String namaSiswa;
    private int nilai;
    private MataPelajaran mataPelajaran;

    public Siswa(String namaSiswa, int nilai, MataPelajaran mataPelajaran) {
        this.namaSiswa = namaSiswa;
        this.nilai = nilai;
        this.mataPelajaran = mataPelajaran;
    }

    @Override
    public void cetakInfo() {
        System.out.println("Nama Siswa: " + namaSiswa);
        System.out.println("Nilai: " + nilai);
        mataPelajaran.cetakInfo(); // Menampilkan informasi mata pelajaran yang terkait
    }
}
