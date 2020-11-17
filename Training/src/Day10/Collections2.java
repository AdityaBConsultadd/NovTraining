package Day10;

import javax.management.Query;
import java.util.*;

public class Collections2 {
    public static void main(String[] args) {
//        List
        List<String> names = new LinkedList<String>();
        ArrayList<String> namesCopy= new ArrayList<>();
        LinkedList<String > namesList = new LinkedList<String>(List.copyOf(names));
//        linked list
//        singly
//        start-> |Value|address|  -> |v|a| ->end
//        doubly
//        |addre prev | value | address next|
        names.add("Zack");
        names.add("Aditya");
        names.add("Ritu");
        Collections.sort(names);
        Collections.shuffle(names);
        Collections.reverse(names);

        Iterator<String > iterator = names.iterator();
        System.out.println(iterator.hasNext());

//        Collections.copy(nam);
//        System.out.println(names);
//        System.out.println(namesCopy);
//        System.out.println(namesList);

//        sets
        Set<String> stringSet= new HashSet<>();
        stringSet.add("a");
        stringSet.add("a");
        stringSet.add("b");
        stringSet.add("b");
        stringSet.add("c");
        System.out.println(stringSet);

//      Queues
        Queue<String> stringQueue = new PriorityQueue<>();

        stringQueue.add("Zack");
        stringQueue.add("Aditya");
        stringQueue.add("Ritu");

        Deque<String> stringDeque = new ArrayDeque<>();

        stringDeque.add("Aditya");

        Stack<String> stringStack = new Stack<>();
        stringStack.add("Zack");
        stringStack.add("Aditya");
        stringStack.add("Ritu");

        System.out.println(stringDeque+""+stringQueue+""+stringSet+""+stringStack);
    }
}
