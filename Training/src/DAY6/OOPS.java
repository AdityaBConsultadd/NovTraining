package DAY6;


public class OOPS {
    static {
        System.out.println("Hey this is OOPS class");
    }
//    f1() f2()  f3()  f4() . . .
//        O O P
//        Employee {
//        attributes eg: name, age, salary..
//        behav eg: testing, eating
//        }
//
//        Encapulation
//        inheritance
//        abstraction
//        polymorphim


//    Methods
//    without any return and without parameters
//    with return and without parameters
//    without return and with parameters
//    with return and with parameters

//    Syntax
//    access modi   returntype     name  (  parameters(values)  ){

//      method body
//      return "";
//      }
    public void print(){
        System.out.println("Hello we are learning about the Methods");
    }


//    with return and without parameters
    public String withReturn(){
        return "Hey I am creating a fucn with return";
    }
//    without retun with parameters
    public void withParameters(String string){
        System.out.println("Hey my name is "+string);
    }

//    with return and with parameters
    public Boolean checkEven(int integer){
        if( integer % 2 == 0 ){
            return true;
        }else
            return false;
    }
}
class Test {
    public static void main(String[] args) {

//        int a=10;
        OOPS oops = new OOPS();
        OOPS[] oops1 =new OOPS[2];

//        oops.print();
//        String string = oops.withReturn();
//        System.out.println(string);
//        oops.withParameters("Aditya");
//        System.out.println(oops.checkEven(9));


    }
}
