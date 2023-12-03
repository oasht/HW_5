package task_1_4_7;

import java.util.List;

public class Student {
    String name;
    List<Integer> grades;

    public Student(String name,List<Integer>grades ) {
        this.name = name;
        this.grades = grades;
    }

    @Override
    public String toString()
    {
        if(grades.isEmpty())
            return name+" без оценок";
        return name+":" +grades;
    }
}
