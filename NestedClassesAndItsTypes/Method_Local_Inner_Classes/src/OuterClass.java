public class OuterClass {
    public void display(){
        System.out.println("outer class details are displayed");
        class InnerClass{
            int a=10;
            public void show1(){
                System.out.println("Inner class details are displayed ");
                System.out.println("A value is :: "+a);
            }

        }

        InnerClass in1=new InnerClass();
        in1.show1();

    }

}
