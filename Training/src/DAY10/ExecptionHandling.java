package Day10;

import java.util.Scanner;

public class ExecptionHandling {
//    Throwables
//  error and exception
//    exception
//    checked : i/o , null , sql
//    and
//    uncheck : array out of bound , class,  /by zero

// to overcome the execptions
//    try
//    catch
//    throw
//    throws
//    finally



//    try catch
    public static void main(String[] args){

//        try {
//            int a, b;
//            Scanner in = new Scanner(System.in);
//            System.out.println("enter a");
//            a = in.nextInt();
//            System.out.println("enter b");
//            b = in.nextInt();
//            int result = a / b;
//            System.out.println(result);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }finally {
//
//        }
//
//
//        try{
//            int a, b;
//            Scanner in = new Scanner(System.in);
//            System.out.println("enter a");
//            a = in.nextInt();
//            System.out.println("enter b");
//            b = in.nextInt();
//            int result = a / b;
//            System.out.println(result);
//        }finally {
//            System.out.println("lets try again");
//        }

        try{
            int a, b;
            int arr[]={1,24,4};
            Scanner in = new Scanner(System.in);
            System.out.println("enter a");
            a = in.nextInt();
            System.out.println("enter b");
            b = in.nextInt();

            System.out.println(arr[5]);
            int result = a / b;
            System.out.println(result);
        }catch (ArithmeticException e){
            System.out.println("Arithemtic execption");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("array out of bound");
        } catch (Exception e) {
            System.out.println("Excerpuion");

        }

//        try{
//            try{
//
//            }catch (Exception e){
//
//            }
//        }catch (Exception e) {
//
//        }finally {
//
//        }

//        throw and throws
             

    }
}
