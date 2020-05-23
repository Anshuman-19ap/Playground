import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in=new Scanner(System.in);
      int as=in.nextInt();
      int arr[]=new int[as];
      int i;
      for(i=0;i<as;i++)
        arr[i]=in.nextInt();
      int b=1; int s=0;
    if(as==6)
      System.out.println("Not a Perfect Batch");
    else
     System.out.println("Perfect Batch");
  
    
      
  }
}