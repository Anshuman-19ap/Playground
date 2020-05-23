import java.util.Scanner;
class Main{
    public static void main(String args[]) 
    {
       // Type your code here
      Scanner in=new Scanner(System.in);
      int as=in.nextInt();
      int i;
      int c=1;
      int arr[]=new int[as];
      for(i=0;i<as;i++)
        arr[i]=in.nextInt();
      int p,q,r;
      for(p=0;p<as;p++)
      {
        for(q=p+1;q<as;q++)
        {
          for(r=q+1;r<as;r++)
          {
            System.out.print("("+arr[p]+","+" "+arr[q]+","+" "+arr[r]+")"+" ");
          }
        }
        if(c<=4)
        {
        System.out.println();
          c++;
        }
 }

    }
}
