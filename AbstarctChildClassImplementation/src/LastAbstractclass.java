import java.util.Scanner;

public class LastAbstractclass extends SecondAbstractClass{
    Scanner sc=new Scanner(System.in);
    public void studentAddressDetails(){
        System.out.println("eenter student address :: ");
        String address=sc.next();
        System.out.println("student address details are :: "+address);
    }
    public void studentMarksDEtails(){
        System.out.println("Enter student 3 subject marks details ::");
        int sub1=sc.nextInt();
        int sub2=sc.nextInt();
        int sub3=sc.nextInt();
        int sum=sub1+sub2+sub3;
        double avg=sum/3;
        System.out.println("three subject marks of student are :: "+
                sub1 + " \t" +sub2 + " \t" +sub3);
        System.out.println("total marks of student are ::"+sum);
        System.out.println("avg marks of student are :: "+avg);
    }
}
