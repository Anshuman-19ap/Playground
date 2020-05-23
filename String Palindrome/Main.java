import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner in= new Scanner(System.in);
    String str1 = in.nextLine();
      String S="";
     int l=str1.length();
      int i;
      for(i=l-1;i>=0;i--)
      {
        S=S+str1.charAt(i);
      }
      if(S.equals(str1)==true)
        System.out.println("Yes");
      else
        System.out.println("No");
     

    } 
}