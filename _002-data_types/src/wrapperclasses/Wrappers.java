

/*
 * Copyleft (c) 2024. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

/*
 * Copyleft (c) 2024. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package wrapperclasses;

public class Wrappers {
    public void displayBooleanWrappers() {
        Boolean b1 = true;
        System.out.printf("Boolean Value:%b\n", b1);
        System.out.printf("HashCode: %s\n", b1.hashCode());
        System.out.printf("Boolean Type: %s\n", b1.getClass().getSimpleName());
    }

    public void displayIntegerWrappers() {
        Integer integer1 = 1;
        Integer integer2 = Integer.parseInt("122");
        System.out.printf("Type of integer: %s \n", integer1.getClass().getSimpleName());
        System.out.printf("Value of integer: %d \n", integer1.intValue());
        System.out.printf("Value of integer: %d \n", integer1.longValue());
        // System.out.printf("Value of integer: %d \n", integer1.floatValue()); //Runtime Error
        System.out.println("integer2:" + integer2.intValue());
        System.out.println("integer2:" + integer2);

        System.out.println("==================================");
        Integer i3 = Integer.valueOf(10);
        Integer i4 = Integer.valueOf(10);
        Integer i5 = 10;
        Integer i6 = 10;
        System.out.println(i3 == i4);
        System.out.println(i4 == i5);
        System.out.println(i5 == i6);
        System.out.println("============ for 130=================");
        Integer i31 = Integer.valueOf(130);
        Integer i41 = Integer.valueOf(130);
        Integer i51 = 130;
        Integer i61 = 130;
        System.out.println(i31 == i41);
        System.out.println(i41 == i51);
        System.out.println(i51 == i61);
        System.out.println("Usage of equals:" + i51.equals(i61));


    }

    public void displayCharacters() {
        Character c1 = 'c';
        System.out.println("character:" + c1);
        System.out.printf("character : %c\n", c1);
        System.out.printf("character (int): %d\n", (int) c1);
        System.out.printf("character %c:\n", c1);


    }
}
