


import java.util.*;
public class Right_Suffle {


	 void Array_Shufle() {
		 int arr[] = {1,2,3,4,5};
		 System.out.print("Enter the Shuffling Number -:");
		 Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		 System.out.print("Given Array -:");
		 for(int i=0; i<arr.length; i++)
			 System.out.print(arr[i]+" ");
		 System.out.println();
		 for(int i=0; i<n; i++)
		 {
			 int temp = arr[arr.length-1];
			 for(int j= arr.length-1; j>0; j--)
			 {
				 arr[j] = arr[j-1];
			 }
			 arr[0] = temp;
		 }
		 System.out.print("After Suffle :");
		 for(int i=0; i<arr.length; i++)
			 System.out.print(arr[i]+" ");
	 }
	
	public static void main(String[] args) {
				
		Right_Suffle Obj = new Right_Suffle();
		Obj.Array_Shufle();
		
		
	}

}
