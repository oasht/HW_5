package task_1_1_4;

public class Time {
    int secs;

    public Time(int secs) {
        this.secs = secs;
    }

    @Override
    public String toString() {
        long hour = secs / 3600,
                min = secs / 60 % 60,
                sec = secs % 60;

        if (hour>23)
        {
            hour = hour%24;
            return String.format("%02d:%02d:%02d", hour, min, sec);}
        else
            return String.format("%02d:%02d:%02d", hour, min, sec);}
}
