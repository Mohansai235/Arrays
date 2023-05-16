import java.util.*;
public class TwoDimensionalArray{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    
    System.out.println("Enter how many values do you want to enter:");
    int n=s.nextInt();
    int m=s.nextInt();
    int arr[][]=new int[n][m];
    System.out.println("Enter Your Array values");
    for(int i=0;i<n;i++){
      for(int j=0;j<m;j++){
        arr[i][j]=s.nextInt();
      }
    }
    System.out.println("Your 2-Dimensional Array is");
    for(int i=0;i<n;i++){
      for(int j=0;j<m;j++){
        System.out.print(arr[i][j]+" ");
      }
          System.out.println();

    }
  }
}