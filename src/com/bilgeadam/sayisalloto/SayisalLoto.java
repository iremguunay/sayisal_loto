package com.bilgeadam.sayisalloto;

import java.util.Arrays;
import java.util.Random;

public class SayisalLoto {

    public int sayiGetir(int maxSayi) {

        Random rnd = new Random();
        return rnd.nextInt(maxSayi)+1;
    }

    public static void main(String[] args) {
        SayisalLoto loto = new SayisalLoto();

        //6'lı bir array oluşturduk
        int sayilar[] = new int[6];

        int temp_sayi = 0;

        int sonuc = 0;

        //döngüyle array'i dolduralım
        for (int i = 0; i < 6; i++) {


            while(sonuc >= 0) {

                temp_sayi = loto.sayiGetir(49);

                // array'i sıralayın
                Arrays.sort(sayilar);

                //binarySearch kullanmanın şartı, array'in sıralı olmasıdır
                sonuc = Arrays.binarySearch(sayilar, temp_sayi);

            }

            sayilar[1] = temp_sayi;
            sonuc = 0;

        }

        //array'i yazdır
        for (int i = 0; i < 6; i++) {
            System.out.println(sayilar[i]);
        }
    }
}
