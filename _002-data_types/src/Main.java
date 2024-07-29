import primitives.*;
import wrapperclasses.Wrappers;

public class Main {
    public static void main(String[] args) {
        String s = "212113";
        System.out.println(Integer.parseInt(s));
        Integers i1 = new Integers();
        i1.display();
        System.out.println("\n=================");
        Longs l1 = new Longs();
        l1.display();

        Identifiers identifiers = new Identifiers();
        identifiers.display();

        AssignmentOperators assignmentOperators = new AssignmentOperators();
        assignmentOperators.grundBerechnungen();

        DefaultvaluesOfPrimitives dp = new DefaultvaluesOfPrimitives();
        dp.defaultValues();

        Chars chars = new Chars();
        chars.displayCharOperatorResults();
        Integer integer = 2;
        System.out.println("\n==================================");
        Wrappers wrappers = new Wrappers();
        wrappers.displayBooleanWrappers();
        wrappers.displayIntegerWrappers();
        System.out.println("\n==================================");
        wrappers.displayCharacters();
        
    }


}