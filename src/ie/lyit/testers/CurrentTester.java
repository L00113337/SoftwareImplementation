package ie.lyit.testers;

import ie.lyit.bank.Address;
import ie.lyit.bank.Current;
import ie.lyit.bank.Date;
import ie.lyit.bank.Name;

/**
 * Created by stanley on 10/15/16.
 */
public class CurrentTester {
    public static void main(String [] args) {
        Current current = new Current(new Name("Mrs", "Brenda", "Nyadzayo"), new Date(29, 4, 2008),
                new Address(null, "6 Dundrum Wood", "Dublin", "Co. Dublin", "Ireland"), 200000.00, 0.0);
        System.out.println(current);
    }
}
