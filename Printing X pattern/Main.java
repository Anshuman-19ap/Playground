import java.util.Scanner;
class Main{
	public static void main (String[] args)
    {
	   // Type your code here
       Scanner in =new Scanner(System.in);
      int n=in.nextInt();
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
if(i==j || (i+j)==(n-1))
System.out.print("*");
else
System.out.print(" ");
}
System.out.println();
}
}	
}
