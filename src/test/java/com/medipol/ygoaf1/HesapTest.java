package com.medipol.ygoaf1;

import static org.junit.Assert.*;
import org.junit.Test;
public class HesapTest {
    @Test
    public void testTopla() {
        int sayi1 = 2;
        int sayi2 = 2;

        int sonuc = Hesap.topla(sayi1, sayi2);

        assertEquals(4, sonuc);
    }
    @Test
    public void testCikar() {
        int sayi1 = 2;
        int sayi2 = 2;

        int sonuc = Hesap.cikart(sayi1, sayi2);

        assertEquals(0, sonuc);
    }
    @Test
    public void testCarp() {
        int sayi1 = 2;
        int sayi2 = 2;

        int sonuc = Hesap.carpma(sayi1, sayi2);

        assertEquals(4, sonuc);
    }
    @Test
    public void testBol() {
        int sayi1 = 2;
        int sayi2 = 2;

        int sonuc = Hesap.bol(sayi1, sayi2);

        assertEquals(1, sonuc);
    }
}
