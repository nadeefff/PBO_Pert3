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
    public class Utama{
    public static void main(String[] args) {
        // Membuat instance dari MataPelajaran
        MataPelajaran matematika = new MataPelajaran("Matematika", 101);

        // Membuat instance dari Siswa
        Siswa siswa = new Siswa("Alice", 85, matematika);

        // Membuat instance dari Penilaian
        Penilaian penilaian = new Penilaian("Ulangan Tengah Semester", 90);

        // Membuat instance dari Sekolah
        Sekolah sekolah = new Sekolah("SMA Negeri 1", "Jl. Pendidikan No. 45");

        // Membuat instance dari Guru
        Guru guru = new Guru("Bapak Budi", "Matematika");

        // Menampilkan informasi dari MataPelajaran
        System.out.println("Informasi Mata Pelajaran:");
        matematika.cetakInfo();

        // Menampilkan informasi dari Siswa
        System.out.println("\nInformasi Siswa:");
        siswa.cetakInfo();

        // Menampilkan informasi dari Penilaian
        System.out.println("\nInformasi Penilaian:");
        penilaian.cetakInfo();

        // Menampilkan informasi dari Sekolah
        System.out.println("\nInformasi Sekolah:");
        sekolah.cetakInfo();

        // Menampilkan informasi dari Guru
        System.out.println("\nInformasi Guru:");
        guru.cetakInfo();
    }
}