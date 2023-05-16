import java.util.*;
public class ArrayEx5{
  public void remove(int arr[]){
    int newArr[]=new int[2];
    for(int i=1;i<=newArr.length;i++){
      newArr[i-1]=arr[i];
      
    }
    System.out.println("After removal of the first value your values are:");
    for(int i=0;i<newArr.length;i++){
      System.out.println(newArr[i]);
    }
  }
  public static void main(String args[]){
  
    Scanner s=new Scanner(System.in);
    int arr[]=new int[3];
    for(int i=0;i<arr.length;i++){
      System.out.println("Enter your value "+(i+1));
      arr[i]=s.nextInt();
    }
    ArrayEx5 obj=new ArrayEx5();
    obj.remove(arr);
    
  }
}