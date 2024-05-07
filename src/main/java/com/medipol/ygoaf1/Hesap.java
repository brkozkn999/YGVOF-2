package com.medipol.ygoaf1;

public class Hesap {
    public static int topla(int sayi1, int sayi2) {
        return sayi1 + sayi2;
    }

    public static int cikart(int sayi1, int sayi2) {
        return sayi1 - sayi2;
    }

    public static int carpma(int sayi1, int sayi2) {
        return sayi1 * sayi2;
    }

    public static int bol(int sayi1, int sayi2) {
        if (sayi1 == 0 || sayi2 == 0)
            return 0;

        return sayi1 / sayi2;
    }
}
