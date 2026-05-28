package org.example.zadanie1;

public class MergeSortAktualny {

    public static void sortuj(int[] tablica) {
        if (tablica == null || tablica.length < 2) {
            return;
        }
        mergeSort(tablica, 0, tablica.length - 1);
    }


    private static void mergeSort(int[] tablica, int lewy, int prawy) {
        if (lewy < prawy) {
            int srodek = lewy + (prawy - lewy) / 2;

            mergeSort(tablica, lewy, srodek);
            mergeSort(tablica, srodek + 1, prawy);

            scal(tablica, lewy, srodek, prawy);
        }
    }


    private static void scal(int[] tablica, int lewy, int srodek, int prawy) {
        int n1 = srodek - lewy + 1;
        int n2 = prawy - srodek;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; ++i) L[i] = tablica[lewy + i];
        for (int j = 0; j < n2; ++j) R[j] = tablica[srodek + 1 + j];

        int i = 0, j = 0;
        int k = lewy;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                tablica[k] = L[i];
                i++;
            } else {
                tablica[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            tablica[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            tablica[k] = R[j];
            j++;
            k++;
        }
    }


    public static void main(String[] args) {
        int[] dane = {38, 27, 43, 3, 9, 82, 10};
        System.out.println("Tablica wejściowa:");
        for (int x : dane) {
            System.out.print(x + " ");
        }

        sortuj(dane);

        System.out.println("\nTablica posortowana:");
        for (int x : dane) {
            System.out.print(x + " ");
        }
    }
}
