import java.util.Scanner;
class Main {
	public static void main (String[] args) 
    {
		Scanner in = new Scanner(System.in);
		// Type your code here
      int y =in.nextInt();
      if(y%4==0)
      {
        if(y%100==0)
        {
          if(y%400==0)
           System.out.println("Leap year");
        
      
      else
        System.out.println("Non Leap year");
      }
      }
       else
        System.out.println("Non Leap year");
      
      
    }
}