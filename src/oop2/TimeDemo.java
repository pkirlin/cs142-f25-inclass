package oop2;

public class TimeDemo {
    public static void main(String[] args) {
        Time t1 = new Time(2, 30, "PM");
        System.out.println(t1.toString12());
        System.out.println(t1.toString24());
    }
}
