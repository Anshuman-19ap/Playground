import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   //Type your code here
    Scanner in = new Scanner(System.in);
		int n = in.nextInt();
        int c=0;
		for(int num = 1 ; num <= n ; num++) 
        {
          if(c==3)
          {
            System.out.print(",");
            c=0;
          }
          c=c+1;
          
		System.out.print(num);
        }
  }
}