package ie.lyit.testers;

import ie.lyit.bank.Address;
import ie.lyit.bank.Current;
import ie.lyit.bank.Date;
import ie.lyit.bank.Name;

import java.util.ArrayList;

/**
 * Created by stanley on 10/15/16.
 */
public class CurrentTester2 {
    public static void main (String [] args) {
        Current current = new Current(new Name("Mr", "Stanley", "Nyadzayo"), new Date(26, 10, 2007),
                new Address("14 Rann Mor Meadow", "Crievesmith", "Letterkenny", "Co. Donegal", "Ireland"), -34.09, 34.09);

        Current current1 = new Current(new Name("Miss", "Camilla", "Nyadzayo"), new Date(26, 10, 2014),
                new Address("14 Rann Mor Meadow", "Crievesmith", "Letterkenny", "Co. Donegal", "Ireland"), 33634.09, 0.00);

        Current current2 = new Current(new Name("Mrs", "Brenda", "Nyadzayo"), new Date(31, 8, 2008),
                new Address("16 Rann Mor Meadow", "Crievesmith", "Letterkenny", "Co. Donegal", "Ireland"), 440000.09, 10044.09);

        Current current3 = new Current(new Name("Mr", "Alice", "Kachidza"), new Date(2, 1, 2001),
                new Address("6 Dundrum Wood", "Balinteer", "Dublin 16", "Co. Dublin", "Ireland"), 87834.09, 0.00);

        Current current4 = new Current(new Name("Mr", "Stanley", "Nyadzayo"), new Date(26, 10, 2007),
                new Address("14 Rann Mor Meadow", "Crievesmith", "Letterkenny", "Co. Donegal", "Ireland"), -34.09, 34.09);

        System.out.println(current);
//        System.out.println(current1);
//        System.out.println(current2);
//        System.out.println(current3);
//        System.out.println(current4);

        ArrayList<Current> currents = new ArrayList<>();
        currents.add(current);
        currents.add(current1);
        currents.add(current2);
        currents.add(current3);
        currents.add(current4);

        System.out.println(currentSearch(current3, currents));
    }
    public static boolean currentSearch(Current current, ArrayList<Current> arrayList) {
        for (Current e: arrayList) {
            if (current.equals(e)) return true;
        }
        return false;
    }
}
