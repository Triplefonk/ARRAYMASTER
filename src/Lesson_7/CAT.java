package Lesson_7;

public class CAT {

    private  String name;
    private byte age;
    private String owner;

    public CAT(String name, byte age, String owner){
        this.name = name;
        this.age = age;
        this.owner = owner;
    }

    public String getName() {
        return this.name;
    }

    public byte getAge(){
        return this.age;
    }

    public String getOwner(){
        return this.owner;
    }
}
