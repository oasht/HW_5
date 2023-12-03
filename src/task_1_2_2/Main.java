package task_1_2_2;

public class Main {
    public static void main(String[] args) {
        Name n1 = new Name ("Клеопатра");
        Name n2 = new Name ("Александр", "Сергеевич", "Пушкин");
        Name n3 = new Name ("Владимир", "Маяковский");
        Human h1=new Human(n1, 152);
        Human h2=new Human(n2, 167);
        Human h3=new Human(n3, 189);
        System.out.println(h1);
        System.out.println(h2);
        System.out.println(h3);
    }
}
