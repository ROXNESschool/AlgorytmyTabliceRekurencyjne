package org.example;

public class Main {
    public static void main(String[] args) {
        int[] wydatki = {0, 250, 90, 0, 1340, 76, 460, 0, 1000, 216, 63, 520};

        System.out.println("Dni bez wydatków:\n" + AnalizatorFinansowy.obliczDniBezWydatkow(wydatki));
        System.out.println("Wydatki powyżej 100:");
        AnalizatorFinansowy.wyswietlWydatkiPowyzej(wydatki, 100);
        System.out.println("Suma wydatków:\n" + AnalizatorFinansowy.obliczSumeWydatkow(wydatki, 0));
    }
}