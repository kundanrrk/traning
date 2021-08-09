package pack.a;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public abstract class MyParent {
	public static void main(String[] args) {
		
		try {
		File f = new File("myFile.txt");
		FileWriter fw = new FileWriter(f);
        fw.write("Hello thanks for attending session");
        fw.close();
 }catch(IOException io){
	
}
	}
}
