import primitives.Integers;
import primitives.Longs;

public class Main {
    public static void main(String[] args) {
        String s = "212113";
        System.out.println(Integer.parseInt(s));
        Integers i1 = new Integers();
        i1.display();
        System.out.println("\n=================");
        Longs l1 = new Longs();
        l1.display();
    }


}