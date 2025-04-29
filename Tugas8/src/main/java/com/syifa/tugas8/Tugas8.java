package com.syifa.tugas8;

/**
 *
 * @author Syifa Nur Azizah Suhud - 2305056
 */
import java.util.Scanner;

public class Tugas8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sisi1 : ");
        double sisi1 = input.nextDouble();

        System.out.print("Masukkan sisi2 : ");
        double sisi2 = input.nextDouble();

        System.out.print("Masukkan sisi3 : ");
        double sisi3 = input.nextDouble();

        System.out.print("Masukkan warna: ");
        String color = input.next();

        System.out.print("Apakah segitiga diisi warna? (true/false): ");
        boolean filled = input.nextBoolean();

        Segitiga segitiga = new Segitiga(sisi1, sisi2, sisi3);
        segitiga.setColor(color);
        segitiga.setFilled(filled);

        System.out.println(segitiga.toString());
        System.out.println("Luas: " + segitiga.getArea());
        System.out.println("Keliling: " + segitiga.getPerimeter());
        System.out.println("Warna: " + segitiga.getColor());
        System.out.println("Diisi warna: " + segitiga.isFilled());
    }
}

