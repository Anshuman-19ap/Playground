import java.util.Scanner;
class Main {
	public static void main (String[] args)
    {
	     // Type your code here
      Scanner in=new Scanner(System.in);
        int n=in.nextInt();
      int c=1;
      for(int i=1; c<=n;i+=2)
      {
        System.out.println(i);
        c=c+1;
      }
	}
}