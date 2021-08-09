package billing;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.io.*;

public class Bill {
		
	public float calculateBill(float quantity,float price) {
		return quantity*price;
	}
	
	public float calculateBill(float quantity,float price,int gst) {
		float amount = calculateBill(quantity, price);
		return amount+=(amount*gst/100);
	}
	
	public float calculateGst(float amount,int gst) {		
		return (amount*gst/100);
	}

	
	  
 
}

