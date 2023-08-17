package Lesson_7;

public class DOG {

    private String name;
    private byte age;
    private String owner;

    public DOG(String name, byte age, String owner){
        this.name = name;
        this.age = age;
        this.owner = owner;

    }

    public String getName() {
        return name;
    }
    public byte getAge() {
        return age;
    }

    public String getOwner(){
        return owner;
    }



}
