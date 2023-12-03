package task_1_2_4;

public class Department {
    String name;
    Employee boss;

    @Override
    public String toString() {
        return boss.name + " начальник отдела "+name;
    }
}
