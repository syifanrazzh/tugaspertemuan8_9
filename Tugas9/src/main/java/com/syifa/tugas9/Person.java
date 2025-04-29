package com.syifa.tugas9;

/**
 *
 * @author Syifa Nur Azizah Suhud - 2305056
 */
public class Person {
    protected String nama;
    protected String alamat;
    protected String telepon;
    protected String email;

    public Person(String nama, String alamat, String telepon, String email) {
        this.nama = nama;
        this.alamat = alamat;
        this.telepon = telepon;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Class: Person, Nama: " + nama;
    }
}
