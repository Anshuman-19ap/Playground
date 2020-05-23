import java.util.Scanner;
public class Main
{
	public static void main (String[] args)
	{
	    // Type your code here
       Scanner in=new Scanner(System.in);
      int a=in.nextInt();
      int b=in.nextInt();
      int c=in.nextInt();
      int d;
      d=g(a,b);
      System.out.println(g(d,c));
    }

   public static int g(int m,int n)
      {
        int min;
        int h;
        if(m>n)
          min=n;
        else
          min=m;
     while(min>=1)
     {
        if(m%min==0 && n%min==0)
        {
          h=min;
          break;
        }
        else
          min=min-1;
     }
      return(min);
   }
}
