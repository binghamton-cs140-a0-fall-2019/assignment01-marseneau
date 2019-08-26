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

        //Output in terminal looks good, send it to the output file
        try(var output =new PrintWriter(new FileOutputStream(
            new File("output.txt"), true ))) {
        output.println("\nTESTS FOR SimpleDate.java:");
        
        //Object tests sent to output.txt
        SimpleDate date12 = SimpleDate.of(2000, 11, 20);
        SimpleDate date22 = SimpleDate.of(1999, 11, 18);
        SimpleDate date32 = SimpleDate.of(2000, 10, 18);
        SimpleDate date42 = SimpleDate.of(2000, 11, 23);
        SimpleDate date52 = SimpleDate.of(2003, 2, 5);

        //Test the before method
        output.println(date12.before(date22));
        output.println(date12.before(date32));
        output.println(date12.before(date42));
        output.println(date12.before(date52));
        output.println(date32.before(date12));


            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }



    }
}