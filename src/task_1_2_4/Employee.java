package task_1_2_4;

public class Employee {
    String name;
    Department department;

    public Employee(String name, Department department) {
        this.name = name;
        this.department=department;
    }

    @Override
    public String toString() {
        if(this==department.boss)
            return name+ " начальник отдела "+ department.name;
        return name+ " работает в отделе "+department.name+", начальник которого "+department.boss.name;
    }
}
