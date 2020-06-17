import java.util.Scanner;
public class Software3 {
    public static void main(final String args[])
    {
        int a,c,n,i,result;
        float d;
        final Scanner sc=new Scanner(System.in);
        System.out.println("Enter starting number");
        a=sc.nextInt();
        System.out.println("Enter number of items");
        n=sc.nextInt();
        System.out.println("Enter common ratio");
        c=sc.nextInt();
        d=a*(1-(int)Math.pow(c, n))/(1-c);
        System.out.println("Sum of Gp:"+d);

        for(i=0;i<n;i++)
        {
            result= a * (int)Math.pow(c, i); 
            System.out.println(" "+result+" ");
        }
    
      
        
       
       
    }
    
}