import java.util.Scanner;
class Main
{

	public static void main (String[] args)
    {
	    // Type your code here
      Scanner in=new Scanner(System.in);
      Main ob=new Main();
      int m=in.nextInt();
      int i=1,s=0;
      while(i<=m)
      {
        s=s+i;
        i=i+1;
      }
      System.out.println(s);
        
        
        
	}
}