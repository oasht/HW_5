package task_1_1_5;

public class House {
    int floors;

    @Override
    public String toString() {
        if(floors%10==1&&floors!=11)
            return "Дом с " + floors + " этажом";
        else
            return "Дом с " + floors + " этажами";
    }
}
