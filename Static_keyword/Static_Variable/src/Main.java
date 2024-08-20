public class Main {

    static int a=num();

    // Static block
    static {
        System.out.println("just static block ");
    }

    public static int num(){
        System.out.println("num method");
        return 20;
    }
    public static void main(String[] args) {
        System.out.println("value of a is :"+a);
    }
}