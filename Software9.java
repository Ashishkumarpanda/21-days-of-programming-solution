import java.util.Scanner;
public class Software9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,sum=0,i;
        System.out.println("Enter a number");
        n=sc.nextInt();
        for(i=1;i<n;i++)
        {
            if(n%i==0)
            {
                if(i%2!=0)
                {
                    sum=sum+i;
                }
            }

        }
        System.out.println("output="+sum);


        
    }
    
}