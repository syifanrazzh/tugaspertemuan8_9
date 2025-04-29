package com.syifa.tugas9;

/**
 *
 * @author Syifa Nur Azizah Suhud - 2305056
 */
public class Faculty extends Employee {
    private String jamKerja;
    private String pangkat;

    public Faculty(String nama, String alamat, String telepon, String email,
                   String kantor, double gaji, MyDate tglDipekerjakan,
                   String jamKerja, String pangkat) {
        super(nama, alamat, telepon, email, kantor, gaji, tglDipekerjakan);
        this.jamKerja = jamKerja;
        this.pangkat = pangkat;
    }

    @Override
    public String toString() {
        return "Class: Faculty, Nama: " + nama;
    }
}
