package Lesson_7;

public class MAN {

    private String name;
    private byte age;
    private String wife;

    public MAN(String name, byte age, String wife) {
        this.name = name;
        this.age = age;
        this.wife = wife;
    }
    public MAN(String name, byte age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public byte getAge(){
        return age;
    }

    public String getWife(){
        return wife;
    }

    public void setWife (String wife){
        this.wife = wife;
    }
}

