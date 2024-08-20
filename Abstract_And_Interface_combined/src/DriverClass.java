public class DriverClass {
    public static void main(String[] args) {
        Elephant obj;
        obj=new Elephant("elephant 1");
        obj.details();
        obj.LifeSpan();
        obj.height();


       /* BirdClass obj1;
        obj1=new BirdClass("peacock");
        obj1.details();
        obj1.height();
        obj1.LifeSpan();*/


        Peacock obj3;
        obj3=new Peacock("nemali");
        obj3.details();
        obj3.height();
        obj3.LifeSpan();


        SParrow sparrow;
        sparrow=new SParrow("sparrow");
        sparrow.Dance();


    }
}