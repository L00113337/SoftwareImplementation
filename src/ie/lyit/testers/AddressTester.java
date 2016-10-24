package ie.lyit.testers;

import ie.lyit.bank.Address;

/**
 * Created by stanley on 10/15/16.
 */
public class AddressTester {
    public static void main(String [] args) {
        Address address = new Address(null, "Rahan", "Letterkenny", "Co. Donegal", "Ireland");
        System.out.println(address.getAddress());
    }
}
