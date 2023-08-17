package Dodo;

public class GDS {
    public static void main(String[] args) {
    /*
        int fk = sum(213, 532);
        System.out.println(fk);



        System.out.println(sum(231, 451));
        */

        int rer = sum(213, 123);
        System.out.println(rer);



        // System.out.println(convert("lol");

        printtwotimez("oro");

        byte yikes = coldy((byte) 6, (byte) -7);
        System.out.println(yikes);

        System.out.println(cream(10, 9));
        long creamy = cream(9,1);
        System.out.println(creamy);

        System.out.println(lily((short) 9, (short) 137));

       // double q = convert(1123);
       // System.out.println(q);
        System.out.println(convert(451));

        System.out.println(percent(7));

        print("man");



    }

    static int sum(int nb1, int nb2) {

    int res = nb1 + nb2;
    return res;
    }
    //private static String convert(String str) {
     //   String lol = str + " man";
     //   return lol;

  //  }

    private static void printtwotimez(String str){

        System.out.println(str);
        System.out.println(str);
    }

    private static byte coldy(byte y1, byte y2) {
        byte yikes = (byte) (y1 * y2);
        return yikes;


    }

    private static long cream(long b1, long b2) {
        long creamy = b2 - b1;
        return creamy;

    }

    static short lily(short k1, short k2){
        short lulu = (short) (k2 / k1);
        return lulu;
    }

    private static double convert(double number) {
        double q = 1.08656 * number;
        return q;
    }

    private static double percent(double nb) {
        double pr = nb + ((nb*10)/100);
        return pr;
    }

    private static String print(String str) {
        String ok = str;
        System.out.println(ok);
        System.out.println(ok);
        System.out.println(ok);
        System.out.println(ok);
        return ok;
    }




}
