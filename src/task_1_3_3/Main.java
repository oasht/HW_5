package task_1_3_3;

import java.util.List;

public class Main {
    public static void main(String[] args) {
    City a=new City("A", List.of("D: 6", "B: 5","F: 1"));
    City b=new City("B",List.of("A: 5", "C: 3", "F: 1"));
    City c=new City("C",List.of("B: 3", "D:4"));
    City d=new City("D",List.of("E: 2", "C:4", "A: 6"));
    City e=new City("E", List.of("F: 2", "D:2"));
    City f=new City("F", List.of("A: 1", "B: 1", "E: 2"));
        System.out.println(a);
    }
}
