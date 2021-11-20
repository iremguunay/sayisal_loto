package com.bilgeadam.sayisalloto;

import java.util.Arrays;
import java.util.Random;

public class SayisalLoto_array {

    //Static değişkene obje oluşturmadan
    //Class_adı.degisken diye erişebiliyoruz
    private static final int MAX_SAYI = 90;
    private static final int KAC_SAYI = 6;
    Random rnd = new Random();
    

    public int sayiGetir() {
        //nextInt(90) metodu 0-89 arası üretir
        //1'den başlaması için 1 ekliyoruz
        return rnd.nextInt(MAX_SAYI)+1;
    }

    public boolean arraydeVarMi(int[] sayilar, int sayi) {
        //binarySearch ile arayacağız.
        //binarySearch kullanma şartı, array'in sıralı olmasıdır

        //gelen array'i sıralıyorum
        Arrays.sort(sayilar);

        int sonuc = Arrays.binarySearch(sayilar, sayi);

        if (sonuc >= 0)
            return true;
        else
            return false;

    }

    public void testArraydeVarMi () {
        int sayilar[] = {13,35,67,-4,41,70};

        int sayi = 68;

        boolean sonuc = arraydeVarMi(sayilar, sayi);

        if (sonuc == true)
            System.out.println("Array'de var!");
        else
            System.out.println("Array'de yok!");
    }

    public static void main(String[] args) {
        //Yeni çılgın sayısal loto'ya uygun.
        //90 sayıdan 6 tane seçeceğiz.
        //https://www.millipiyangoonline.com/cekilis-sonuclari#sayisaloto
        
        //sayıları tutacağımız bir array tanımlıyoruz
       // int sayilar[] = new int[KAC_SAYI];
        
        //Döngü ile array'e rastgele sayı atıyoruz
       // for (int i = 0; i < sayilar.length; i++) {

        //}

        SayisalLoto_array loto = new SayisalLoto_array();
        loto.testArraydeVarMi();

    }
}
