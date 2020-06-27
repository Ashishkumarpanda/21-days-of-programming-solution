 import java.util.Scanner;
class Software13 { 
static int maxPrimeFactors( int n) 
{ 
	int maxPrime = -1;  
	while (n % 2 == 0) { 
		maxPrime = 2; 
		n >>= 1; 
	} 
	for (int i = 3; i <= Math.sqrt(n); i += 2) { 
		while (n % i == 0) { 
			maxPrime = i; 
			n = n / i; 
		} 
	} 

	if (n > 2) 
		maxPrime = n; 

	return maxPrime; 
} 

public static void main(String[] args) 
{ 
    int n;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    n=sc.nextInt();
    maxPrimeFactors(n);
} 
} 

