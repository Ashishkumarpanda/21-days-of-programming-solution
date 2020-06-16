public class Software2
{            
    public static void main(String[] args)
{
        for (int i = 0; i <= 5; i++) { 
        int A = 65;
         for (int j = 5; j > i; j--)
        {
            System.out.print(" ");
        }
        for (int k = 0; k <= i; k++)
        {
            System.out.print((char) (A + k) + " ");
        }
        System.out.println();
    }
}
}