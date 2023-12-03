package task_1_2_4;

public class Main {
    public static void main(String[] args) {
        Department d1=new Department();
        d1.name="IT";
        Employee e1=new Employee("Петров",d1);
        Employee e2=new Employee("Козлов",d1);
        Employee e3=new Employee("Сидоров",d1);
        d1.boss=e2;
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
    }
}
