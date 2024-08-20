package BoxGenerics;

public class BoxUtils {

    //Generic method outside the generic class
    public static <T extends Boxable> int getCountOfItems(Box<T> box){
        return box.getItems().size();
    }
}
