package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

//Import the DOB class
import assignment01.DateAndPlaceOfBirth;

public class PlaceDOBTester {

    public static void main(String[] args) {

        //Two people with the same date of birth, three with the same birthday
        //Not from U.S.
        DateAndPlaceOfBirth person1 = new DateAndPlaceOfBirth(1999, 1, 13, "Belgrade", "Serbia");

        //From U.S.
        DateAndPlaceOfBirth person2 = new DateAndPlaceOfBirth(1999, 1, 13, "Gary", "Indiana", "United States");

        //From U.S.
        DateAndPlaceOfBirth person3 = new DateAndPlaceOfBirth(1983, 1, 13, "Sacramento", "California", "United States");

        //Not from U.S.
        DateAndPlaceOfBirth person4 = new DateAndPlaceOfBirth(1992, 4, 15, "Berlin", "Germany");

        //From U.S.
        DateAndPlaceOfBirth person5 = new DateAndPlaceOfBirth(1984, 11, 3, "Rochester", "New York", "United States");

        //Print the person information
        System.out.println("Person date and place of birth information:");
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);
        System.out.println(person5);

        //Print to test the other DateAndPlaceOfBirth methods

        //-----------------------------------------------------------------------------------------
        //Test same birth date method
        //-----------------------------------------------------------------------------------------
        
        //Separate output
        System.out.println("\n");
        System.out.println("Test for hasSameBirthDateAs:");
        
        //True
        System.out.println(person1.hasSameBirthDateAs(person2));

        //False
        System.out.println(person1.hasSameBirthDateAs(person3));

        //False
        System.out.println(person1.hasSameBirthDateAs(person5));

        //True
        System.out.println(person2.hasSameBirthDateAs(person1));

        //False
        System.out.println(person5.hasSameBirthDateAs(person3));

        //-----------------------------------------------------------------------------------------
        //Test the olderThan method
        //-----------------------------------------------------------------------------------------

        //Separate output
        System.out.println("\n");
        System.out.println("Test for olderThan:");

        //False
        System.out.println(person1.olderThan(person2));

        //False
        System.out.println(person1.olderThan(person4));

        //True
        System.out.println(person4.olderThan(person1));

        //True
        System.out.println(person3.olderThan(person5));

        //False
        System.out.println(person4.olderThan(person3));

        //False
        System.out.println(person1.olderThan(person3));

        //-----------------------------------------------------------------------------------------
        // Test the youngerThan method
        //-----------------------------------------------------------------------------------------

        //Separate output
        System.out.println("\n");
        System.out.println("Test for youngerThan:");


        //False
        System.out.println(person1.youngerThan(person2));

        //True
        System.out.println(person1.youngerThan(person4));

        //False
        System.out.println(person4.youngerThan(person1));

        //False
        System.out.println(person3.youngerThan(person5));

        //True
        System.out.println(person4.youngerThan(person3));

        //True
        System.out.println(person1.youngerThan(person3));

        //-----------------------------------------------------------------------------------------
        // Test the hasSameBirthDayAs method
        //-----------------------------------------------------------------------------------------

        //Separate output
        System.out.println("\n");
        System.out.println("Test for hasSameBirthdayAs:");

        //True
        System.out.println(person1.hasSameBirthDayAs(person2));

        //True
        System.out.println(person3.hasSameBirthDayAs(person1));

        //False
        System.out.println(person1.hasSameBirthDayAs(person4));

        //False
        System.out.println(person4.hasSameBirthDayAs(person5));

        //False
        System.out.println(person3.hasSameBirthDayAs(person5));

        //-----------------------------------------------------------------------------------------
        // Output information to file
        //-----------------------------------------------------------------------------------------

        try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR DateAndPlaceOfBirth.java:");

            //Two people with the same date of birth, three with the same birthday
            //Not from U.S.
            DateAndPlaceOfBirth person12 = new DateAndPlaceOfBirth(1999, 1, 13, "Belgrade", "Serbia");

            //From U.S.
            DateAndPlaceOfBirth person22 = new DateAndPlaceOfBirth(1999, 1, 13, "Gary", "Indiana", "United States");

            //From U.S.
            DateAndPlaceOfBirth person32 = new DateAndPlaceOfBirth(1983, 1, 13, "Sacramento", "California", "United States");

            //Not from U.S.
            DateAndPlaceOfBirth person42 = new DateAndPlaceOfBirth(1992, 4, 15, "Berlin", "Germany");

            //From U.S.
            DateAndPlaceOfBirth person52 = new DateAndPlaceOfBirth(1984, 11, 3, "Rochester", "New York", "United States");

            //Print the person information
            output.println("Person date and place of birth information:");
            output.println(person12);
            output.println(person22);
            output.println(person32);
            output.println(person42);
            output.println(person52);

            //Print to test the other DateAndPlaceOfBirth methods

            //-----------------------------------------------------------------------------------------
            //Test same birth date method
            //-----------------------------------------------------------------------------------------
            
            //Separate output
            output.println("\n");
            output.println("Test for hasSameBirthDateAs:");
            
            //True
            output.println(person12.hasSameBirthDateAs(person22));

            //False
            output.println(person12.hasSameBirthDateAs(person32));

            //False
            output.println(person12.hasSameBirthDateAs(person52));

            //True
            output.println(person22.hasSameBirthDateAs(person12));

            //False
            output.println(person52.hasSameBirthDateAs(person32));

            //-----------------------------------------------------------------------------------------
            //Test the olderThan method
            //-----------------------------------------------------------------------------------------

            //Separate output
            output.println("\n");
            output.println("Test for olderThan:");

            //False
            output.println(person12.olderThan(person22));

            //False
            output.println(person12.olderThan(person42));

            //True
            output.println(person42.olderThan(person12));

            //True
            output.println(person32.olderThan(person52));

            //False
            output.println(person42.olderThan(person32));

            //False
            output.println(person12.olderThan(person32));

            //-----------------------------------------------------------------------------------------
            // Test the youngerThan method
            //-----------------------------------------------------------------------------------------

            //Separate output
            output.println("\n");
            output.println("Test for youngerThan:");


            //False
            output.println(person12.youngerThan(person22));

            //True
            output.println(person12.youngerThan(person42));

            //False
            output.println(person42.youngerThan(person12));

            //False
            output.println(person32.youngerThan(person52));

            //True
            output.println(person42.youngerThan(person32));

            //True
            output.println(person12.youngerThan(person32));

            //-----------------------------------------------------------------------------------------
            // Test the hasSameBirthDayAs method
            //-----------------------------------------------------------------------------------------

            //Separate output
            output.println("\n");
            output.println("Test for hasSameBirthdayAs:");

            //True
            output.println(person12.hasSameBirthDayAs(person22));

            //True
            output.println(person32.hasSameBirthDayAs(person12));

            //False
            output.println(person12.hasSameBirthDayAs(person42));

            //False
            output.println(person42.hasSameBirthDayAs(person52));

            //False
            output.println(person32.hasSameBirthDayAs(person52));

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}


    }

}