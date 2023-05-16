import java.util.*;
public class SecondMaxArray{
  public static void main(String[] args){
    int max=0,max2=0;
    Scanner s=new Scanner(System.in);
    System.out.println("How many values do you want to enter");
    int n=s.nextInt();
    System.out.println("Enter your array values");
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=s.nextInt();
      if(arr[i]>max){
        max=arr[i];
        max2=max;
      }
      else if(max2>arr[i]){
        max2=arr[i];
      }
      
    }
    System.out.println("Maximum value from the given array:: "+max);
    System.out.println("Second maximum value from the given array :: "+max2);
  }
}