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
public class MataPelajaran implements Informasi {
    private String namaMataPelajaran;
    private int kodeMataPelajaran;

    public MataPelajaran(String namaMataPelajaran, int kodeMataPelajaran) {
        this.namaMataPelajaran = namaMataPelajaran;
        this.kodeMataPelajaran = kodeMataPelajaran;
    }

    @Override
    public void cetakInfo() {
        System.out.println("Nama Mata Pelajaran: " + namaMataPelajaran);
        System.out.println("Kode Mata Pelajaran: " + kodeMataPelajaran);
    }
}
