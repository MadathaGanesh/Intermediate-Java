package Generic_Class;

// generic class with single parameter

public class Main {
    public static void main(String[] args) {

        // For integers
        Generic_Class_1< Integer> obj1=new Generic_Class_1<Integer>(10);
        System.out.println("integer value is :"+obj1.getObj());

        // For strings
        Generic_Class_1<String > obj2=new Generic_Class_1<>("Ganesh");
        System.out.println("String value is ::"+ obj2.getObj());

        // For character
        Generic_Class_1<Character> obj3=new Generic_Class_1<>('A');
        System.out.println("Char value is ::"+   obj3.getObj());
    }
}