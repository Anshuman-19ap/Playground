import java.util.Scanner;
class Main{ 
  public static void main(String args[]) 
  { 
    // Type your code here
    Scanner in=new Scanner(System.in);
     int r = in.nextInt();
    int c = in.nextInt();
    int matrix1[][] = new int[r][c];
    int matrix2[][] = new int[r][c];
    for(int i = 0; i < r; i++)
    {
      for(int j = 0; j < c; j++)
      {
        matrix1[i][j] = in.nextInt();
      }
    }
        for(int i = 0; i < r; i++){
      for(int j = 0; j < c; j++){
        matrix2[i][j] = in.nextInt();
      }
    }
        int sub[][]=new int[r][c];
        for(int i = 0; i < r; i++)
        {
           for(int j = 0; j < c; j++)
           {
             sub[i][j]=matrix1[i][j]-matrix2[i][j];
             System.out.print(sub[i][j]+" ");
           }
          System.out.println();
        }
        
  }
}