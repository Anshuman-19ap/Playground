import java.util.Scanner;
class Main { 
	public static void main(String[] args)
    {
  		// Type your code here
      Scanner in = new Scanner(System.in);
		int n = in.nextInt();
      int p=0;
		for(int i= 1 ;i<= n; i++) 
        {
          for(int j=1;j<=i;j++)
          {
            
            p=p+1;
            if(p%2==0)
              System.out.print("#");
            else
              System.out.print("*");
          }
			System.out.println();
        }
        }
    }
