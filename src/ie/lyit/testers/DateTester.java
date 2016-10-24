package ie.lyit.testers;

import ie.lyit.bank.Date;

/**
 * Created by stanley on 10/15/16.
 */
public class DateTester {
    public static void main (String [] args) {
        Date date = new Date(2, 1, 2016);
        Date date1 = new Date();
        Date date2 = new Date(10, 10, 2016);

        date1.setDay(30);
        date1.setMonth(12);
        date1.setYear(2009);

        System.out.println(date);
        System.out.println(date1);
        System.out.println(date2);
    }
}
