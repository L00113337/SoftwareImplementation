package ie.lyit.testers;

import ie.lyit.bank.Name;

import java.util.ArrayList;

/**
 * Created by stanley on 10/15/16.
 */
public class NameTester2 {
    public static void main (String [] args) {
        ArrayList<Name> names = new ArrayList<>();
        names.add(new Name("Mr", "Garth", "Toland"));
        names.add(new Name("Miss", "Kerry", "Liard"));
        names.add(new Name("Mr", "Kiearan", "Thomas"));
        names.add(new Name("Mrs", "Brenda", "Nyadzayo"));

        System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/");

        System.out.println(nameSearch(new Name("Mr", "Garth", "Toland"), names));
    }
    public static boolean nameSearch(Name nameIN, ArrayList<Name> namesIN) {
        for (int i = 0; i <= namesIN.size() -1; i++) {
            if (namesIN.get(i).equals(nameIN)) return true;
        }
        return false;
    }
}
