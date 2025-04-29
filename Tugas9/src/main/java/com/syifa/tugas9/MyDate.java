package com.syifa.tugas9;

/**
 *
 * @author BRIN
 */
public class MyDate {
    private int hari, bulan, tahun;

    public MyDate(int hari, int bulan, int tahun) {
        this.hari = hari;
        this.bulan = bulan;
        this.tahun = tahun;
    }

    public String toString() {
        return hari + "/" + bulan + "/" + tahun;
    }
}
