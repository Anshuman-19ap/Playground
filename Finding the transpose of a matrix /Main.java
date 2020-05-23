import java.util.Scanner;
class Main{
  public static void main(String args[])
  {
    // Type your code here
    Scanner in=new Scanner(System.in);
     int r = in.nextInt();
    int c = in.nextInt();
    int matrix1[][] = new int[r][c];
    for(int i = 0; i < r; i++)
    {
      for(int j = 0; j < c; j++)
      {
        matrix1[i][j] = in.nextInt();
      }
    }
        int tra[][]=new int[c][r];
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
        tra[j][i]=matrix1[i][j];
        System.out.print(tra[j][i]+" ");
      }
      System.out.println();
    }
  }
}