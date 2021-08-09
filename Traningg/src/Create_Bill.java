
import java.io.*;
import java.util.*;
public class Create_Bill {
	
	void Cal_Bill(float amount)
	{
		float gst, temp = amount;
		if(amount<100)
		{
			System.err.println("No GST:- "+temp);
		}
		
		else if(amount>=100 && amount<200)
		{
			gst= (int)(amount*10/100);
			amount=amount+(amount*10/100);
			System.out.print(" Total Bill: "+(int)amount+" ("+((int)temp+"RS" +" +10%GST " +" i.e "+ gst+ "RS )"));
		}
		
		else if (amount>=200 && amount<500) 
		{
				gst= (int)(amount*20/100);
				amount=(int)amount+(amount*20/100);
				System.out.print("Total Bill: "+(int)amount+" ("+((int)temp+"RS" +" +20%GST " +" i.e " +gst + "RS )"));
    	}
	
		else if(amount>500)
		{
			gst=(int)(amount*30/100);
			amount=(int)amount+(amount*30/100);
			System.out.print(" Total Bill: "+(int)amount+"("+((int)temp+"RS" +" +30%GST  " +" i.e " +gst +"RS )"));
    	}
		
   }


}
class First extends Create_Bill{
	
	 public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
		 	float amount;
			System.out.println("Enter the amount to calculate Bill with gst:");
			amount=sc.nextInt();
			
			Create_Bill obj = new Create_Bill();
			
			obj.Cal_Bill(amount);
			
				
		  }

	
}
