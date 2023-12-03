package task_1_2_3;

public class Name {
    String name;
    String patronymic;
    String surname;

    public Name(String name) {
        this.name = name;
    }

    public Name(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Name(String name, String patronymic, String surname) {
        this.name = name;
        this.patronymic = patronymic;
        this.surname = surname;
    }

    @Override
    public String toString() {
        if(name!=null&&patronymic!=null&&surname!=null)
            return surname + " "+ name  + " " + patronymic;
        else if(name!=null&&patronymic==null&&surname!=null)
            return surname + " "+ name;
        else return name;
    }
}
