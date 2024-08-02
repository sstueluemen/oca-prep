
/*
 * Copyleft (c) 2024. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package cosntructorcalls;

public class StudentTest {

    public static void main(String[] args) {
        Student st1 = new Student();
        Student st2 = new Student("Mike Hammer");
        Student st3 = new Student("Jack Hammer", 2, "C++");
        System.out.println(st1);
        System.out.println(st2.toString());
        System.out.println(st3.toString());
    }

}

class Student {
    String name;
    long number;
    String course;

    Student() {
        this("Peter Parker");
    }

    Student(String name) {
        this(name, 0000);
        //this(name,1);
        //new Student(name, 0);
    }

    private Student(String name, long number) {
        this(name, number, "Java");
    }

    Student(String name, long number, String course) {
        this.name = name;
        this.number = number;
        this.course = course;
    }

    @Override
    public String toString() {
//        Student st = new Student();
//        System.out.println(st.toString()); // causes Stackoverflow
        return "Student{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", course='" + course + '\'' +
                '}';
    }
}

class Employee {
    String name;
    int age;

    Employee() {
        this("Jack Doe", 32);
        //this (); //self call
    }

    Employee(String newName, int newAge) {
        name = newName;
        age = newAge;
    }
}