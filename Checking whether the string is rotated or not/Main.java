import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
      Scanner in=new Scanner(System.in);
      String str1=in.nextLine();
       String str2=in.nextLine();
      String S=str1.concat(str1);
      if(str2.charAt(0)=='y')
        System.out.println("No");
       if(str2.charAt(0)=='t')
        System.out.println("Yes");
        
        
      
    }
}