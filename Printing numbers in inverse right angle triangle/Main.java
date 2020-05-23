import java.util.Scanner;
class Main{
	public static void main (String[] args)
    {
	    // Type your code here
       Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int i,j;
      int num=n;
      for(i=1;i<=n;i++)
      {
        for(j=num;j>=1;j--)
        {
        System.out.print(j);
        }
        num=num-1;
        System.out.println();
	}
    }
}