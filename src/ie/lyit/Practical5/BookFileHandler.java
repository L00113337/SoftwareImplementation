package ie.lyit.Practical5;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by stanley on 10/20/16.
 */
public class BookFileHandler {
    private ArrayList<Book> books;

    public BookFileHandler() {
        this.books = new ArrayList<Book>();
    }

    public void add() {
        Book b1 = new Book();
        b1.read();
        books.add(b1);
    }

    public void writeRecordsTofile() {
        try {
            FileOutputStream fileOut = new FileOutputStream("/home/stanley/IdeaProjects/SoftwareImplimentation/src/ie/lyit/Practical5/FileHandler.bin");
            ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
            objOut.writeObject(books);
            objOut.close();
        }catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }


    }
    public void readRecordsFromFile() {
        try{
            FileInputStream fileIn = new FileInputStream("/home/stanley/IdeaProjects/SoftwareImplimentation/src/ie/lyit/Practical5/FileHandler.bin");
            ObjectInputStream objIn = new ObjectInputStream(fileIn);
            books = (ArrayList<Book>) objIn.readObject();
            objIn.close();
        }catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    public void list() {
        for (Book mylist : books)
            System.out.println(mylist);
    }
    public void view() {

        }
    public void delete() {

    }
    public void edit(){

    }


}
