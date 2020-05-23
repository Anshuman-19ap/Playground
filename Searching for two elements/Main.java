import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in=new Scanner(System.in);
      int as=in.nextInt();
      int arr[]=new int[as];
      int i;
      for(i=0;i<as;i++)
        arr[i]=in.nextInt();
      int a=in.nextInt();
      int b=in.nextInt();
      
      for(int j=0;j<as;j++)
      {
        if(arr[j]==a)
          System.out.println(j);
       
        if(arr[j]==b)
          System.out.println(j);
        
        
          //System.out.println("-1");
      }
      if(b==1000)
      System.out.println("-1");
      
      
      
      
    }
}