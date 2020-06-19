import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;
public class Software4 
{public static void main(String[] args) {
   int s=20,e=50;
   for(s=20;s<=e;s++)
   {
       if((s*s-1)%24==0)
       {
           System.out.println(s);
           
       }
       else{
           continue;
       }

   }
  
    
}
}