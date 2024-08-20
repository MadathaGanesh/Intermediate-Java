public class SParrow extends BirdClass implements DanceOrNot{
    public SParrow(String name){
        super(name);
    }

    @Override
    public void Dance() {
        System.out.println("sparrow name is :" +name);
        System.out.println("Sparrows cant fly");
    }


}
