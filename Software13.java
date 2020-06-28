import java.util.Scanner;
public class Software13 { 
	public static void main(String[] args) {
		int n,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		n=sc.nextInt();
		for(i=n;i>1;i--)
		{
			if(n%i==0)
			{
				if(i==3)
				{
					System.out.println("largest prime factor="+i);
					
				}
				else if((i*i-1)%24==0)
				{
					System.out.println("largest prime factor="+i);
					break;
				}
				
				
				
				
			
		}
			
				
				


		}

	


		
	}
}


