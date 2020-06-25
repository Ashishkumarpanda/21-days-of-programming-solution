import java.util.Scanner;
public class Software11{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int hh,mm,ss,am;
        
        System.out.println("Enter hours");
        hh=sc.nextInt();
        System.out.println("Enter minutes");
        mm=sc.nextInt();
        System.out.println("Enter seconds");
        ss=sc.nextInt();
        System.out.println("Enter 1 if AM or 0 if PM");
        am=sc.nextInt();
        if(hh>11 || mm>59 || ss>59)
        {
            System.out.println("invalid for 12 hr format");
        }
        else
        {
            if(am==1) //for AM
            {
               System.out.println("input time in 12 hrs ="+hh+":"+mm+":"+ss  + "AM" );
               System.out.println("outpur time in 24 hrs ="+hh+":"+mm+":"+ss  + "AM" );

            }
            else{   //for pm
                    System.out.println("input time in 12 hrs ="+hh+":"+mm+":"+ss  + "PM" );
                    System.out.println("output time in 24 hrs ="+(hh+12)+":"+mm+":"+ss  + "PM" );
                

            }
     

        }
       
        

     





        
    }
}