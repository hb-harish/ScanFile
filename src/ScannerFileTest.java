import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;
import java.io.PrintWriter;

public class ScannerFileTest {
	public static void main(String[] args) {
		File file = new File("/home/oracle/workspace/java/customer.txt");
		try {
			Scanner sc = new Scanner(file);
			sc.useDelimiter("\\t");
			Customer c = new Customer();
			LinkedList<Customer> cust = new LinkedList<Customer>();
			//you must escape the slash of the tab 
			PrintWriter writer=null;
			try {
			     writer = new PrintWriter(new File("/home/oracle/workspace/java/ScanFile/src/output.txt"));
			 } catch (FileNotFoundException e) {
			     System.out.println("File not found");
			 }
			int z = 0;
			while (sc.hasNextLine()) { //sc.hasNextLine()
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
				c.setCity(i);
				i = sc.next();
				c.setState(i);
				i = sc.next();
				c.setZip(i);
				i = sc.next();
				c.setEmail(i);
				i = sc.next();
				c.setPosition(i);
				i = sc.nextLine();
				c.setCompany(i);
				System.out.println(c.printall() + sc.hasNextLine());
				cust.add(c);
				writer.print(c.getFullName()+ " ");
				writer.println(c.getEmail()); 
				z++;
					 
			}
			sc.close();
			writer.close();
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
