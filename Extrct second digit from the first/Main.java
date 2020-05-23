import java.util.Scanner;
class Main {
	public static void main (String[] args)
    {
	    // Type your code here
      Scanner in =new Scanner(System.in);
      int n=in.nextInt();
      int s=0;
      int p=n;
      while(n!=0)
      {
      s=s*10 +n%10;
        n=n/10;
      }
      int x= (s%100)/10;
      System.out.println(x);
    }
}