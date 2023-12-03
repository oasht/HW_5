package task_1_3_1;

import java.util.List;

public class Student {
    String name;
    List<Integer> grades;

    public Student(String name,List<Integer>grades ) {
        this.name = name;
        this.grades = grades;
    }

    @Override
    public String toString() {
        return name+":" +grades;
    }
}
