package task_1_4_6;

public class Main {
    public static void main(String[] args) {
        Human h1=new Human("Лев", 170);
        Human h2=new Human (new Name("Сергей","Пушкин"),168, h1);
        Human h3=new Human ("Александр",167, h2);
        System.out.println(h1);
        System.out.println(h2);
        System.out.println(h3);
    }
}
