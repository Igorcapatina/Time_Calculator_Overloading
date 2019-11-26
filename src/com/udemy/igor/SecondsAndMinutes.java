package com.udemy.igor;

public class SecondsAndMinutes {
    public static String getDurationString(int minutes, int seconds) {
        if ((minutes < 0) || (seconds < 0) || (seconds > 59)){
            return "Invalid Value";
        }
        int hours = minutes / 60;
        int remaningminutes = minutes % 60;

        String stringHours = hours + "h";
        if (hours < 10){
            stringHours = "0" + stringHours;
        }

        String stringMinutes = remaningminutes + "m";
        if (remaningminutes < 10){
            stringMinutes = "0" + stringMinutes;
        }

        String stringSeconds = seconds + "s";
        if (seconds < 10){
            stringSeconds = "0" + stringSeconds;
        }

        return stringHours + " " +  stringMinutes + " " + stringSeconds + "";
    }

    public static String getDurationString(int seconds){
        if (seconds < 0){
            return "Invalid value";
        }

        int minutes = seconds / 60;
        int remaningSeconds = seconds % 60;

        return getDurationString(minutes, remaningSeconds);
        //this was my frist method
        //return minutes + "m " + remaningSeconds + "s";
    }

}
