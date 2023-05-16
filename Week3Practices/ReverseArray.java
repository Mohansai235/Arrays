import java.util.*;
public class ReverseArray{
  public static void main(String args[]){
    int i;
    Scanner s=new Scanner(System.in);
    int arr[]=new int[4];
    System.out.println("Enter your values ");
    for(i=0;i<arr.length;i++){
      arr[i]=s.nextInt();
    }
    System.out.println("Array after Reverse:");
    for(i=3;i<arr.length;i--){
      System.out.println(arr[i]);
    }    
  }
}