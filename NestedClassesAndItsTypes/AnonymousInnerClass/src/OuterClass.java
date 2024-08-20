public class OuterClass {
     void show(){
        System.out.println("Outer class details");
    }
}

class InnerClass{
    static OuterClass obj1=new OuterClass(){
        void show(){
            super.show();
            System.out.println("Inner class details are displaying");
        }
    };
}

