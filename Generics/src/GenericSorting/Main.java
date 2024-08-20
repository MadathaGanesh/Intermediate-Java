package GenericSorting;


public class Main {
    public static void main(String[] args) {
        Integer a[]={100,21,41,12,45,32};
        String[] s={"sai ","ganehs","ravi","pranay"};
        Character[] c={'a','B','g','c','t','b','Z'};
        System.out.println("sorted Integer array :");
        sort_Generics(a);

        System.out.println("sort String array ");
        sort_Generics(s);

        System.out.println("Sorted character array :");
        sort_Generics(c);


    }

    public static <T extends Comparable<T>> void sort_Generics(T[] a){
       // As we are comparing the Non-primitive data types
       // we need to use Comparable class

        // Bubble sort
        for (int i=0;i<a.length-1;i++ ){
            for (int j=0;j<a.length-i-1;j++){
                if (a[j].compareTo(a[j+1])>0){
                    swap(j,j+1,a);
                }
            }
        }

        for (T i:a){
            System.out.println(i + " , ");
        }
        System.out.println();
    }


    //swap method
    public static <T> void swap(int i, int j,T[] a){
        T t=a[i];
        a[i]=a[j];
        a[j]=t;
    }

}

