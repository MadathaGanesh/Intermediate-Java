package BoxGenerics;

public class Main {
    public static void main(String[] args) {
       Box<Book > bookBox=new Box<>();
       bookBox.additem(new Book("python","guido van russom ",98.34));
       bookBox.additem(new Book("java","james gosling",12.9));
        System.out.println(bookBox.getlatestitem());
        System.out.println(bookBox.getItems());
        System.out.println("Book count: "+BoxUtils.getCountOfItems(bookBox));

        Box<Fruit> fruitBox=new Box<>();
        fruitBox.additem(new Fruit("orange","india","orange",8.6));
        fruitBox.additem(new Fruit("apple","red","ts",12.3));
        System.out.println(fruitBox.getItems());
        System.out.println(fruitBox.getlatestitem());
        System.out.println("fruit count : "+BoxUtils.getCountOfItems(fruitBox));

    }
}