package org.example.cwiczenie1;

public class MaxLiczba {
    public static int znajdzMax(int[] tablica) {
        if (tablica == null || tablica.length == 0) {
            throw new IllegalArgumentException("Tablica nie może być pusta");
        }
        int max = tablica[0];
        for (int i = 1; i < tablica.length; i++) {
            if (tablica[i] > max) {
                max = tablica[i];
            }
        }
        return max;
    }
}
