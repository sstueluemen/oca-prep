
/*
 * Copyleft (c) 2024. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package initializerblocks;

public class InitializerBlock {

    public static void main(String[] args) {
        Initializer initalizer = new Initializer();
    }
}

class Initializer {
    {
        System.out.println("1- Hello Initializer Block !");
    }


    Initializer() {
        System.out.println("Initializer Constructor method !");
    }


    {
        System.out.println("2- Hello Initializer Block !");
    }
}
