package New_lesson;

public class Human extends Object {

    private String name;
    private boolean gender;
    private int age;

    private Human dad;
    private Human mom;

    public Human(String name, boolean gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;

    }

    public Human (String name, boolean gender, int age, Human mom, Human dad){
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.mom = mom;
        this.dad = dad;
    }




    /*public Human(String name, boolean gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;



    }*/
    /*public Human (String name){
        this.name = name;
    }*/
    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        String str = "";
        str += "Name: " + this.name;

        if (gender == true){
            str += ", Gender: "+ "Male, ";
        }
        if (gender == false){
            str += ", Gender: " + "Female, ";
        }
        str += "Age: " + this.age;
        if (this.dad != null){
            str += ", папа: "+ this.dad.name;
        }
        if (this.mom != null){
            str += ", мама: " + this.mom.name;
        }

        return str;

        /*if (gender == true & this.dad != null & this.mom != null) {
            return "Имя: "
                    + name
                    + "\nПОЛ: "
                    + "Мужской "
                    + "\nВозраст: "
                    + age
                    + this.dad.name
                    + this.mom.name;
        }
        else {
            assert this.mom != null;
            assert this.dad != null;
            return "Имя: "
                    + name
                    + "\nПОЛ: "
                    + "Женский "
                    + "\nВозраст: "
                    + age
                    + this.dad.name
                    + this.mom.name;
        }*/



       // return null;
    }
}
