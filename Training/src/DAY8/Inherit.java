package DAY8;


import javax.swing.*;

public class Inherit {
//    Wrapper class
//    Byte byte ;
//    Short short;
//    Integer int;
//    Long long;
//    Float float;
//    Double double;
//    Boolean boolean;
//    Character char;
//    String;

//    passed value;

//    private int salary;

// ArrayList<Integer> arrayList = new ArrayList<>();
////        Integer integer1 = new Integer("10");
////        Integer i=10;
////        int integer2 = 10;
////        System.out.println(integer2.equals(integer1));

//    inheritance
//    super class (parent)
//    sub class (child)

//    syntax class className extends superclassName{
//    }

//    Types of inheritance
//    single
//    multilevel

//    multiple(not in java)

//   multiple (not used)
//        class a
//    class b  class c
//                 class d

    public static void main(String[] args) {
        Software software = new Software("aditya",15);
        Army army = new Army();
        Teachers teachers= new Teachers();
        software.eat();
        String out=software.toString();
        System.out.println(out);
        army.sleep();
        Coder coder = new Coder("jatin",18);
        System.out.println(coder.toString());

    }

}
class Person{
    String name;
    int age;
    String occupation;

    protected void eat(){
        System.out.println("I am eating");
    }

    protected void sleep(){
        System.out.println("I am Sleeping");
    }

}
class Software extends Person{
    public Software(String name,Integer age) {
        occupation="SoftwareEngineer";
        super.name=name;
        super.age=age;
    }

    @Override
    public String toString() {
        return "Software{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", occupation='" + occupation + '\'' +
                '}';
    }
}
class Army extends Person{
    @Override
    public String toString() {
        return "Army{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", occupation='" + occupation + '\'' +
                '}';
    }
}
class Teachers extends Person{
    @Override
    public String toString() {
        return "Teachers{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", occupation='" + occupation + '\'' +
                '}';
    }
}

class Coder extends Software{
    public Coder(String name, Integer age) {
        super(name, age);
    }

}
class Designers extends Software{
    public Designers(String name, Integer age) {
        super(name, age);
    }
}





