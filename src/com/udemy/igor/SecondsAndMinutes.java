package com.udemy.igor;

public class SecondsAndMinutes {
    public static String getDurationString(int minutes, int seconds) {
        if ((minutes < 0) || (seconds < 0) || (seconds > 59)){
            return "Invalid Value";
        }
        int hours = minutes / 60;
        int remaningminutes = minutes % 60;
        return hours + "h " + remaningminutes + "m " + seconds + "s";
    }

    public static String getDurationString(int seconds){
        if (seconds < 0){
            return "Invalid value";
        }

        int minutes = seconds / 60;
        int remaningSeconds = seconds % 60;
        return getDurationString(minutes,remaningSeconds);
        //this was my frist method
        //return minutes + "m " + remaningSeconds + "s";
    }

}
