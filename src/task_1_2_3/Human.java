package task_1_2_3;

public class Human {
    Name name;
    Human father;


    public Human(Name name, Human father) {
        this.name = name;
        this.father=father;
    }

    @Override
    public String toString() {
        if(father==null)
            return "Человек с именем " +name;
        if (name.patronymic == null)
            name.patronymic = father.name.name + "ович";
        if (name.surname == null)
            name.surname = father.name.surname;
        return "Человек с именем " + name;

    }
}
