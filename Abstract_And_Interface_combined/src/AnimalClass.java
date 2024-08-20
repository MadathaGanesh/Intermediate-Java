public abstract class AnimalClass {
    String name;
    public AnimalClass(String name){
        this.name=name;
    }

    //Abstract Methods
    public abstract void height();
    public abstract void LifeSpan();

    //Getters
    public String getName(){
        return name;
    }
}
