package com.example.clintgarrison.lucyandetta;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by clintgarrison on 10/30/17.
 */

public class Birthday {

    public static String getAge(Date birthday){
        String result = "";
        try{
            Date today = new Date();
            System.out.println("today:" + today.toString());
            System.out.println("birthday:" + birthday.toString());
            long diff = today.getTime() - birthday.getTime();
            long days = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
            System.out.println(String.valueOf(days));
            result = Birthday.daysToString(days);
        }catch(Exception e){
            result = "I not know how old I am :(";
        }
        return result;
    }

    public static String daysToString(long input){
        long years = 0;
        long months = 0;
        long days = 0;
        if(input < 365){
            days = input;
        }else{
            years = input / 365;
            days = input % 365;
        }
        if(days >= 30){
            months = days / 30;
            days = days % 30;
        }
        if(years>0){
            return String.format("%d years %d months %d days", years, months, days);
        }else{
            if(months > 0){
                return String.format("%d months %d days", months, days);
            }else{
                return String.format("%d days", days);
            }
        }
    }
}
