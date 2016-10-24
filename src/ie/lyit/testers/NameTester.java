package ie.lyit.testers;

import ie.lyit.bank.Name;

/**
 * Created by stanley on 10/15/16.
 */
public class NameTester {

    public static void main (String [] args) {
        Name name1= new Name();
        Name name2= new Name("Mr", "Yaap", "Sunday");
        Name name3= new Name("Ms", "Anna", "Zororo");

        System.out.println("Test 1");
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);

        System.out.println("Test 2");
        name1.setTitle("Mr");
        name1.setFirstname("Yaap");
        name1.setSurname("Sunday");
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
        System.out.println(name1.equals(name2));
        System.out.println(name3.isFemale());
    }
}
