package com.syifa.tugas9;

/**
 *
 * @author Syifa Nur Azizah Suhud - 2305056
 */
public class Student extends Person {
    public static final String MABA = "Mahasiswa Baru";
    public static final String KEDUA = "Mahasiswa Tahun Kedua";
    public static final String JUNIOR = "Junior";
    public static final String SENIOR = "Senior";

    private final String status;

    public Student(String nama, String alamat, String telepon, String email, String status) {
        super(nama, alamat, telepon, email);
        this.status = status;
    }

    @Override
    public String toString() {
        return "Class: Student, Nama: " + nama;
    }
}
