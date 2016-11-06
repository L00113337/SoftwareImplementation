package ie.lyit.practical6;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by stanley on 31/10/16.
 */
public class Menu {
    private int option;

    public Menu(){
        option=0;
    }

    public void display(){
        System.out.println("Book Menu\n");
        System.out.println("1.  Add");
        System.out.println("2.  List");
        System.out.println("3.  View");
        System.out.println("4.  Edit");
        System.out.println("5.  Delete");
        System.out.println("6.  Quit");
    }

    public void readOption(){
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please select an option from the Menu");
            option = scanner.nextInt();
        }catch (InputMismatchException e){
            System.out.println(e.getMessage());
            System.out.println("Select an option between 1 and 6");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public int getReadOption(){
        return option;
    }
}
