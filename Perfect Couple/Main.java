import java.util.Scanner;
class Main{
    public static void main(String args[]) 
    {
      // Type your code here
      Scanner in=new Scanner(System.in);
      int as=in.nextInt();
      int i;
      int arr[]=new int[as];
      for(i=0;i<as;i++)
        arr[i]=in.nextInt();
      int v=in.nextInt();
      int j,k;
      for(j=0;j<as;j++)
      {
        for(k=j+1;k<as;k++)
        {
          if(arr[j]+arr[k]==v)
            System.out.println(arr[j]+","+" "+arr[k]);
        }
      }
    }
}