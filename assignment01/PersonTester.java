package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

import assignment01.DateAndPlaceOfBirth;
//Import the person class
import assignment01.Person;
import assignment01.StreetUSAddress;

public class PersonTester 
{

    public static void main(String[] args)
    {
        DateAndPlaceOfBirth placeDOB = new DateAndPlaceOfBirth(1999, 1, 13, "Belgrade", "Serbia");

        StreetUSAddress address = new StreetUSAddress("125 Main Street", "Apartment 7", "Whitney Point", "NY", "13862");

        //Create a person
        Person person1 = new Person("John", "Doe", "123-44-5678", placeDOB, address);

        //Print the person
        System.out.println(person1);

        //Output works, send it to the output file
        try(var output =new PrintWriter(new FileOutputStream(
            new File("output.txt"), true ))) {
        output.println("\nTESTS FOR Person.java:");
        
        DateAndPlaceOfBirth placeDOB2 = new DateAndPlaceOfBirth(1999, 1, 13, "Belgrade", "Serbia");

        StreetUSAddress address2 = new StreetUSAddress("125 Main Street", "Apartment 7", "Whitney Point", "NY", "13862");

        //Create a person
        Person person12 = new Person("John", "Doe", "123-44-5678", placeDOB2, address2);

        //Print the person
        output.println(person12);


            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

    }
}
