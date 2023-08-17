package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Arrays {
    public static void main(String[] args) throws IOException {
        BufferedReader yo = new BufferedReader(new InputStreamReader(System.in));



        /*int arr[] = new int[3];

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i +1;
            System.out.println(arr[i]);
        }*/

        //int [] jo = new int[5] /*{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}*/;

        /*-------------
        jo [0] = Integer.parseInt(yo.readLine());
        jo [1] = Integer.parseInt(yo.readLine());
        jo [2] = Integer.parseInt(yo.readLine());
        jo [3] = Integer.parseInt(yo.readLine());
        jo [4] = Integer.parseInt(yo.readLine());

        System.out.println(jo [0]);
        System.out.println(jo [1]);
        System.out.println(jo [2]);
        System.out.println(jo [3]);
        System.out.println(jo [4]);*/

        /*----------
        byte [] io = new byte[] {4, 10, 5, 3, 2};
        for (byte i = 0; i < io.length; i++) {
            System.out.println(io[i]);
        }*/

        /*----------
        byte [] io = new byte[] {4, 10, 5, 3, 2};


            System.out.println(io[0]+io[1]+io[2]+io[3]+io[4]);
        */

        /*-----------
        int [] po = new int[] {293,34,7,5,12};

            if (po[0] < po[1] & po[0]< po[2] & po[0]< po[3]&po[0]< po[4]) {
                System.out.println("Наименьшее число: " + po[0]);
            }
            if (po[1] < po[0] & po[1]< po[2] & po[1]< po[3]&po[1]< po[4]){
                System.out.println("Наименьшее число: "+ po[1]);
            }
            if (po[2] < po[0] & po[2]<po[1] & po[2]<po[3]&po[2]<po[4]){
                System.out.println("Наименьшее число: "+ po[2]);
            }
            if (po[3] < po[0] & po[3]< po[1] & po[3]<po[2]&po[3]<po[4]){
            System.out.println("Наименьшее число: "+ po[3]);
            }
            else {
            System.out.println("Наименьшее число: "+ po[4]);
            }*/


        /*-------
        for (int i = 1; i < initializeArray().length; i++) {
            System.out.println(i);
        }*/


       // initializeArray() [0] = Integer.parseInt(yo.readLine());
       // System.out.println(i);


        /*for (int i = 0; i < initializeArray().length; i++) {
            initializeArray() [i] = Integer.parseInt(yo.readLine());
            System.out.println(i);
        }*/

        // initializeArray() [3] = Integer.parseInt(yo.readLine());
       // initializeArray() [4] = Integer.parseInt(yo.readLine());
        //initializeArray() [5] = Integer.parseInt(yo.readLine());
       // initializeArray() [6] = Integer.parseInt(yo.readLine());
       // initializeArray() [7] = Integer.parseInt(yo.readLine());
        //initializeArray() [8] = Integer.parseInt(yo.readLine());
        //initializeArray() [9] = Integer.parseInt(yo.readLine());

        //System.out.println(Arrays.initializeArray()[0]);

        /*for (int j = 0; j < initializeArray().length; j++) {
            initializeArray() [j] = Integer.parseInt(yo.readLine());
            System.out.println(j);
        }*/

        /*for (int i = 0; i < initializeArray().length; i++) {
            System.out.println(i);
        }*/

        /*initializeArray();*/

        /*---------------
        int [] array = new int [] {10, 2, 4, 6, 2, 4, 8, 9, 2, 3};
        max(array);*/

        int [] fa = new int [] {8, 8, 8, 8, 8, 8, 8, 8, 8, 8};
        //int [] fa1 = new int [10];


        for (int i = 0; i < fa.length; i++) {
            for (int j = 0; j <= i; j++) {


                System.out.print(fa [j]);

            }
            System.out.println();

            }

            //System.out.println(fa1 [i]);
        }
























        /*-------------
        for (int i = 0; i < jo.length; i++) {
            jo[i] = i + 1;
            System.out.println(jo[i]);
        }*/

        /*------------
        for (int i = 0; i < jo.length; i++) {
            jo[i] = 10 - i;
            System.out.println(jo[i]);
        }*/
        /*----------
        for (int i = 9; i < jo.length; i++) {
            jo[i] = i + 1;
            System.out.println(jo[i]);
        }*/
        /*------------
        for (int i = 0; i < jo.length; i++) {
            jo[i] = 29 - i;
            System.out.println(jo[i]);
        }*/





    public static void initializeArray() throws IOException {
        BufferedReader yo = new BufferedReader(new InputStreamReader(System.in));
        int[] a1 = new int[10];
        /*a1 [0] = Integer.parseInt(yo.readLine());
        a1 [1] = Integer.parseInt(yo.readLine());
        a1 [2] = Integer.parseInt(yo.readLine());
        a1 [3] = Integer.parseInt(yo.readLine());
        a1 [4] = Integer.parseInt(yo.readLine());
        a1 [5] = Integer.parseInt(yo.readLine());
        a1 [6] = Integer.parseInt(yo.readLine());
        a1 [7] = Integer.parseInt(yo.readLine());
        a1 [8] = Integer.parseInt(yo.readLine());
        a1 [9] = Integer.parseInt(yo.readLine());*/
        for (int j = 0; j < a1.length; j++) {
            a1 [j] = Integer.parseInt(yo.readLine());

        }

        for (int i = 0; i < a1.length; i++) {
            System.out.println(a1[i]);
        }




    }
    public static void max(int [] array) {
        //array = new int[] {10, 3, 4, 67, 1, 8, 4, 5, 3, 2};
        if (array [0] > array [1] & array [0] > array [2] & array [0] > array [3] & array [0] > array [4] & array [0] > array [5] & array [0] > array [6] & array [0] > array [7] & array [0] > array [8] & array [0] > array [9]){
            System.out.println(array [0] + " is a maximum number");
        }
        if (array [1] > array [0] & array [1] > array [2] & array [1] > array [3] & array [1] > array [4] & array [1] > array [5] & array [1] > array [6] & array [1] > array [7] & array [1] > array [8] & array [1] > array [9]){
            System.out.println(array [1] + " is a maximum number");
        }
        if (array [2] > array [0] & array [2] > array [1] & array [2] > array [3] & array [2] > array [4] & array [2] > array [5] & array [2] > array [6] & array [2] > array [7] & array [2] > array [8] & array [2] > array [9]){
            System.out.println(array [2] + " is a maximum number");
        }
        if (array [3] > array [0] & array [3] > array [1] & array [3] > array [2] & array [3] > array [4] & array [3] > array [5] & array [3] > array [6] & array [3] > array [7] & array [3] > array [8] & array [3] > array [9]){
            System.out.println(array [3] + " is a maximum number");
        }
        if (array [4] > array [0] & array [4] > array [1] & array [4] > array [2] & array [4] > array [3] & array [4] > array [5] & array [4] > array [6] & array [4] > array [7] & array [4] > array [8] & array [4] > array [9]){
            System.out.println(array [4] + " is a maximum number");
        }
        if (array [5] > array [0] & array [5] > array [1] & array [5] > array [2] & array [5] > array [3] & array [5] > array [4] & array [5] > array [6] & array [5] > array [7] & array [5] > array [8] & array [5] > array [9]){
            System.out.println(array [5] + " is a maximum number");
        }
        if (array [6] > array [0] & array [6] > array [1] & array [6] > array [2] & array [6] > array [3] & array [6] > array [4] & array [6] > array [5] & array [6] > array [7] & array [6] > array [8] & array [6] > array [9]){
            System.out.println(array [6] + " is a maximum number");
        }
        if (array [7] > array [0] & array [7] > array [1] & array [7] > array [2] & array [7] > array [3] & array [7] > array [4] & array [7] > array [5] & array [7] > array [6] & array [7] > array [8] & array [7] > array [9]){
            System.out.println(array [7] + " is a maximum number");
        }
        if (array [8] > array [0] & array [8] > array [1] & array [8] > array [2] & array [8] > array [3] & array [8] > array [4] & array [8] > array [5] & array [8] > array [6] & array [8] > array [7] & array [8] > array [9]){
            System.out.println(array [8] + " is a maximum number");
        }
        if (array [9] > array [0] & array [9] > array [1] & array [9] > array [2] & array [9] > array [3] & array [9] > array [4] & array [9] > array [5] & array [9] > array [6] & array [9] > array [7] & array [9] > array [8]){
            System.out.println(array [9] + " is a maximum number");
        }


    }


}
