package Task_1;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[] {
                new Student("Ivan", 100),
                new Student("Dima", 50),
                new Student("Vika", 0)
        };

        Comparator<Student> comparator = new StudentComparator();
        for (Student student : students) {
            for (Student value : students) {
                System.out.format(
                        "%s compareTo %s -> %2d\n",
                        student.name,
                        value.name,
                        comparator.compare(student, value)
                );
            }
        }
    }
}