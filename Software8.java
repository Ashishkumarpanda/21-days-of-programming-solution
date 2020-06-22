import java.util.Arrays;
import java.util.Scanner;


public class Software8 {
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of scores");
        n=sc.nextInt();
        int [] a = new int[n];

        System.out.println("enter scores");
        for ( int i = 0 ; i <n ; i++ ) {
           
            a[i] =sc.nextInt();
        }
        Arrays.sort( a );
        System.out.println("runners up score:"+a[n-2]);
        
    }
}