package Generic_Class_2;

public class Main {
    public static void main(String[] args) {
        MultiParameterGenericClass<String,Double,Character> obj=new MultiParameterGenericClass<>("Ganesh",95.93,'A');
        obj.details();
        System.out.println("Char : "+obj.obj3);

    }
}
