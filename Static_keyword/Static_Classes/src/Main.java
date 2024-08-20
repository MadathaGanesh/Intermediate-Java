public class Main {
    static int rollno=8;
    static String  name="Ganesh" ;
    static class nestedclass {
        static void details() {
            System.out.println("roll no is :::" + rollno);
            System.out.println("name is :: " + name);
        }
    }

    public static void main(String[] args) {
        Main.nestedclass obj;
        obj=new Main.nestedclass();
        obj.details();
    }
}