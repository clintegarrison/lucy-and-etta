package com.example.clintgarrison.lucyandetta;

import android.util.Log;

import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

import static junit.framework.Assert.assertEquals;

/**
 * Created by clintgarrison on 10/30/17.
 */

public class BirthdayTest {

    @Test
    public void testGetAge(){
        Calendar c = Calendar.getInstance();
        c.setTime(new Date());
        c.add(Calendar.DATE, -400);
        Date todayPlusFive = c.getTime();

        String result = Birthday.getAge(todayPlusFive);
        System.out.println(result);
        assertEquals(result, "I am 400 days old!");
    }

    @Test
    public void testMoreThanAYear(){
        String result = Birthday.daysToString(400);
        assertEquals(result, "I am 1 years and 35 days old!");
    }
}
