package lesson6.Students;

import java.util.HashSet;
import java.util.Set;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Set<Student> students = new HashSet<>();

        students.add(new Student("Vladislava", 1, "1A", List.of(5, 2, 5, 3, 4)));
        students.add(new Student("Anna", 1, "1A", List.of(2, 5, 3, 5, 1)));
        students.add(new Student("Maxim", 1, "1A", List.of(1, 2, 3, 2, 1)));

        students.removeIf(student -> student.getAverageMark() < 3);

        for (Student student : students) {
            if (student.getAverageMark() >= 3) {
                student.setCourse(student.getCourse() + 1);
            }
        }
        printStudents(students, 2);
    }

    public static void printStudents(Set<Student> students, int course) {

        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }
}