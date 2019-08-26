package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

//Import the computer class
import assignment01.Computer;

public class ComputerTester {

    public static void main(String[] args) {

        //Four objects
        //different combinations of disk size

        //Two have more than a TB
            //of these, one has an SSD and one doesn't

        //Two have less
            //of these, one has an SSD and one doesn't

        //First computer: greater than 1 TB disk, has SSD
        Computer computer1 = new Computer("Dell", "Intel i5", 8, 2000, true, 700);

        //Second computer: greater than 1TB disk, no SSD
        Computer computer2 = new Computer("Dell", "Intel i3", 8, 2000, false, 500);

        //Third computer: smaller than 1TB disk, has SSD
        Computer computer3 = new Computer("Lenovo", "Intel i3", 8, 500, true, 450);

        //Fourth computer: smaller than 1TB disk, no SSD
        Computer computer4 = new Computer("Lenovo", "Intel i5", 8, 500, false, 600);

        //Output the computer objects as directed
        System.out.println(computer1);
        System.out.println(computer2);
        System.out.println(computer3);
        System.out.println(computer4);


        try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true ))) {
            output.println("\nTESTS FOR Computer.java:");
            
                    //First computer: greater than 1 TB disk, has SSD
                    Computer computer12 = new Computer("Dell", "Intel i5", 8, 2000, true, 700);

                    //Second computer: greater than 1TB disk, no SSD
                    Computer computer22 = new Computer("Dell", "Intel i3", 8, 2000, false, 500);

                    //Third computer: smaller than 1TB disk, has SSD
                    Computer computer32 = new Computer("Lenovo", "Intel i3", 8, 500, true, 450);

                    //Fourth computer: smaller than 1TB disk, no SSD
                    Computer computer42 = new Computer("Lenovo", "Intel i5", 8, 500, false, 600);

                    //Output the computer objects to file
                    output.println(computer12);
                    output.println(computer22);
                    output.println(computer32);
                    output.println(computer42);

                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }

    }

}