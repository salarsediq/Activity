package activity;
import java.util.*;
public class Activityy2 {
	public static void main(String[]args) {
		  Scanner sc =new Scanner(System.in);
		 
		   
	      int[] arrayy = new int [5];
		  System.out.println("Enter the numbers");
		        for (int i=0;i<arrayy.length;i++) {
		        	arrayy[i]=sc.nextInt();
		        }
		        for(int i=0; i<arrayy.length; i++) {
		        	System.out.print(arrayy[i]+" ");
		        }
		 
		        
		        
		        int[] aarray = new int [3];
		  System.out.println("Enter the numbers");
	        for (int i=0;i<aarray.length;i++) {
	        	aarray[i]=sc.nextInt();
	        }
	        System.out.println("The sum of the array is "+arraySum(aarray));
		
		  
		  
		 
	        
	        int[] array = new int [3];
		  System.out.println("Enter the numbers");
	        for (int i=0;i<array.length;i++) {
	        	array[i]=sc.nextInt();
	        }
	        squaredArray(array);
		}
	
public static int[] squaredArray (int[] Array) {
	int [] Array2 = new int[3];
			for (int i=0; i<Array2.length; i++) {
		     
				Array2[i]=Array[i]*Array[i] ;}
			for(int i=0; i<Array2.length; i++) {
	        	System.out.print(Array2[i]+" ");}
	return Array2 ;
		  }
		  
		  
		  
		 public static int arraySum (int[] Array) {
	int sum = 0;
	for (int i=0; i<Array.length; i++)
		sum += Array[i];
	return sum;
}
		 }
		  
		  
		  
		
		


		  
		  
		  

























