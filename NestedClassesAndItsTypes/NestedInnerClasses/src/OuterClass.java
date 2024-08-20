public class OuterClass {
    public void outerdetails(){
        System.out.println("OUter class details are displaying");
        //System.out.println(" B value is :"+b);
    }

    int a=10;
    public class InnerClass{
        int b=20;
        public void display(){
            System.out.println("A value is ::"+a);
            System.out.println("Inner class details are displaying");
        }
    }

}
