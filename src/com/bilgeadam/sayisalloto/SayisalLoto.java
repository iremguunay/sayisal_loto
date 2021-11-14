package com.bilgeadam.sayisalloto;

import java.util.Random;

public class SayisalLoto {

    public int sayiGetir(int maxSayi) {

        Random rnd = new Random();
        return rnd.nextInt(maxSayi)+1;
    }

    public static void main(String[] args) {
        SayisalLoto loto = new SayisalLoto();

        for (int i = 1; i <= 10; i++) {
            System.out.println(loto.sayiGetir(49));
        }
    }
}
