package DAY11;

import java.io.*;
import java.util.Scanner;

public class FileHandling {
//    File
//    FileWriter
//    FileReader
//    BufferReader
//    FileInputStream
//    FileOutStream

    public static void main(String[] args) {
//       Creating
        File file = new File("Test.txt");
        try {
            if(file.createNewFile())
                System.out.println("File created");
            else
                System.out.println("File exist");
            System.out.println(file.getName());
            System.out.println(file.getAbsoluteFile());
//            System.out.println(file.);
        } catch (IOException e) {
            e.printStackTrace();
        }
//        Write
        try {
            FileWriter fw = new FileWriter("Test.txt",true);
            String s= "Hey we are working with files";
//            fw.write("HI ");
            fw.append(s);
//            fw.write("Hello");
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
//        Read
        try {
            FileReader fr = new FileReader("Test.txt");
            int a=fr.read();
            while(a!=-1){
                System.out.print((char) a);
                a= fr.read();
            }
            fr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            FileReader fr = new FileReader("Test.txt");
            Scanner in = new Scanner(fr);
            while(in.hasNextLine()){
                String s= in.nextLine();
                System.out.println(s);
            }
            fr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
//        delete
        File file1 = new File("Test");
        if(file1.exists()){
            file1.delete();
            System.out.println("File deleted");
        }

    }

}
