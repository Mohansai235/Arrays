//descending order & ascending order
import java.util.Scanner;
public class SwapArray{
  public static void main(String args[]){
    int i,j,c;
    Scanner s=new Scanner(System.in);
    int arr[]=new int[4];
    System.out.println("Enter your values in array");
    for(i=0;i<arr.length;i++){
      arr[i]=s.nextInt();
    }
    for(i=0;i<arr.length;i++){
      for(j=i+1;j<arr.length;j++){
        if(arr[i]<arr[j]){
          c=arr[i];
          arr[i]=arr[j];
          arr[j]=c;
        }
      }
    }
    
    System.out.println("Descending order");
    for(i=0;i<arr.length;i++){
      System.out.println(arr[i]);
    }
  }
}
    

