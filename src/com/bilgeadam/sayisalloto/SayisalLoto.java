package com.bilgeadam.sayisalloto;

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

        //döngüyle array'i dolduralım
        for (int i = 0; i < 6; i++) {
            sayilar[i] = loto.sayiGetir(49);
        }

        //array'i yazdır
        for (int i = 0; i < 6; i++) {
            System.out.println(sayilar[i]);
        }
    }
}
