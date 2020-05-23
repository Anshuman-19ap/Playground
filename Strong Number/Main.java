import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
       Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int f=1;
      int i;
      int s=0;
      int p=n;
      for(int j=n;j!=0;j=j/=10)
      {
        int d=j%10;
      for(i=1;i<=d;i++)
          {
            f=f*i;
          }
        s=s+f;
        f=1;
      }
      if(s==p)
        System.out.println("Yes");
      else
        System.out.println("No");
      
      
	}
}