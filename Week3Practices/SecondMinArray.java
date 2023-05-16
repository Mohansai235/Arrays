import java.util.*;
public class SecondMinArray{
  public static void main(String[] args){

    Scanner s=new Scanner(System.in);
    System.out.println("How many values do you want to enter");
    int n=s.nextInt();
    System.out.println("Enter your array values");
    int arr[]=new int[n];

    for(int i=0;i<n;i++){
      arr[i]=s.nextInt();
    }
        int min=arr[0],min2=arr[n-1];

    for(int i=1;i<n;i++){
      if(min>arr[i]){
        min2=min;
        min=arr[i];

      }
      else if(min2>arr[i]){
        min2=arr[i];
      }
      
    }
    System.out.println("Minimum value from the given array:: "+min);
    System.out.println("Second minimum value from the given array :: "+min2);
  }
}