package DAY6;

import java.util.Scanner;

public class ArraysIntro {
    public static void main(String[] args) {
//        Arrays

//        String names[] = new String[8];
////        String[] names[];
////        String [][][] names;
////        names = new String[];

//        for(int iterator=0; iterator<names.length;iterator++){
//            names[iterator]=input.next();
//        }
        Scanner input = new Scanner(System.in);
//        for (String name: names){
//            System.out.println(name);
//        }
//        Employee employee = new Employee();
//        System.out.println("name");
//        employee.setName(input.nextLine());
//        System.out.println("age");
//        employee.setAge(input.nextInt());
//        System.out.println("salary");
//        employee.setSalary(input.nextInt());
//        employee.print();

        Employee[] employees = new Employee[]{
                new Employee(),
                new Employee("Aditya",15,10000000),
                new Employee("aditya"),
                new Employee(15),
                new Employee(15)
        };
        System.out.println(employees[0].toString());
        System.out.println(employees[1].toString());

//        for (Employee employee : employees) {
//            System.out.println("name");
//            String name=input.next();
//            employee.setName(name);
//            System.out.println("age");
//            int age=input.nextInt();
//            employee.setAge(age);
//            System.out.println("salary");
//            employee.setSalary(input.nextInt());
//            employee.print();
//        }



    }
}
class Employee{
    String name;
    int age;
    private double salary;

    public Employee() {
        System.out.println("Hey we are in constructor");
    }
    public Employee(int age) {
        System.out.println("Hey we are in constructor");
    }
    public Employee(double salary) {
        System.out.println("Hey we are in constructor");
    }

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public Employee(String name){
        System.out.println(name);
    }

    int Age(){
        return 0;
    }
    void Age(int i){

    }
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public void setSalary(double salary) {
//        this.salary = salary;
//    }
//
//    public void print(){
//        System.out.println("Hi my name is "+name+" I am "+age+" old");
//    }
}
