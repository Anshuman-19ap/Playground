import java.util.Scanner;
class Main{
    public static void main(String args[]) 
    {
       // Type your code here
       Scanner in=new Scanner(System.in);
    int as=in.nextInt();
      int i;
    int arr[]= new int[as];
      for(i=0;i<as;i++)
        arr[i]=in.nextInt();
      int j=0;
     int a[]=new int[as];
      for(i=0;i<as;i++)
        if(arr[i]!=0)
        {
          a[j]=arr[i];
          j=j+1;
        }
     for(i=0;i<as;i++)
     {
       if(arr[i]==0)
       {
         a[j]=arr[i];
         j++;
       }
     }
      for(i=0;i<as;i++)
        System.out.print(a[i]+" ");
        
          
    }
}