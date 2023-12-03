package task_1_4_6;

public class Human {
    Name name;
    Human father;

    int height;

    public Human(String name_string, int height) {
        this.name = new Name(name_string);
        this.height = height;
    }

    public Human(String name_string, int height,  Human father) {
        this.name = new Name(name_string);
        this.height=height;
        this.father=father;
    }
    public Human(Name name, int height) {
        this.name = name;
        this.height = height;
    }
    public Human(Name name, int height,Human father) {
        this.name = name;
        this.height = height;
        this.father=father;
    }
    @Override
    public String toString() {
        if(father==null)
            return "Человек с именем " +name+ " и ростом "+height;
        else
        return "Человек с именем " + name+ " и ростом "+height+", и отцом "+father.name.name;

    }
}
