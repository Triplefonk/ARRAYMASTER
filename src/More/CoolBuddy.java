package More;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.String.copyValueOf;
import static java.lang.String.valueOf;

public class CoolBuddy {
    public static void main(String[] args) throws IOException {
        BufferedReader welldone = new BufferedReader(new InputStreamReader(System.in));
       /* String cool = welldone.readLine();
         while (!cool.equals("exit") ) {
             System.out.println(cool);
             cool = welldone.readLine();

         }*/

        /*for (short X = -5; X < 5; X++) {
            if (X == 2) {
                break;
            }
            System.out.println("hey bro " + X);
        }*/

        /*for (int i = 1; i < 3; i++) {
            for (int j = 0; j <= 3; j+=2) {
                System.out.println("outtablackhole " + j);
            }
            System.out.println("intoblackhole " + i);
        }*/

        /*-------------------
        short na = 1;
        while (na <= 10) {
            System.out.println(na);
            na++;
        }*/

        /*-------------------
        short na = 10;
        while (na >= 1) {
            System.out.println(na);
            na--;
        }*/

        /*-----------------
        for (int i = 1; i <= 100; i+=2) {



            System.out.print(i + 1 + " ");

        }*/

        /*----------------------
        String cool = welldone.readLine();
       int N = Integer.parseInt(welldone.readLine());
       int o = 1;


      while (o <= N) {


            System.out.print(cool+" ");

          o++;

           }*/

        /*------------------
        int m = Integer.parseInt(welldone.readLine());
        int n = Integer.parseInt(welldone.readLine());
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("8" + " ");
            }
            System.out.println("8");
        }*/

        /*-----------------
        int b1 = 1;
        while (b1 <= 10) {
            for (int b2 = 1; b2 < 10; b2++) {
                System.out.print("P"+ " ");
            }
            System.out.println("P");
            b1++;

        }*/

        byte n1 = Byte.parseByte(welldone.readLine());
        byte n2 = Byte.parseByte(welldone.readLine());
        while (true) {
            if (n1 == -1 || n2 == -1) {
                System.out.println(n1 + n2);
                break;
            }

            System.out.println(n1 + n2);


            n1 = Byte.parseByte(welldone.readLine());
            n2 = Byte.parseByte(welldone.readLine());
        }
            //}
            //}


            // for(int r = 0; r < 2; r++) {

            //    System.out.println("hey h");

            // }

            // int nub = 10;
            // nub = nub + 1;
            // System.out.println(nub);


        /*for(int kit = 0; kit <= 20; kit+=2) {
            System.out.println("lol" + kit);
        }
        System.out.println("lol what?");*/

        /*byte io = 10;
        while (io < 25) {
            System.out.println("ok " + io);
            io++;
        }

        byte fisting = 20;
        do {
            System.out.println("cool fisting " + fisting);
            fisting++;
        }while (fisting < 30);
        }*/


        }


    }
