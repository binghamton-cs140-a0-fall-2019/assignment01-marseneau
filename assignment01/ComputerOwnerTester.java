package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

import assignment01.ComputerOwner;
import assignment01.DateAndPlaceOfBirth;
import assignment01.Person;

public class ComputerOwnerTester
{

    public static void main(String[] args)
    {
        //Create a DOB and address for the person
        DateAndPlaceOfBirth pdob = new DateAndPlaceOfBirth(1999, 1, 13, "Belgrade", "Serbia");
        StreetUSAddress addr = new StreetUSAddress("125 Main Street", "Apartment 7", "Whitney Point", "NY", "13862");

        Person owner = new Person("David", "Davidson", "123-44-5678", pdob, addr);

        //Create four computers to test the owner class
        Computer computer1 = new Computer("Dell", "Intel i5", 8, 2000, true, 700);
        Computer computer2 = new Computer("Dell", "Intel i3", 8, 2000, false, 500);
        Computer computer3 = new Computer("Lenovo", "Intel i3", 8, 500, true, 450);
        Computer computer4 = new Computer("Lenovo", "Intel i5", 8, 500, false, 600);


        //Test the computer owner class
        ComputerOwner person = new ComputerOwner(owner);

        //Add the four computers to the class
        person.addComputer(computer1);
        person.addComputer(computer2);
        person.addComputer(computer3);
        person.addComputer(computer4);

        //Print the list of computers
        System.out.println(person.getComputers());

        //Remove the third and fourth computers
        person.removeComputer(0);
        person.removeComputer(1);

        //Print the list of computers
        System.out.println(person.getComputers());

        //Output the working code to the file
        try(var output =new PrintWriter(new FileOutputStream(
            new File("output.txt"), true ))) {
        output.println("\nTESTS FOR ComputerOwner.java:");
        
            //Create a DOB and address for the person
            DateAndPlaceOfBirth pdob2 = new DateAndPlaceOfBirth(1999, 1, 13, "Belgrade", "Serbia");
            StreetUSAddress addr2 = new StreetUSAddress("125 Main Street", "Apartment 7", "Whitney Point", "NY", "13862");

            Person owner2 = new Person("David", "Davidson", "123-44-5678", pdob2, addr2);

            //Create four computers to test the owner class
            Computer computer12 = new Computer("Dell", "Intel i5", 8, 2000, true, 700);
            Computer computer22 = new Computer("Dell", "Intel i3", 8, 2000, false, 500);
            Computer computer32 = new Computer("Lenovo", "Intel i3", 8, 500, true, 450);
            Computer computer42 = new Computer("Lenovo", "Intel i5", 8, 500, false, 600);


            //Test the computer owner class
            ComputerOwner person2 = new ComputerOwner(owner2);

            //Add the four computers to the class
            person2.addComputer(computer12);
            person2.addComputer(computer22);
            person2.addComputer(computer32);
            person2.addComputer(computer42);

            //Print the list of computers
            output.println(person2.getComputers());

            //Remove the third and fourth computers
            person2.removeComputer(0);
            person2.removeComputer(1);

            //Separate the output
            output.println("\nNow with two computers removed:");

            //Print the list of computers
            output.println(person2.getComputers());

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

    }
}