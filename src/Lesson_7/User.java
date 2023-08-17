package Lesson_7;

public class User {

         public byte age;
         public String name;
         public String surname;
         public String citizenship;
         public byte dayofbirth;
         public byte monthofbirth;
         public short yearofbirth;

         public User(byte A, String N, String SN, String C, byte DoB, byte MoB, short YoB){
             age = A;
             name = N;
             surname = SN;
             citizenship = C;
             dayofbirth = DoB;
             monthofbirth = MoB;
             yearofbirth = YoB;
         }
         public User(byte A, String N, String SN, String C){
             age = A;
             name = N;
             surname = SN;
             citizenship = C;
         }
    public byte getAge() {
        return this.age;
    }
    public String getName() {

             return name;
    }
    public String getCitizenship() {
        return citizenship;
    }





         /*public void talk (String txt) {

             System.out.println(txt);
         }*/

}
