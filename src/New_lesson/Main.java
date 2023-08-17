package New_lesson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader hi = new BufferedReader(new InputStreamReader(System.in));
        /*User man = new User();
        System.out.println(man.toString());

        User woman = new User();
        System.out.println(woman.toString());*/

        /*Human DAD = new Human("Pavel", true, 35);
        Human MOM = new Human("Beth", false, 30);



        Human CHILD1 = new Human("Jio", true, 14);
        Human CHILD2 = new Human("Jinna", false, 15);

        Human GRANDDAD1 = new Human("Dimb", true, 64);
        Human GRANDDAD2 = new Human("Drend", true, 66);
        Human GRANDMOM1 = new Human("Piala", false, 63);
        Human GRANDMOM2 = new Human("Lola", false, 61);


        System.out.println("Дедушка и бабушка по маминой линии: ");
        System.out.println();
        System.out.println("Дедушка: \n" + GRANDDAD1);
        System.out.println();
        System.out.println("Бабушка: \n" + GRANDMOM1);
        System.out.println();
        System.out.println("Дедушка и бабушка по папиной линии: ");
        System.out.println();
        System.out.println("Дедушка: \n" + GRANDDAD2);
        System.out.println();
        System.out.println("Бабушка: \n" + GRANDMOM2);
        System.out.println();
        System.out.println("Родители: ");
        System.out.println();
        System.out.println("Мама: \n" + MOM);
        System.out.println();
        System.out.println("Папа: \n" + DAD);
        System.out.println();
        System.out.println("Дети: ");
        System.out.println();
        System.out.println("Брат: \n" + CHILD1);
        System.out.println();
        System.out.println("Сестра: \n" + CHILD2);
        System.out.println();
        System.out.println("Родовое древо: ");
        System.out.println();
        System.out.println("Брат: \n"
                + CHILD1
                + "\nпапа: "
                + DAD.getName()
                + "\nмама: "
                + MOM.getName()
                + "\nдедушка по маминой линии: "
                + GRANDDAD1.getName()
                +"\nбабушка по маминой линии: "
                +GRANDMOM1.getName()
                +"\nдедушка по папиной линии: "
                +GRANDDAD2.getName()
                +"\nбабушка по папиной линии: "
                +GRANDMOM2.getName());
        System.out.println();
        System.out.println(
                "Сестра: \n"
                + CHILD2
                + "\nпапа: "
                + DAD.getName()
                + "\nмама: "
                + MOM.getName()
                        + "\nдедушка по маминой линии: "
                        + GRANDDAD1.getName()
                        +"\nбабушка по маминой линии: "
                        +GRANDMOM1.getName()
                        +"\nдедушка по папиной линии: "
                        +GRANDDAD2.getName()
                        +"\nбабушка по папиной линии: "
                        +GRANDMOM2.getName());
        System.out.println();
        System.out.println("мама: \n"
                + MOM
                + "\nдочь: "
                + CHILD2.getName()
                + "\nсын: "
                + CHILD1.getName()
                + "\nпапа (дедушка): "
                + GRANDDAD1.getName()
                +"\nмама (бабушка): "
                + GRANDMOM1.getName()
                + "\nмуж: "
                + DAD.getName());
        System.out.println();
        System.out.println("папа: \n"
                + DAD + "\nдочь: "
                + CHILD2.getName()
                + "\nсын: "
                + CHILD1.getName()
                + "\nпапа (дедушка): "
                + GRANDDAD2.getName()
                + "\nмама (бабушка): "
                + GRANDMOM2.getName()
        + "\nжена: "
        + MOM.getName());*/


        /* -----------------
        Human dad = new Human("Fed", true, 31);
        Human mom = new Human("Jina", false, 30);

        Human dadgrndpa = new Human("Festor", true, 65);
        Human dadgrndma = new Human("Lena", false, 63);
        Human momgrndpa = new Human("Falik", true, 67);
        Human momgrndma = new Human("Dora", false, 65);

        Human sister = new Human("Feya", false, 14, mom, dad);
        Human brother = new Human("Restor", true, 15, mom, dad);

        System.out.println(dadgrndpa+", Son: "+ dad.getName()+ ", Wife: "+dadgrndma.getName());
        System.out.println(dadgrndma+", Son: "+ dad.getName()+ ", Husband: "+dadgrndpa.getName());
        System.out.println(momgrndpa+", Daughter: "+mom.getName()+ ", Wife: "+momgrndma.getName());
        System.out.println(momgrndma+", Daughter: "+mom.getName()+ ", Husband: "+momgrndpa.getName());
        System.out.println(dad+", Mom: "+dadgrndma.getName()+", Dad: "+dadgrndpa.getName()+ ", Son: "+ brother.getName()+ ", Daughter: "+sister.getName());
        System.out.println(mom+", Mom: "+momgrndma.getName()+", Dad: "+momgrndpa.getName()+ ", Son: "+ brother.getName()+ ", Daughter: "+sister.getName());
        System.out.println(sister+", Grandpa1: "+dadgrndpa.getName()+", Grandpa2: "+momgrndpa.getName()+", Grandma1: "+dadgrndma.getName()+", Grandma2: "+momgrndma.getName());
        System.out.println(brother+", Grandpa1: "+dadgrndpa.getName()+", Grandpa2: "+momgrndpa.getName()+", Grandma1: "+dadgrndma.getName()+", Grandma2: "+momgrndma.getName());*/

        /*printArray();*/

        /*----------------
        String [] kol = new String[5];
        int [] kola = new int[5];
        for (int i = 0; i < kol.length; i++) {
            kol [i] = hi.readLine();

        }

        for (int j = 0; j < kol.length; j++) {
            int size = kol[j].length();
            for (int i = 0; i < kola.length; i++) {
                kola [i] = size;

            }
            System.out.println(kola [j]);

        }*/

        int [] kip = new int[10];
        for (int i = 0; i < kip.length; i++) {
            kip[i] = Integer.parseInt(hi.readLine());

        }

        int [] kiss = new int[5];
        int [] turtle = new int[5];



        /*for (int i = 0; i < 5; i++) {
             kiss [i] = kip [i];



                System.out.println(kiss [i]);


        }*/
        
        for (int j = 0; j < turtle.length; j++) {

            turtle [j] = kip[j+5];
            System.out.println(turtle[j]);

        }


        /*kiss [0] = kip[0];
        System.out.println(kiss[0]);
        turtle [0] = kip[4];
        System.out.println(turtle[0]);*/

        /*for (int i = 0; i < kip.length; i++) {
            for (int j = 0; j < 5; j++) {
                kiss [j] = kip[i];


            }
            System.out.println(kiss[i]);


        }
        for (int i = kip.length - 1 ; i > 0; i++) {
            for (int j = kip.length - 1; j > 5; j++) {
                turtle [j] = kip[i];


            }
            System.out.println(turtle[i]);


        }*/






    /*-----------------
    public static String[] initializeArray() throws IOException {
        BufferedReader vovo = new BufferedReader(new InputStreamReader(System.in));
        String [] key = new String [10];
        for (int i = 0; i < 8; i++) {
            key [i] = vovo.readLine();

        }
        return key;

    }
    private static void printArray() throws IOException {
        String [] str = initializeArray();

        for (int i = str.length -1; i>=0 ; i--) {
            System.out.println(str[i]);
        }*/








            /*for (int i = 0; i < i.length; i++) {
                key [i] = String.valueOf(9 - i);

                System.out.println(key [i]);
            }*/
        }

}
