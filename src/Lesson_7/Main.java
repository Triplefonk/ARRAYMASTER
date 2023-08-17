package Lesson_7;

public class Main {

    public static void main(String[] args) {

        /*-------------------
        User man = new User((byte) 23, "Jack", "Pauls", "the US", (byte)1, (byte)6, (short) 1983);
        System.out.println(man.getName());
        System.out.println(man.getAge());
        System.out.println(man.getCitizenship());

        User girl = new User((byte) 25, "Laureen", "Folks", "Sweden");
        System.out.println(girl.getName());
        System.out.println(girl.getAge());
        System.out.println(girl.getCitizenship());

        Humans dude = new Humans( 23);
        System.out.println(dude.getAge());
        //dude.setAge(24);
        System.out.println(dude.getAge());*/

        /*------------------
        WOMAN owner = new WOMAN("Lena", (byte) 20);
        System.out.println("Owner's age: " + owner.getAge());
        System.out.println("Owner's name: " + owner.getName());

        CAT Cat = new CAT ("Jim", (byte) 5, owner.getName());
        System.out.println("Cat's age: " + Cat.getAge());
        System.out.println("Cat's name: " + Cat.getName());
        System.out.println(Cat.getName()+"'s owner is " + Cat.getOwner());

        DOG Dog = new DOG ("Jerry", (byte) 2, owner.getName());
        System.out.println("Dog's age: " + Dog.getAge());
        System.out.println("Dog's name: " + Dog.getName());
        System.out.println(Dog.getName() +"'s " +"owner is " + Dog.getOwner());

        FISH Fish = new FISH ("Creed", 3, owner.getName());
        System.out.println("Fish's age: " + Fish.getAge());
        System.out.println("Fish's name: " + Fish.getName());
        System.out.println(Fish.getName() + "'s "+ "owner is " + Fish.getOwner());*/

        WOMAN woman = new WOMAN ("Kate", (byte) 29);
        MAN man = new MAN ("John", (byte) 30);

        woman.setHusband(woman.getName() + "'s husband is " + man.getName()+".");
        man.setWife(man.getName() + "'s wife is "+ woman.getName()+".");
        System.out.println(man.getName() + " is " +man.getAge()+" years old.");
        System.out.println(man.getWife());
        System.out.println(woman.getName()+ " is "+ woman.getAge()+" years old.");
        System.out.println(woman.getHusband());


















        /*User.age = 20;
        man.dayofbirth = 1;
        man.monthofbirth = 5;
        man.yearofbirth = 1998;
        man.name = "Boris";

        System.out.println(User.age);
        System.out.println(man.dayofbirth);
        System.out.println(man.monthofbirth);
        System.out.println(man.yearofbirth);
        System.out.println(man.name);
        man.talk("ALL TOGETHER");

        User girl = new User();
        girl.name = "Alice";
        User.age = 19;
        girl.monthofbirth = 3;
        girl.dayofbirth = 6;
        girl.yearofbirth = 1999;
        girl.talk("DAMMIT");
        System.out.println(girl.yearofbirth);
        System.out.println(User.age);*/

        for (int i = 5; i > 4; i++) {
            for (int j = 0; j < 10; j++) {

            }
            System.out.println(i);
        }

    }



}
