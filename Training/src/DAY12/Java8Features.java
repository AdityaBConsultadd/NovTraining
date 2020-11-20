package DAY12;

import java.util.ArrayList;
import java.util.Arrays;

public class Java8Features {
    public static void main(String[] args) {
//        functional interfaces     =
//        lambda functions   =
//        StreamApi
//        foreach    =
//        use of static and default  =
        int[] arr= {1,23,4,4,5,5};
        ArrayList<String> arrayList= new ArrayList<>();
        arrayList.add("Aditya");
        arrayList.add("Jatin");
        arrayList.add("Abhinya");
        arrayList.add("Nisha");
        arrayList.add("Kinjal");
        arrayList.add("Lakpa");
        arrayList.forEach(System.out::println);
        for (int a: arr) {
            System.out.println(a);
        }
//        Arrays.stream(arr).forEach();


    }
}
interface A{
    default void add(){

    }
    static void multiply(){

    }
    void div();
}
//class B implements A{
//
//}