import java.util.*;
class otpGeneration
{
  public static void main(String[] args)
   {
     Scanner sc=new Scanner(System.in);
     System.out.println("how many digit long otp you wanna generate?");
     int n=sc.nextInt();
     int temp=1;
     int otp;
     for(int i=0;i<n-1;i++)
      temp=temp*10;
     
     otp=(int)(temp+(Math.random()*temp));
     System.out.println(otp);
      
   }

}