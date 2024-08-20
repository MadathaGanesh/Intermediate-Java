package Generic_Class_2;

public class MultiParameterGenericClass <T ,U,V> {
    T obj1;
    U obj2;
    V obj3;

    public MultiParameterGenericClass(T obj1,U obj2,V obj3){
        this.obj1=obj1;
        this.obj2=obj2;
        this.obj3=obj3;
    }

    public void details(){
        System.out.println("String : "+obj1);
        System.out.println("Double : "+obj2);
    }
}
