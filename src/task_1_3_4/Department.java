package task_1_3_4;

import java.util.List;

public class Department {
    String name;
    Employee boss;

    List<String> employees;


    public Department() {

    }

    public Department(String name, Employee boss, List<String> employees) {
        this.name = name;
        this.boss = boss;
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "\nДепартамент: "+ name +"\n"+"Начальник: "+boss.name+"\n"+"Сотрудники департамента: "+employees;
    }

}
