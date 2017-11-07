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
        String result = Birthday.daysToString(420);
        assertEquals( "1 years 1 months 25 days", result);
    }

    @Test
    public void testZeroMonths(){
        String result = Birthday.daysToString(365);
        assertEquals( "1 years 0 months 0 days", result);
    }
}
