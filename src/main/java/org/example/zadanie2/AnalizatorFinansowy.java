package org.example.zadanie2;

public class AnalizatorFinansowy {
    public static int obliczDniBezWydatkow(int[] wydatki) {
        if (wydatki == null || wydatki.length == 0) return 0;
        int dniBezWydatkow = 0;
        for (int i = 0; i < wydatki.length - 1; i++) {
            if (wydatki[i] == 0) dniBezWydatkow++;
        }
        return dniBezWydatkow;
    }

    public static void wyswietlWydatkiPowyzej(int[] wydatki, int prog) {
        if (wydatki == null || wydatki.length == 0) return;
        for (int i = 0; i < wydatki.length - 1; i++) {
            if (wydatki[i] > prog) System.out.println(wydatki[i]);
        }
    }

    public static int obliczSumeWydatkow(int[] wydatki, int indeks) {
        if (wydatki == null || indeks >= wydatki.length || indeks < 0) return 0;
        return wydatki[indeks] + obliczSumeWydatkow(wydatki, indeks + 1);
    }
}
