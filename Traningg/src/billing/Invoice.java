package billing;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Invoice extends Bill {

public static void main(String[] args) throws IOException {
	 System.out.println("Do you want to print invoice:(y/n) ");
	 Scanner sc = new Scanner(System.in);
		switch (sc.next().toLowerCase()) {
		case "y":
			try {
				File f = new File("Invoice.txt");
				FileWriter fw = new FileWriter(f);
		        fw.write(" ");
		        
		        
		        fw.close();
		 }catch(IOException io){
			
		}
					
			break;
		case "n":
		
			break;
		}
}
}

