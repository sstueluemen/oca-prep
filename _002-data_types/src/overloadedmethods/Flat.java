
/*
 * Copyleft (c) 2024. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package overloadedmethods;

public class Flat {
    String typeOfFlat;
    double squareMeter;
    int numberOfWCs;
    int numberOfBalconies;
    boolean privateGarage;

    public Flat() {
    }

    public Flat(String typeOfFlat, double squareMeter, int numberOfWCs) {
        this.typeOfFlat = typeOfFlat;
        this.squareMeter = squareMeter;
        this.numberOfWCs = numberOfWCs;
    }

    public Flat(String typeOfFlat, double squareMeter, int numberOfWCs, int numberOfBalconies) {
        this.typeOfFlat = typeOfFlat;
        this.squareMeter = squareMeter;
        this.numberOfWCs = numberOfWCs;
        this.numberOfBalconies = numberOfBalconies;
    }

    public Flat(String typeOfFlat, double squareMeter, int numberOfWCs, int numberOfBalconies, boolean privateGarage) {
        this.typeOfFlat = typeOfFlat;
        this.squareMeter = squareMeter;
        this.numberOfWCs = numberOfWCs;
        this.numberOfBalconies = numberOfBalconies;
        this.privateGarage = privateGarage;
    }

    @Override
    public String toString() {
        return "Flat{" +
                "typeOfFlat='" + typeOfFlat + '\'' +
                ", squareMeter=" + squareMeter +
                ", numberOfWCs=" + numberOfWCs +
                ", numberOfBalconies=" + numberOfBalconies +
                ", privateGarage=" + privateGarage +
                '}';
    }
}

class FlatTest {


    public static void main(String[] args) {
        Flat flat0 = new Flat();
        Flat flat1 = new Flat("Penthouse", 45.2, 1);
        Flat flat2 = new Flat("Studio-Flat", 45.2, 1, 2);
        Flat flat3 = new Flat("3-Rooms", 45.2, 1, 2, true);
        System.out.println(flat0.typeOfFlat + ":" + flat0.toString());
        System.out.println(flat1.typeOfFlat + ":" + flat1.toString());
        System.out.println(flat2.typeOfFlat + ":" + flat2.toString());
        System.out.println(flat3.typeOfFlat + ":" + flat3.toString());


    }

}