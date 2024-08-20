package Arraylist_generics_2;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<Integer> i1=new ArrayList<Integer>();
        ArrayList<String> s1=new ArrayList<>();
        ArrayList<Double> d1=new ArrayList<>();

        i1.add(20);
        i1.add(21);
        i1.add(22);
        System.out.println("Integer values are :");
        for (int i=0;i<i1.size();i++) {
            System.out.println(i1.get(i));
        }

        s1.add("Ganesh");
        s1.add("Pranay");
        System.out.println("String values are :");
        for (int s=0;s<s1.size();s++){
            System.out.println(s1.get(s));
        }

        d1.add(232.21);
        d1.add(1294.56);
        System.out.println("Double values are :");
        for (int d=0;d<d1.size();d++){
            System.out.println(d1.get(d));
        }

    }
}
