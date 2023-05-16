import java.util.*;
public class Arrayrml{
  public static void main(String args[]){
  
    Scanner s=new Scanner(System.in);
    int arr[]=new int[3];
    for(int i=0;i<arr.length;i++){
      System.out.println("Enter your value "+(i+1));
      arr[i]=s.nextInt();
    }
    int newArr[]=new int[2];
    for(int i=0;i<newArr.length;i++){
      newArr[i]=arr[i];
      
    }
    System.out.println("After removal of the first value your values are:");
    for(int i=0;i<newArr.length;i++){
      System.out.println(newArr[i]);
    }
  }
}