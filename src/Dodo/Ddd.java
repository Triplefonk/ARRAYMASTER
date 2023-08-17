package Dodo;
// number[20] - 4 bytes
public class Ddd {

    public static void main(String[] args) {
       byte HB = 120; // Byte
       short HS = 190; // Short
       char HC = 1641; // Character
       int HI = 43; // Integer
        long HL = 1231243124124142L; // Long
        boolean bool = true; // Boolean
        float HF = 23.123123F; // Float
        double HD = 23.7647116481; // Double
        // System.out.println(HC);
        HC = 2632;
       // System.out.println(HC);
        char HHC = 13141;
        HC = HHC;
       // System.out.println(HC);
/*
        String str = "41";

      System.out.println(str + " world");
        System.out.println(HI * 5);

        long lol = Long.parseLong(str);
        System.out.println(lol * 14);

        System.out.println();


        int res = sum (1, 2);
        System.out.println(res);
 */

        String str = "lol";
        System.out.println (convert( "lol"));
    }

    public static int sum (int nb1, int nb2) {
        int res = nb1 + nb2;
        return res;
    }

    public static String convert(String str) {

    String res = str + " lol";
    return res;
    }
    }

