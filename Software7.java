import java.util.Scanner;
public class Software7 {
    public static void main(String args) 
    {
       
        String s, rev=" ";
        int l,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        s=sc.nextLine();
        l=s.length();
        for(i=l-1;i>0;i--)
        {
            rev=rev+s.charAt(i);
        }
        if(s.equals(rev))
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("I_LOVE_YOU");
        }

    }
    
}