import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner in=new Scanner(System.in);
    int m=in.nextInt();
    System.out.println(fact(m));
  }
   static int fact(int n)
    {
      int f=1;
      for(int i=1;i<=n;i++)
        f=f*i;
      return f;
    }
  
}