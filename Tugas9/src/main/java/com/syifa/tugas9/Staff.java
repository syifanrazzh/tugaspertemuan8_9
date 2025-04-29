package com.syifa.tugas9;

/**
 *
 * @author Syifa Nur Azizah Suhud - 2305056
 */
public class Staff extends Employee {
    private String gelar;

    public Staff(String nama, String alamat, String telepon, String email,
                 String kantor, double gaji, MyDate tglDipekerjakan, String gelar) {
        super(nama, alamat, telepon, email, kantor, gaji, tglDipekerjakan);
        this.gelar = gelar;
    }

    @Override
    public String toString() {
        return "Class: Staff, Nama: " + nama;
    }
}

