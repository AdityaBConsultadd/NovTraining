package DAY7;

import javax.sound.midi.Soundbank;

public class WorkingWithSpring {
    public static void main(String[] args) {
//        String classes
//        String class
//        StringBuilder
//        StringBuffer

//        String class

        String string1 ="Hey my name";
        String string2 = "Hey my name";
        String string3 = string1;
        String string4 = new String("Hey my name");

//        string2.concat(" aditya");
//        System.out.println(string1);
//        System.out.println(string2);
//        System.out.println(string3);
//        System.out.println(string4);
//
//        System.out.println(string1.hashCode());
//        System.out.println(string2.hashCode());
//        System.out.println(string3.hashCode());
//        System.out.println(string4.hashCode());
//
//        System.out.println(string1==string2);
//        System.out.println(string2==string3);
//        System.out.println(string3==string1);
//        System.out.println(string4==string1);

        String[] stringArray=string1.split(" ");
        for (String s:stringArray
             ) {
            System.out.println(s);
        }
        System.out.println(string1.concat(" aditya"));
        System.out.println(string1.indexOf("my"));
        System.out.println(string1.isBlank());
        System.out.println(string1.isEmpty());

//        input: My name is -------
//        output : My nAmE Is .........

//        StringBuilder and StringBuffer
        StringBuilder stringBuilder = new StringBuilder("Hey my name is");
        stringBuilder.insert(5,"kasjbdklj");
        stringBuilder.append(" aditya");
        System.out.println(stringBuilder);
        string1.replace("my","hi");
        System.out.println(string1);


    }

}
