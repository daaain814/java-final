import java.util.ArrayList;

public class Generics {
    public static void main(String[] args) {
        /* Generics */
        ArrayList<String> list = new ArrayList<String>();
        list.add("Hello" );
        list.add("Hello" );
        //list.add(123); // Error
        System.out.println(list);
    }
}
