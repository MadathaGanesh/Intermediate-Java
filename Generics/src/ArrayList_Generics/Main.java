package ArrayList_Generics;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList al=new ArrayList<>();
        al.add("Ganesh");
        al.add(1232);
        al.add('A');
        al.add(121.221);

        String s1= (String) al.get(0);  // typecasting object datatype to String datatype
        System.out.println("s1 is : "+s1);

        Integer i1=(Integer)al.get(1);  // typecasting object datatype to Integer datatype
        System.out.println("I1 is :"+i1);

        Character c1= (Character) al.get(2);  //  // typecasting object datatype to Character datatype
        System.out.println("C1 is : "+c1);

        Double d1=(Double)al.get(3);  //  // typecasting object datatype to Double datatype
        System.out.println("D1 is : "+d1);

    }
}
