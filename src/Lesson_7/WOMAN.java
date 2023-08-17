package Lesson_7;

public class WOMAN {

    private String name;
    private byte age;

    private String husband;

    public WOMAN(String name, byte age) {
        this.age = age;
        this.name = name;
    }

    public WOMAN (String name, byte age, String husband) {
        this.age = age;
        this.name = name;
        this.husband = husband;
    }
    public String getName(){
        return this.name;
    }
    public byte getAge(){
        return this.age;
    }

    public String getHusband(){
        return this.husband;
    }

    public void setHusband(String husband){
        this.husband = husband;
    }


}
