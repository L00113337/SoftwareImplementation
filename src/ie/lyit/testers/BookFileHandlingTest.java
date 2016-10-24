package ie.lyit.testers;

import ie.lyit.Practical5.Book;
import ie.lyit.Practical5.BookFileHandler;

import java.util.ArrayList;

/**
 * Created by stanley on 10/24/16.
 */
public class BookFileHandlingTest {

        public static void main(String[] args) {

            //create an objectJava
            BookFileHandler myhandler = new BookFileHandler();

        /*  //add book objects to bookList
            myhandler.add();
            myhandler.add();
            myhandler.writeRecordsTofile();
*/
            myhandler.readRecordsFromFile();
            myhandler.list();

        }

    }


