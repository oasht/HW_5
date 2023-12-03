package task_1_3_4;

public class Employee {
    String name;
    Department department;

    public Employee(String name, Department department) {
        this.name = name;
        this.department=department;
    }

    @Override
    public String toString() {
        return name+": "+department;
    }
}
