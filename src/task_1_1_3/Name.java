package task_1_1_3;

public class Name {
    String name;
    String patronymic;
    String surname;

    public Name(){}

    @Override
    public String toString() {
        if(name!=null&&patronymic!=null&&surname!=null)
            return surname + " "+ name  + " " + patronymic;
        else if(name!=null&&patronymic==null&&surname!=null)
            return surname + " "+ name;
        else return name;
    }

}
