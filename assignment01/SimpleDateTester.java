package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

import assignment01.SimpleDate;

public class SimpleDateTester
{

    public static void main(String[] args)
    {
        SimpleDate date1;
        date1 = date1.of(2000, 11, 20);

        SimpleDate date2 = new SimpleDate(1999, 11, 18);
        SimpleDate date3 = new SimpleDate(2000, 10, 18);
        SimpleDate date4 = new SimpleDate(2000, 11, 23);
        SimpleDate date5 = new SimpleDate(2003, 2, 5);

        //Test the before method
        System.out.println(date1.before(date2));
        System.out.println(date1.before(date3));
        System.out.println(date1.before(date4));
        System.out.println(date1.before(date5));
        System.out.println(date3.before(date1));


    }
}