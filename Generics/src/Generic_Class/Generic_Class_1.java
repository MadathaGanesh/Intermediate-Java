package Generic_Class;

public class Generic_Class_1 < T > {  // we use this  < > brackets to specify parameter data type
    T obj; // An object of type T is declared

    Generic_Class_1( T obj){  // Constructor
        this.obj=obj;
    }

    public T getObj() {  // getter
        return this.obj;
    }
}
