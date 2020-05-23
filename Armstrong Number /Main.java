import java.util.Scanner;
class Main{
	public static void main (String[] args)
    {
	   // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int p=n;
      int s=0;
      int c=0;
      for(int i=n;i!=0;i/=10)
      {
        c=c+1;
      }
      for(int i=n;i!=0;i/=10)
      {
        s=s+(i%10)*(i%10)*(i%10);
      }
      if(s==p)
      System.out.println("Armstrong Number");
      if(s!=p)
       System.out.println("Not a Armstrong Number");
	}
}