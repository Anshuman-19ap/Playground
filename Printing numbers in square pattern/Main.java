import java.util.Scanner;
class Main{
	public static void main (String[] args)
    {
	    // Type your code here
      Scanner in = new Scanner(System.in);
		int n = in.nextInt();
      int p=1;
		for(int i= 1 ; i<=n ;i++) 
        {
          for(int j=1;j<=n;j++)
          {
            System.out.print(p);
          }
			System.out.println();
          p=p+1;
        }
	}
}