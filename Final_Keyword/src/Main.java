public class Main {
    final int VALUE=20;  // Direct Initialization

    final int CAPACITY;  // without initializing value and it can be initialized in below block
    {
        CAPACITY=30;
    }

    final int MINIMUM_VALUE;  //without initializing value and it can be initialized in below constructor block
    public Main(){
        MINIMUM_VALUE = 10;
    }


    static final double EULERCONSTANT;  //static final variable without initializing value and it can be initialized in below static block
    static {
        EULERCONSTANT=4.7;

    }


    public static void main(String[] args) {
        Main obj=new Main();
        System.out.println("Minimum value ::"+obj.MINIMUM_VALUE);
        System.out.println("static EULERCONSTANT is : "+Main.EULERCONSTANT);
        System.out.println("Capacity value is ::"+obj.CAPACITY);
        System.out.println(" value is ::"+obj.VALUE);
    }
}