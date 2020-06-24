import java.util.Arrays; 
import java.util.Scanner;
 public class Software10 {
 public static void main(String[] args)
 {
     Scanner sc=new Scanner(System.in);
     int n,i;
     System.out.println("Enter number of elements in array");
     n=sc.nextInt();
     int a[]=new int[n];
     System.out.println("Enter elements");
     for(i=0;i<n;i++)
     {
         a[i]=sc.nextInt();

     }
	int temp= a[0];
	a[0] = a[a.length-1];
	a[a.length-1] = temp;
	System.out.println("output="+Arrays.toString(a));  
 }
}
