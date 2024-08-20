// Anonymous class are implementing interfaces
public interface AnonymousInterface {
    void show();
}

class classname {

    static AnonymousInterface obj = new AnonymousInterface() {
        @Override
        public void show() {
            System.out.println("Anonymous class details are displaying ");
        }
    };
}


