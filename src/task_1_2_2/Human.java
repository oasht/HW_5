package task_1_2_2;

public class Human {
    Name name;
    int height;

    public Human(Name name, int height) {
        this.name = name;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Человек с именем " +name + " и ростом " + height;
    }
}
