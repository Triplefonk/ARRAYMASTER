package Lesson_7;

public class Robot {

    private String name;
    private byte age;
    private int power;

    public Robot(String name, byte age, int power) {
        this.name = name;
        this.age = age;
        this.power = power;

    }

    public Robot(int power) {
        this.power = power;
    }


    public String getName() {
        return name;
    }

    public byte getAge() {
        return age;
    }

    public int getPower() {
        return power;
    }


    public boolean fight(Robot anotherRobot) {
        //this.power = anotherRobot.getPower();




        if (this.power > anotherRobot.power) {

            return true;
        }
    else {
            return false;
        }


    }
}





