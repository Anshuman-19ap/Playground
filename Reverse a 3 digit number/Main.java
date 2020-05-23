import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    int n;
    Scanner in =new Scanner (System.in);
   n= in.nextInt();
    int s=0;
    for(int i=n ;i!=0;i=i/10)
    {
      s=s*10+i%10;
      
   }
    System.out.println(s);
}
}