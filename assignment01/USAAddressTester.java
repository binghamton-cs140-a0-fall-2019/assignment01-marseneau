package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

//Import the address class
import assignment01.StreetUSAddress;

public class USAAddressTester {

    public static void main(String[] args)
    {
        //Create two address objects, one with only one addres line
        StreetUSAddress address1 = new StreetUSAddress("230 Anderson Street", "", "Fort Collins", "CO", "80521");

        StreetUSAddress address2 = new StreetUSAddress("125 Main Street", "Apartment 7", "Whitney Point", "NY", "13862");

        //Print the addresses to make sure they output the correct amount of lines
        System.out.println(address1);

        //Separate the output
        System.out.println("\n");

        System.out.println(address2);

        try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true ))) {
			output.println("\nTESTS FOR StreetUSAddress.java:");

                //Create two address objects, one with only one addres line
                StreetUSAddress address12 = new StreetUSAddress("230 Anderson Street", "", "Fort Collins", "CO", "80521");

                StreetUSAddress address22 = new StreetUSAddress("125 Main Street", "Apartment 7", "Whitney Point", "NY", "13862");

                //Print the addresses to make sure they output the correct amount of lines
                output.println(address12);

                //Separate the output
                output.println("\n");

                output.println(address22);


		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
    }
}