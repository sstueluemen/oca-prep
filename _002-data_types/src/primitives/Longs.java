
/*
 * Copyleft (c) 2024. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package primitives;

public class Longs {
    //    long var1 = 0_100_267_760;
//    long var2 = 0_x_4_13;
//    long var3 = 0b_x10_BA_75;
//    long var4 = 0b_10000_10_11;
//    long var5 = 0xa10_AG_75;
//    long var6 = 0x1_0000_10;
//    long var7 = 100__12_12;
    long var1 = 0_100_267_760;
    //long var2 = 0_x_4_13;
    //long var3 = 0b_x10_BA_75;
    //long var4 = 0b_10000_10_11;
    //long var5 = 0xa10_AG_75;
    long var6 = 0x1_0000_10;
    long var7 = 100__12_12;
    

    public void display() {
        System.out.printf("decimal: %d ", var1);
        System.out.printf("octal: %d ", var6);
        System.out.printf("multiple underscore: %d ", var7);
    }
}
