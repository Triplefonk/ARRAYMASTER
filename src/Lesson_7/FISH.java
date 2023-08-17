package Lesson_7;

public class FISH {

    private String name;
    private int age;
    private String owner;

    public FISH (String name, int age, String owner) {
        this.name = name;
        this.age = age;
        this.owner = owner;
    }
    public String getName(){
        return this.name;
    }

    public String getOwner(){
        return this.owner;
    }
    public int getAge(){
        return this.age;
    }
}
