package More;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OKOK {
    public static void main(String[] args) throws IOException {
        /*
        int ok = 12;
        if (ok > 15) {
            System.out.println("NAH");
        }

        if (ok > 18) {
            System.out.println("NORM");
        } else {
            System.out.println("LOL");
        }

         */
        BufferedReader omegalol = new BufferedReader(new InputStreamReader(System.in));

        /*
        System.out.println("Укажи свой возраст");
        int age = Integer.parseInt(omegalol.readLine());
        if (age >= 18 && age <= 30) {
            System.out.println("Развлекайся");
        } else if (age > 30 ) {
            System.out.println("Дед, найди себе жену");
        }
        else {
            System.out.println("Ты еще малой");
        }

         */

        /* ----------------------

        System.out.println("Введи первое число");
        byte firstnbr = Byte.parseByte(omegalol.readLine());
        System.out.println("Введи второе число");
        byte secondnbr = Byte.parseByte(omegalol.readLine());
        if (firstnbr > secondnbr) {
            System.out.println("Максимальное число: " + firstnbr);
        }
        else if (secondnbr > firstnbr) {
            System.out.println("Максимальное число: " + secondnbr);
        }

         */

        /* ------------------------
        System.out.println("Введи первое число");
        byte firstnbr = Byte.parseByte(omegalol.readLine());
        System.out.println("Введи второе число");
        byte secondnbr = Byte.parseByte(omegalol.readLine());
        System.out.println("Введи третье число");
        byte thirdnbr = Byte.parseByte(omegalol.readLine());
        if (firstnbr > secondnbr && firstnbr > thirdnbr) {
            System.out.println("Максимальное число: " + firstnbr);
        }
        if (secondnbr > firstnbr && secondnbr > thirdnbr) {
            System.out.println("Максимальное число: " + secondnbr);
        } else if (thirdnbr > firstnbr && thirdnbr > secondnbr){
            System.out.println("Максимальное число: " + thirdnbr);
        }

         */

        /* -----------------------
        System.out.println("Введи первое число");
        byte firstnbr = Byte.parseByte(omegalol.readLine());
        System.out.println("Введи второе число");
        byte secondnbr = Byte.parseByte(omegalol.readLine());
        System.out.println("Введи третье число");
        byte thirdnbr = Byte.parseByte(omegalol.readLine());
        if (firstnbr < secondnbr && firstnbr > thirdnbr || firstnbr > secondnbr && firstnbr < thirdnbr) {
            System.out.println("Среднее число: " + firstnbr);
        }
        if (secondnbr < firstnbr && secondnbr > thirdnbr || secondnbr > firstnbr && secondnbr < thirdnbr) {
            System.out.println("Среднее число: " + secondnbr);
        }
        if (thirdnbr < firstnbr && thirdnbr > secondnbr || thirdnbr > firstnbr && thirdnbr < secondnbr) {
            System.out.println("Среднее число: " + thirdnbr);
        }
        else {
            System.out.println("Среднего числа нет");
        }

         */

        /* -----------------
        int a = Integer.parseInt(omegalol.readLine());
        compare(a);

         */

        /* ------------
        int a = Integer.parseInt(omegalol.readLine());
        if (a > 0) {
            System.out.println(a*2);
        }
        if (a < 0) {
            System.out.println(a+10);
        }

         */

        byte a = Byte.parseByte(omegalol.readLine());
        byte b = Byte.parseByte(omegalol.readLine());
        closeToFive(a, b);

    }
    /* -----------
    private static int compare(int a) {

    if (a < 5){
            System.out.println("Число меьше 5");
    }
    if (a > 5){
        System.out.println("Число больше 5");
    }
    else if (a == 5) {
        System.out.println("Число равно 5");
    }
        return a;
    }

     */


    private static int checkinterval(int a) {
        if (a > 20 && a < 50) {
            System.out.println("Число "+a+" содержится в интервале.");
        }
        else {
            System.out.println("Число "+a+" не содержится в интервале");
        }
        return a;
    }

    private static void closeToFive(byte n1, byte n2) {
        if (n1 < n2 && n2 <5 || n1 > n2 && n2 > 5) {
            System.out.println("Ближайшее к 5 число "+ n2);
        }
        if (n2 > n1 && n1 > 5 || n2 < n1 && n1 < 5) {
            System.out.println("Ближайшее к 5 число "+ n1);
        }
        if (n1 == 5 || n2 == 5) {
            System.out.println("Найти ближайшее к 5 число невозможно, поскольку одно из них равно 5");
        }
        else if ((n1+n2) <= 9) {
            System.out.println("Ближайшее к 5 число "+ n2);
        }
        else if ((n1+n2) >= 11) {
            System.out.println("Ближайшее к 5 число "+ n1);
        }
        else if (n1 == n2) {
            System.out.println("Ближайшее к 5 число "+ n1);
        }

        //if (n1 == 4 && n2 == 6 || n2 == 4 && n1 == 6) {
        //    System.out.println("Оба числа являются ближайшими к 5");
        //}
        //if ((n1+n2) == 10){
        //    System.out.println("Оба числа являются ближайшими к 5");
        //}

    }
    }

