import java.util.Scanner; 

class Software12 { 
	static int reverse(int m) 
	{ 
		int rev = 0; 
		while (m != 0) { 
			rev = (rev * 10) + (m % 10); 
			m /= 10; 
		} 
		return rev; 
	} 
     static void checkZero(int m) 
	{ 
		m = reverse(m); 
		int Odd = 0,Even = 0, c = 1; 

		while (m != 0) { 
			if (c % 2 == 0) 
				Even += m % 10; 
			else
				Odd += m % 10; 
			m /= 10; 
			c++; 
		} 
        
        if(Odd-Even==0)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("No");
        }
    } 
     
	public static void main(String args[]) 
	{ 
        long p;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        p=sc.nextLong();

        int m=(int)p;
        checkZero(m);

		 
	} 
} 

