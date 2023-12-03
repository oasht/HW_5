package task_1_4_7;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> grades_vasya=new ArrayList<>();
        List<Integer>grades_maksim=new ArrayList<>();
        grades_vasya.add(3);
        grades_vasya.add(4);
        grades_vasya.add(5);
        Student s1=new Student("Вася", grades_vasya);
        System.out.println(s1);
        Student s2=new Student("Максим",grades_maksim);
        System.out.println(s2);
    }
}
