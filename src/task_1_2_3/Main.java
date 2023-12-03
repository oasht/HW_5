package task_1_2_3;

public class Main {
    public static void main(String[] args) {
        Human h1=new Human(new Name("Иван","Чудов"), null);
        Human h2=new Human (new Name("Петр","Чудов"),h1);
        Human h3=new Human (new Name("Борис"),h2);
        System.out.println(h1);
        System.out.println(h2);
        System.out.println(h3);
    }
}
