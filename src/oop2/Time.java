package oop2;

public class Time {
    int hour;
    int minute;
    boolean isAM;

    public Time(int hours, int minutes) {
        //constructor takes 24-hour clock
        if (hours > 12) {
            hour = hours - 12;
            isAM = false;
        } else {
            hour = hours;
            isAM = true;
        }
        minute = minutes;
    }

    public Time(int hours, int minutes, String ampm) {
        // constructor takes 12-hour clock
        hour = hours;
        minute = minutes;
        if (ampm.equals("AM")) {
            isAM = true;
        } else {
            isAM = false;
        }
    }

    public String toString12() {
        String answer = hour + ":" + minute;
        if (isAM) {
            answer += "AM";
        }
        else {
            answer += "PM";
        }
        return answer;
    }

    public String toString24() {
        if (isAM) {
            return hour + ":" + minute;
        } else {
            return (hour + 12) + ":" + minute;
        }
    }


}
