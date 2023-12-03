package task_1_4_4;

public class Time {
    final int hours;
    final int mins;
    final int secs;

    public Time(int hours, int mins, int secs) {
        if(hours<24&&mins<60&&secs<60) {
            this.hours = hours;
            this.mins = mins;
            this.secs = secs;
        }
            else {
            this.hours = 0;
            this.mins = 0;
            this.secs = 0;
            System.out.println("Invalid data");
        }

    }
    public Time(int secs) {
        this.secs = secs;
        this.hours=0;
        this.mins=0;
    }



    @Override
    public String toString() {
        if(hours==0 &&mins==0) {
            long hour = secs / 3600,
                    min = secs / 60 % 60,
                    sec = secs % 60;

            if (hour > 23) {
                hour = hour % 24;
                return String.format("%02d:%02d:%02d", hour, min, sec);
            } else
                return String.format("%02d:%02d:%02d", hour, min, sec);
        }
        else
            return String.format("%02d:%02d:%02d", hours, mins, secs);}
}
