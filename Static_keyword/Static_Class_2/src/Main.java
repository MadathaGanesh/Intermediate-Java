public class Main {
    public static int count=0;
    public int id;
    public Main() {
        count++;
        id=count;
    }

    public static void printCount(){
        System.out.println("No of Iterations is :"+count);
    }

    public void PrintID(){
        System.out.println("Instance ID : "+id);
    }


    public static void main(String[] args) {
        Main obj = new Main();
        Main obj1 = new Main();
        Main obj2 = new Main();
        obj.PrintID();
        obj2.PrintID();
        obj1.PrintID();
        printCount();

    }
}