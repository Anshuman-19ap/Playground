import java.util.Scanner;
class Main
{
	public static int square(int n)
   {
      int s;
      s=n*n;
      return s;
   }
  public static void main (String[] args)
    {
	 // Type your code here 
    Scanner in=new Scanner(System.in);
    int m=in.nextInt();
    Main ob=new Main();
    System.out.println(ob.square(m));
	} 
}