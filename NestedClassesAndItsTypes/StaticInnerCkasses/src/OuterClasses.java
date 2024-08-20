public class OuterClasses {
    public static void outerMethod(){
        System.out.println("Outer class data is displaying \n");
    }

    // static inner class
    static class InnerClass{
        public static void innerDisplay(){
            System.out.println("Inner class details are displaying");
            outerMethod();
        }
    }

}
