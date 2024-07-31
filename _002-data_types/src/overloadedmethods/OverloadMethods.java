
/*
 * Copyleft (c) 2024. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package overloadedmethods;

public class OverloadMethods {
    int a = 1;
    long b = 1L;
    String s = "Hallo!";

    public void display(int x) {
        System.out.println(x);
    }

    public void display(long x) {
        System.out.println(x);
    }

    public void display(String x) {
        System.out.println(x);
    }

    public void display(boolean x) {
        System.out.println(x);
    }

    protected long display(int s, long k) {
        return s + k;
    }

    protected long display(long s, int k) {
        return s + k;
    }

}

class OverloadTest {

    public static void main(String... args) {
        OverloadMethods m_overloadMethods = new OverloadMethods();
        System.out.println(m_overloadMethods.display(1L, 2));
        System.out.println(m_overloadMethods.display(1, 2L));
        m_overloadMethods.display(1L);
        m_overloadMethods.display("1-2");
        m_overloadMethods.display(true);
    }
}
