package com.rizkykhapidsyah.controlflow;

public class Main {
    public static void main(String[] args) {

        int X = 0;

        while (true) {
            X++;
            System.out.println("Perulangan Nilai Ke: " + X);

            if (X == 10) {
                System.out.println("\nBerhenti karena Nilai sudah sampai: " + X);
                break;                  //Keyword untuk memaksa program keluar dari Looping
            } else if (X == 5) {
                System.out.println("\nContinue!\n");
                continue;               //Keyword untuk memaksa program memulai aksi dari awal
            } else if (X == 8) {
                System.out.println("\nReturn!\n");
                return;                 //Keyword untuk memaksa program keluar dari method
            }
        }

    }
}
