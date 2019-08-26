package assignment01;
//test
/**
 * 
 * @author CS 140
 *
 */
public class Person {
	private String firstNames; 
	private String lastNames;
	private int ssn;
	private DateAndPlaceOfBirth placeDob;
	private StreetUSAddress address;
	/**
	 * 
	 * @param firstNames
	 * @param lastNames
	 * @param ssn
	 * @param placeDob
	 * @param address
	 */
	public Person(String fstNames, String lstNames, String ssnString, DateAndPlaceOfBirth pdob,
			StreetUSAddress addr) {
		firstNames = fstNames;
		lastNames = lstNames;
		var str = ssnString.trim().replace("-","");
		while(str.charAt(0) == '0') {
			str = str.substring(1);
		}
		try {
			ssn = Integer.parseInt(str);
		} catch(NumberFormatException ex) {
			System.out.println("Bad format for the SSN, use only digits or use '-' separators");
			throw new IllegalArgumentException("This entry is not acceptable: " + ssnString);
		}
		placeDob = pdob;
		address = addr;
	}
	/**
	 * 
	 * @return
	 */
	public String getFirstNames() {
		return firstNames;
	}
	/**
	 * 
	 * @return
	 */
	public String getLastNames() {
		return lastNames;
	}
	/**
	 * 
	 * @return
	 */
	public String getSSN() {
// either
//		String str = String.format("%09d", ssn);
//		return str.substring(0,3) + "-" + str.substring(3,5) + "-" + str.substring(5); 
// or
		return String.format("%03d-%02d-%04d", ssn/1000000,ssn%1000000/10000, ssn%10000); 

	}
	//Get methods for address and place/DOB
	public DateAndPlaceOfBirth getPlaceDOB()
	{
		return placeDob;
	}

	public StreetUSAddress getAddress()
	{
		return address;
	}

// toString of the StreetUSAddress class and will print a person as:
// Jane Doe (111-22-3333), 
// Date and place of birth: 1999-04-23, Springfield, CA, USA
// 123 Main Street
// Apt 1B
// Binghamton, NY 13905
@Override
public String toString() {
	//Break up the ssn into three different numbers, putting dashes in between
	//Beginning of the string format translates to what you see in the output
	return String.format("%s %s (%03d-%02d-%04d) \n%s \n%s", firstNames, lastNames, ssn/1000000, (ssn%1000000)/10000, ssn%10000, placeDob, address);
}
}
