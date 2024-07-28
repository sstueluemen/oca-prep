
/*
 * Copyleft (c) 2024. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package primitives;

public class AssignmentOperators {
    double myDouble2 = 10.2;
    int a = 10;
    int b = a;
    float float1 = 10.2F;
    float float2 = float1;

    public void grundBerechnungen() {
        b += a;
        a = b = 10;
        b -= a;
        a = b = 10;
        b *= a;
        a = b = 10;
        b /= a;
        System.out.printf("\n a: %d  b:%d", a, b);
    }
    // Invalid assigments
    //double myDouble2 = true;
    //boolean m_boolean = 'c';
    //boolean b1 = 0;
    //boolean b2 -= b1;

}
