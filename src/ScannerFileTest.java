import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerFileTest {
	public static void main(String[] args) {
		File file = new File("/home/oracle/workspace/java/customer.txt");
		try {
			Scanner sc = new Scanner(file);
			sc.useDelimiter("\\t");
			Customer c = new Customer();
			//you must escape the slash of the tab 
			while (sc.hasNextLine()) {
				String i = sc.next();
				c.setFullName(i);
				i = sc.next();
				c.setSalutation(i);
				i = sc.next();
				c.setFirstName(i);
				i = sc.next();
				c.setLastName(i);
				i = sc.next();
				c.setAddress(i);
				i = sc.next();
				c.setState(i);
				i = sc.next();
				c.setZip(i);
				i = sc.next();
				c.setEmail(i);
				i = sc.next();
				c.setPosition(i);
				i = sc.next();
				c.setCompany(i);
				System.out.println(c.printall());


			}
			sc.close();
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
