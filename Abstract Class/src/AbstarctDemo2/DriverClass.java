package AbstarctDemo2;

public class DriverClass {
    public static void main(String[] args) {
        AbstractClass obj=new MathOperation();
        obj.addition();
        obj.subtraction();
        obj.multiplication();
        obj.division();
        obj.modulo();
    }
}
