package ie.lyit.bank;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by stanley on 31/10/16.
 */
public class Date {

    private int day, month, year;

    /**
     * create 2 sets, one for the months that contain 30 days
     * and one for the months that contain 31 days
     */
    private final Set<Integer> MONTHS30 = new HashSet<>(Arrays.asList(4, 6, 9, 11));
    private final Set<Integer> MONTHS31 = new HashSet<>(Arrays.asList(1, 3, 5, 7, 8, 10, 12));
    private final int FEB = 2;

    public Date() {
        this(0, 0, 0);
    }

    public Date(int day, int month, int year) {

        if (errorCheck(day, month, year)) {
            this.day = day;
            this.month = month;
            this.year = year;
        }
    }

    public void setDay(int day) {

        int previousDay = this.day;

        if (checkDay(day)) {
            this.day = day;
        }
        this.day = previousDay;
    }

    public int getDay() {
        return day;
    }

    public void setMonth(int month) {

        int previousMonth = this.month;

        if (checkMonth(month)) {
            this.month = month;
        }
        this.month = previousMonth;
    }

    /**
     * Method to get the month as an integer value
     * <p>
     * return month
     */
    public int getMonth() {
        return month;
    }

    /**
     * param year
     * the year to set
     */

    public void setYear(int year) {

        if (checkYear(year)) {
            this.year = year;
        }
    }

    /**
     * Method to get the year as an integer value
     * <p>
     * <p>
     * return year
     */

    public int getYear() {
        return year;
    }

    /**
     * Method to check that the dates are entered correctly
     * <p>
     * day
     * month
     * year
     * return boolean
     */
    public boolean errorCheck(int day, int month, int year) {
        return checkDay(day) || checkMonth(month) || checkYear(year);
    }

    /**
     * Method to check that the year is valid
     * year
     * return boolean
     */

    public boolean checkYear(int year) throws IllegalArgumentException {
        // First check that the year is valid
        if (year < 1870 || year > 2016) {
            // the methods above throw an exception
            // so it will be handled below
            throw new IllegalArgumentException("Sorry invalid entry for year\n Please select again");

        }
        return true;
    }

    /**
     * Method to check that the month is valid
     * month
     * boolean
     */

    public boolean checkMonth(int month) throws IllegalArgumentException {
        // First check that the month is valid
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Sorry invalid entry for month\n Please select again");

        }
        return true;

    }


    /**
     * Method to check that the day is valid
     * month
     * boolean
     */

    public boolean checkDay(int day) throws IllegalArgumentException {
        // First check that the day is valid
        if (month == FEB) {
            if(day < 1 || day > 28) {

                throw new IllegalArgumentException("Sorry invalid entry for day\n Please select again");

            }
            return true;
        }else if (MONTHS30.contains(month)) {

            // This checks that the all months with 30 days is correct
            if (day < 1 || day > 30) {

                // We now have our methods throwing an exception that must
                // be dealt with when we use them in our classes
                throw new IllegalArgumentException("Sorry invalid entry for day\nPlease select again");
            }

            return true;

        } else if (MONTHS31.contains(month)) {

            // This checks that the all months with 31 days is correct
            if (day < 1 || day > 31) {

                // We now have our methods throwing an exception that must
                // be dealt with when we use them in our classes
                throw new IllegalArgumentException("Sorry invalid entry for day\nPlease select again");
            }

            return true;

        }

        return false;
    }



    @Override
    public String toString() {
        return day + "/" + month + "/" + year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Date date = (Date) o;

        if (day != date.day) return false;
        if (month != date.month) return false;
        return year == date.year;

    }
}
