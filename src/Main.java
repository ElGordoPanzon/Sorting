import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        var reverseGrade = new GradeComparator().reversed();
        var age = new AgeComparator().reversed();



        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice",12,18));
        students.add(new Student("Brian",9,15));
        students.add(new Student("Bernard",11,16));
        students.sort(reverseGrade.thenComparing(age));

        System.out.println(students);

    }
}