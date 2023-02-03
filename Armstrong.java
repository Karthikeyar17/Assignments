
package Week_1;
import java.util.Scanner;

public class Armstrong {

static void arms(int num)
{
	  int d;
	  int sum=0;
	  int org=num;
	  
		 while(num!=0)
		 {
			d=num%10;
			sum=sum+(d*d*d);
			 num=num/10;
		 }
		 System.out.println("print sum"+sum);
		 
	     if(sum==org)
	     {
		     
		     System.out.println("It is armstrong number");
		
	     }
	     else {
		      System.out.println("It is  not armstrong number");
		
   }
	     
}



public static void main(String[] args) {
Scanner sc=new Scanner(System.in);

System.out.println("Enter number");
int num =sc.nextInt();
arms(num);
}
}