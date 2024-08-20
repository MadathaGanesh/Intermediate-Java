package BoxGenerics;

public class Fruit implements Boxable{
    private String name;
    private String CountryOfOrigin;
    private String color;
    private double weight;
    public Fruit(String name,String CountryOfOrigin,String color,double weight){
        this.name=name;
        this.CountryOfOrigin=CountryOfOrigin;
        this.color=color;
        this.weight=weight;
    }
    public String getName(){
        return name;
    }
    public double getWeight() {
        return weight;
    }
    public String getCountryOfOrigin() {
        return CountryOfOrigin;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", CountryOfOrigin='" + CountryOfOrigin + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }

    public String getColor() {
        return color;
    }

}
