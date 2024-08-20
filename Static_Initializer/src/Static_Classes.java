public class Static_Classes {
    public static final String NAME;

    static {   // Static Block
        System.out.println("Static  method 1 called ");
        NAME="Ganesh";
    }

    public Static_Classes(){  // Constructor
        System.out.println(" constructor 1 called");
    }

    static {
        System.out.println("static bock 2 called");
    }

    public void method1(){
        System.out.println("method 1 called");
    }

    static {
        System.out.println("static block 3 called");
    }

    public void method2(){
        System.out.println("method 2 called");
    }

}
