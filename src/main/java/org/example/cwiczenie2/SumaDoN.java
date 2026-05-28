package org.example.cwiczenie2;

public class SumaDoN {
    public static int sumaDoN(int n) {
        if (n <= 0) {
            return 0;
        }
        return n + sumaDoN(n - 1);
    }
}
