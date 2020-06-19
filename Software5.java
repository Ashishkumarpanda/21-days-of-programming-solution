import java.util.Scanner;
public class Software5 {
    public static void main(String args[])
    {
      String s;
      char i;
      
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the binary value");
      s=sc.nextLine();
      int d=Integer.parseInt(s,2);
      i=(char)d;
      System.out.println("the character will be:"+i);
       }
  }
