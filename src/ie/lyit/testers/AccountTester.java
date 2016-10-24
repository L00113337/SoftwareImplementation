package ie.lyit.testers;

import ie.lyit.bank.Account;
import ie.lyit.bank.Address;
import ie.lyit.bank.Date;
import ie.lyit.bank.Name;

/**
 * Created by stanley on 10/15/16.
 */
public class AccountTester {
    public static void main(String [] args) {
        Account account = new Account(new Name("Mr", "Brendan", "Nyadzayo"),
                new Date(17, 2, 2009),
                new Address("14 Rann Mor Meadow", "Crievesmith", "Letterkenny", "Co. Donegal",
                "Ireland"), 30000.00);
        System.out.println(account);

        //Create another account to test if the account numbers change
        Account account1 = new Account(new Name("Miss", "Bree", "Nyadzayo"),
                new Date(23, 2, 2014),
                new Address("14 Rann Mor Meadow", "Crievesmith", "Letterkenny", "Co. Donegal",
                        "Ireland"), 19000.00);
        System.out.println(account1);

    }
}
