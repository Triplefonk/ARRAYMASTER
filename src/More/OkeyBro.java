package More;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OkeyBro {

    public static void main(String[] args) throws IOException {
        BufferedReader nicebro = new BufferedReader(new InputStreamReader(System.in));
/*
        InputStreamReader streamReader = new InputStreamReader(System.in);
        System.out.println((char)streamReader.read());

        while (true) {
            int ara = System.in.read();
            System.out.println(ara);
        }



        String alright = nicebro.readLine();
        String alrightnight = nicebro.readLine();
        String alrightko = nicebro.readLine();
        System.out.println(alright);
        System.out.println(alrightnight);
        System.out.println(alrightko);
*/
        // String ok = nicebro.readLine();
      //  byte genius = Byte.parseByte(nicebro.readLine());
      //  byte genius2 = Byte.parseByte(nicebro.readLine());
      //  System.out.println(plus(genius, genius2));
/*

Один из вариантов написать строчку "Я зарабатываю $n в месяц".
       String ok = nicebro.readLine();
       System.out.println("я зарабатываю $" + ok +" в месяц");
*/

       // String ok = nicebro.readLine();
       // System.out.println(lol("Я зарабатываю $ ")+ok+lol(" в месяц"));

        System.out.println("Введите имя");
        String name = nicebro.readLine();
        System.out.println("Введите, какую зарплату " + name + " будет получать в рублях");
        String nb1 = nicebro.readLine();
        System.out.println("Введите количество лет, через которое " + name + " будет получать зарплату");
        String nb2 = nicebro.readLine();
        String phrase1 = " будет получать ";
        String phrase2 = " через ";
        String phrase3 = " лет ";
        //System.out.println(name + gets(" будет получать ")+ nb1+gets(" через ")+ nb2+gets(" лет"));
        //System.out.println(name+" будет получать "+ nb1 + " через " + nb2 + " лет ");
        System.out.println(phrasing(name, phrase1, nb1, phrase2, nb2, phrase3));

    }
    private static int plus(int nb1, int nb2) {
        int koko = nb1 + nb2;
        return koko;
    }


    private static String lol(String man) {
        String well = man;
        return well;
    }

    private static String gets(String fefe) {

        return fefe;

    }
    private static String phrasing(String k1, String k2, String k3, String k4, String k5, String k6) {
        String hi = k1 + k2 + k3 + k4 + k5 + k6;
        return hi;
    }

}

