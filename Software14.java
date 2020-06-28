import java.lang.String;
import java.util.Scanner;
public class Software14{
    public static void main(String[] args) {
        String c,a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("The original string is");
        c=sc.nextLine();
        System.out.println("The substring you want to replace");
        a=sc.nextLine();
        System.out.println("The string you want to use instead ");
        b=sc.nextLine();
        String d=c.replaceAll(a,b);
        System.out.println(d);
        
        

    }
}
