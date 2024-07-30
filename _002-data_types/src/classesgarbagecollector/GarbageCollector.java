
/*
 * Copyleft (c) 2024. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package classesgarbagecollector;

public class GarbageCollector {
    public static void main(String[] args) {
        IslandOfIsolation.run();
    }
}

class Exam {
    private String name;
    private Exam other;

    public Exam(String name) {
        this.name = name;
    }

    public void setExam(Exam exam) {
        other = exam;
    }

    @Override
    public String toString() {
        return "Exam{" +
                "name='" + name + '\'' +
                ", other=" + other +
                '}';
    }
}

class IslandOfIsolation {
    public static void run() {
        Exam php = new Exam("PHP");
        Exam java = new Exam("Java");
        Exam cpp = new Exam("cpp");
        php.setExam(java);
        System.out.println(php.toString());
        java.setExam(cpp);
        System.out.println(php.toString());
        cpp.setExam(php);
        cpp = null;
        php = null;
        java = null;
        // php.toString();
    }
}

//class Course {
//    String course;
//    Lecturer lecturer;
//}
//
//class Lecturer {
//    String Lecturer;
//    Course course;
//}
