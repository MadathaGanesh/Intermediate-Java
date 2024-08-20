public class Student {
    int rollno;
    String name;
    static String clgname;
    static int counter;
    public Student(String name){
        this.rollno=setRollNo();
        this.name=name;
    }
    static int setRollNo(){
        counter++;
        return counter;
    }
    static void setClg(String name){
        clgname=name;
    }
    void getinfo(){
        System.out.println("roll no is ::"+this.rollno);
        System.out.println("name is : "+this.name);
        System.out.println("clg name is : "+clgname);
        System.out.println();
    }
    public static void main(String[] args) {
       Student.setClg("VCE");
       Student s1=new Student("Ganesh");
       Student s2=new Student("hello");
       s1.getinfo();
       s2.getinfo();
    }
}