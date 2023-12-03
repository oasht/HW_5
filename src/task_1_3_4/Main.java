package task_1_3_4;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Department d1=new Department();
        d1.name="IT";
        Employee e1=new Employee("Петров",d1);
        Employee e2=new Employee("Козлов",d1);
        Employee e3=new Employee("Сидоров",d1);
        d1.boss=e2;
        List<String> employees_it=List.of(e1.name,e2.name,e3.name);
        d1.employees=employees_it;
        System.out.println(e1);
    }
}
