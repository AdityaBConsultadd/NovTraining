package DAY9;

import java.util.*;

public class CollectionsFramework {
//    interfaces in collection;
//    list -> ArrayList,LinkedList
//    set
//    maps
//    queues
public static void main(String[] args) {
    String [] names = new String[10];
    Scanner input = new Scanner(System.in);
    List<String> namesofStudents = new ArrayList<String>(Arrays.asList(names));
//    for (int i = 0; i < 10; i++) {
//        names[i]= input.next();
//        namesofStudents.add(names[i]);
//        System.out.println(names[i]);
//        namesofStudents.get(i);
//    }
    System.out.println(names);
    System.out.println(namesofStudents);
    namesofStudents.add(3,"anskl");
    namesofStudents.remove(3);
    namesofStudents.toArray();
    LinkedList<Students> array= new LinkedList<>();
//    for (int i = 0; i < 2  ; i++) {
//        array.add(new Students(input.next(),input.nextInt()));
//
//    }
    HashMap<Integer,String> arrays = new HashMap<>();
    arrays.put(1,"aditya");
    System.out.println(arrays.get(1));
    System.out.println(arrays.keySet());
    System.out.println(arrays.containsValue("aditya"));



}
}
class Students{
    public Students(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String name;
    int age;

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
