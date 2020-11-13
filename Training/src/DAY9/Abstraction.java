package DAY9;

public class Abstraction implements Workers{
    double mySalary;
    //    keyword: abstract, interface and implement and extends
//    How to make the abstract classes
//    creating interfaces
//    using multiple interface
//    multilevel interfaces
    public static void main(String[] args) {
        Abstraction abstraction = new Abstraction();
        abstraction.work();
        abstraction.getBonus();
        abstraction.getSalary();

    }

    @Override
    public void work() {
        System.out.println("Hey i am working as a developer");
    }

    @Override
    public void getBonus() {
        mySalary=salary+(salary*0.5);
    }

    @Override
    public void getSalary() {
        System.out.println(mySalary+"credited");
    }
}
interface Employee{
    String name="";
    int age=0;
    double salary=0;
    void work();
    void getBonus();
}
interface Manager extends Employee{
    int teamSize=0;
    String role="";
}
interface Workers extends Manager{
    void getSalary();
}


//interface Person {
//    String name="";
//    int age=0;
//    void eat();
//    void sleep();
//}
//interface SoftwareEng extends Person{
//    void eat(int a);
//}
//interface Teachers extends Person{}
//class Students implements Person,SoftwareEng,Teachers{
//
//    @Override
//    public void eat() {
//        System.out.println("Hey I am Eating");
//    }
//
//    @Override
//    public void sleep() {
//        System.out.println("Zzz");
//    }
//
//    @Override
//    public void eat(int a) {
//
//    }
//}