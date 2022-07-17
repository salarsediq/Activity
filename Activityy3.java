import java.util.*;
public class Activityy3{
	public static void main (String[]args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("How many elements do you want?");
		int elementNum = sc.nextInt();
	int[] Array = new int [elementNum];
	System.out.println("Enter the nubmbers");
	for (int i=0 ; i<Array.length;i++) {
		Array[i]=sc.nextInt();
		}System.out.print("{");
	for (int i=0 ; i<Array.length;i++) {
		System.out.print(Array[i]);
		if(i<Array.length-1) {
			System.out.print(",");
		}
		}System.out.println("}");
	System.out.println("the minmum of the array is : "+minimum(Array));
		System.out.println("what is the number that you want to check in the array?");
		int checkNum = sc.nextInt();
		System.out.println(searchForItemInArray(Array,checkNum));
	}
	public static int minimum (int[] min) {
		int minimum =0;
		for (int i=0; i<min.length-1;i++) {
			minimum = Math.min(min[i],min [i+1]);
			min[i+1]=minimum;
		}
		return minimum;
	}
	
	public static int searchForItemInArray(int[] array,int num) {
		int checking = -1;
		for(int i=0; i<array.length;i++) {
			if (array[i] == num) {
				checking = i;
		}
		}	
		return checking;
	
}
}




















































































