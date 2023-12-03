package task_1_4_3;

public class House {
    final int floors;

    public House(int floors) {
        this.floors = floors;
    }

    @Override
    public String toString() {
        if(floors%10==1&&floors!=11)
            return "Дом с " + floors + " этажом";
        else
            return "Дом с " + floors + " этажами";
    }
}
