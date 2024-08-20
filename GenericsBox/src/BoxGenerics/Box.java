package BoxGenerics;

import java.util.*;


public class Box <T extends Boxable>{
    private List<T> items;
    public Box(){
        this.items=new ArrayList<>();
    }
    public List<T> getItems() {
        return items;
    }
    @Override
    public String toString() {
        return "Box{" +
                "items=" + items +
                '}';
    }

    //Generics methods inside the generic class
    public void additem(T t){  // adding items
        this.items.add(t);
    }

    public T getlatestitem(){  // accessing the latest item
        return this.items.get(items.size()-1);
    }

    public double getTotalWeight(){
        return this.items.stream().mapMultiToDouble(Boxable::getWeight).sum();
    }



}
