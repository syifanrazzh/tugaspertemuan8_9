package com.syifa.tugas9;

/**
 *
 * @author Syifa Nur Azizah Suhud - 2305056
 */
public class Employee extends Person {
    protected String kantor;
    protected double gaji;
    protected MyDate tglDipekerjakan;

    public Employee(String nama, String alamat, String telepon, String email,
                    String kantor, double gaji, MyDate tglDipekerjakan) {
        super(nama, alamat, telepon, email);
        this.kantor = kantor;
        this.gaji = gaji;
        this.tglDipekerjakan = tglDipekerjakan;
    }

    @Override
    public String toString() {
        return "Class: Employee, Nama: " + nama;
    }
}
