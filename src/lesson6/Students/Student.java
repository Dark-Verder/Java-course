package lesson6.Students;

import java.util.List;

public class Student {
    private String name;
    private int course;
    private String group;
    private List<Integer> marks;

    public Student(String name, int course, String group, List<Integer> marks) {
        this.name = name;
        this.course = course;
        this.group = group;
        this.marks = marks;
    }

    public double getAverageMark() {
        int sum = 0;
        for (Integer mark : marks) {
            sum += mark;
        }
        return (double) sum / marks.size();
    }

    public String getName() {
        return name;
    }
    public int getCourse() {
        return course;
    }
    public void setCourse (int course) {
        this.course = course;
    }

}