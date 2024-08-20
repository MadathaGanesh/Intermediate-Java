public class Main {
    public static void main(String[] args) {
        OuterClass.InnerClass obj=new OuterClass().new InnerClass();
        obj.display();

        OuterClass obj2=new OuterClass();
        obj2.outerdetails();
    }
}