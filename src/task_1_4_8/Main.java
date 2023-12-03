package task_1_4_8;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        City c1=new City("Moscow");
        City a=new City("A", List.of("D: 6", "B: 5","F: 1"));
        System.out.println(c1);
        System.out.println(a);
    }
}
