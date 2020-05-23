import java.util.Scanner;
class Main {
	public static void main (String[] args)
    {
	    // Type your code here
      Scanner in =new Scanner(System.in);
      int n=in.nextInt();
      int p=n;
      int c=0;
      while(n>=10)
      {
        n=n/10;
      }
      int s=p%10 + n;
      System.out.println(s);
      
	}
}