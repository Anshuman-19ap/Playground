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
      int m=arr[0];
      for(i=0;i<as;i++)
        if(arr[i]>m)
          m=arr[i];
      System.out.println(m);
    }
}