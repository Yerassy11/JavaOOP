package week2;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour,int minute,int second){
        setTime(hour, minute, second);
    }

    public void setTime(int h, int m, int s) {
        if (h >= 0 && h < 24 && m >= 0 && m < 60 && s >= 0 && s < 60) {
            this.hour = h;
            this.minute = m;
            this.second = s;
        } else {
            throw new IllegalArgumentException("Invalid time !");
        }
    }

    public String toUniversal() {
        return String.format("%02d:%02d%02d",hour,minute,second);
    }

    public String toStandard() {
        int stdHour = hour % 12;
        if (stdHour == 0) stdHour = 12;
        String ampm = (hour < 12) ? "AM" : "PM";
        return String.format("%02d:%02d:%02d %s", stdHour, minute, second, ampm); //30
    }

    public void add(Time other) {
        this.second += other.second;
        this.minute += this.second / 60;
        this.second %= 60;

        this.minute += other.minute;
        this.hour += this.minute / 60;
        this.minute %= 60;

        this.hour = (this.hour + other.hour) % 24;
    }

    public static void main(String[] args) {
        Time t = new Time(23, 5, 6);
        System.out.println(t.toUniversal()); // 23:05:06
        System.out.println(t.toStandard());  // 11:05:06 PM

        Time t2 = new Time(4, 24, 33);
        t.add(t2);
        System.out.println("After addition: " + t.toUniversal()); // 03:29:39
    }


}
