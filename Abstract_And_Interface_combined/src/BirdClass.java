public abstract class BirdClass extends AnimalClass {
    public BirdClass(String name){
        super(name);
    }
    public void details(){
        System.out.println();
        System.out.println("bird name is ::"+name);
    }

    public void LifeSpan(){
        System.out.println("life span of bird is 12 months ");
    }

    public void height(){
        System.out.println("height of bird is 3 meters ");

    }

    public abstract void Dance();

}
