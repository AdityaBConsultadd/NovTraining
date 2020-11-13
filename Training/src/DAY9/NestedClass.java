package DAY9;

public class NestedClass {
//    nested class
//    class inside another class
//    called innerclasses
static class Name{
        String name = "aditya";
}

    public static void main(String[] args) {
        NestedClass.Name nested = new NestedClass.Name();
        System.out.println(nested.name);

    }
}
enum days{
    aditya,
    akash;

    public void display(){
        System.out.println("Hello");
    };
}