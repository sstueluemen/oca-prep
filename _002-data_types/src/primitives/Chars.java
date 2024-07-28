
/*
 * Copyleft (c) 2024. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package primitives;

public class Chars {
    char char1 = 'a';
    char char2 = 'a';

    //
    public void displayCharOperatorResults() {
        System.out.printf("\n char1: %c char2: %c", char1, char2);
        System.out.println("\n=======================");
        System.out.printf("\n char1: %c ", ++char1);
        System.out.printf("\n char2: %c", char2++);
        System.out.println("\n====================");
        System.out.printf("\n char1+char2: %c", char1 + char2);
        System.out.printf("\n char1+char2: %d", char1 + char2);
        System.out.println("=======================");
        System.out.printf("\n char1-char2: %c", (char1 - char2));
        System.out.printf("\n char1-char2: %d", (char1 - char2));
        System.out.printf("\n char1(Mod)char2: %d", char1 % char2);
        System.out.printf("\n char1(Mod)char2: %c", char1 % char2);


    }
}
