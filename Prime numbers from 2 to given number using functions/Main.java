import java.util.Scanner;
class Main{
	public static void main (String[] args)
    {
	    // Type your code here
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
      int i,j;
      int c=0;
      for(i=2;i<=n;i++)
      {
        for(j=1;j<=i;j++)
        {
          if(i%j==0)
            c++;
        }
        if(c==2)
        System.out.println(i);
        c=0;
      }
    }
          
	}
