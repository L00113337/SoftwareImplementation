package ie.lyit.testers;

import javax.swing.*;

/**
 * Created by stanley on 10/15/16.
 */
public class IntToString {
    public static void main(String[] args) {
        boolean goodInput = false;
        do try {

            String numberAsString = JOptionPane.showInputDialog("Please enter an integer: ", null);

            // Attempt to convert the String to an int
            int number = Integer.parseInt(numberAsString);
            JOptionPane.showMessageDialog(null, "Number entered is " + number);
            goodInput = true;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "An integer required!");
        }
        while (!goodInput);
    }
}