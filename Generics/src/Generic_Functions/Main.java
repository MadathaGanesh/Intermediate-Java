package Generic_Functions;

public class Main {

    static <T> void generic_Method(T element){
        System.out.println(element.getClass().getName() + " = " + element);
    }

    public static void main(String[] args) {
        generic_Method("Ganesh");
        generic_Method(12.93);
        generic_Method(122);
    }
}
