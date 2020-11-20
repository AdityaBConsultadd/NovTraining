package DAY12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Functional {
    public static void main(String[] args) {
        int[] arr = {1, 23, 4, 4, 5, 5};
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Aditya");
        arrayList.add("Jatin");
        arrayList.add("Abhinya");
        arrayList.add("Nisha");
        arrayList.add("Kinjal");
        arrayList.add("Lakpa");

        int max=0,sum=0;
        int maxinum= Arrays.stream(arr).max().getAsInt();
        int total=Arrays.stream(arr).sum();
//        Arrays.stream(arr).
        for (int a: arr) {
            if(max<a)
                max=a;
            sum+=a;
        }
        System.out.println(max);
        System.out.println(sum);
        System.out.println(maxinum);
        System.out.println(total);


//        arrayList.forEach((n)->{n.toUpperCase();
//        System.out.println(n);});
//        arrayList.forEach(n->{n.startsWith("A");
//            System.out.println(n);});
//
////        Lambda
////        (n)->{return};
//        B b = () -> System.out.println("Hey this is lambda");
//        b=()->{
//            for (int i = 0; i < 5; i++) {
//                System.out.println(i);
//            }
//        };
//        b.add();
//        b.add();

//        Streams

//        - donot store element
//        - uses pipeline
//        - functional
//        - doesnot modify main source
//        - lazy in nature

//        -filter
//        -collect
//        -print
//        -reduce

//        intermidate
//        filter
//         map
//        sorted

//        terminal
//        collect
//        foreach
//        reduce


        Stream stream = Stream.of(arrayList);
        ArrayList<String>arrayList1= new ArrayList<>();
        System.out.println(stream.sorted().collect(Collectors.toList()));
//        System.out.println(arrayList1);



    }
}
//@FunctionalInterface
//interface B{
//    void add();
//}

