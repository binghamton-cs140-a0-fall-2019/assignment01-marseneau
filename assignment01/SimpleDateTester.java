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
        SimpleDate date1 = SimpleDate.of(2000, 11, 20);
        SimpleDate date2 = SimpleDate.of(1999, 11, 18);
        SimpleDate date3 = SimpleDate.of(2000, 10, 18);
        SimpleDate date4 = SimpleDate.of(2000, 11, 23);
        SimpleDate date5 = SimpleDate.of(2003, 2, 5);

        //Test the before method
        System.out.println(date1.before(date2));
        System.out.println(date1.before(date3));
        System.out.println(date1.before(date4));
        System.out.println(date1.before(date5));
        System.out.println(date3.before(date1));


    }
}