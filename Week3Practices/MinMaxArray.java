import java.util.*;
public class MinMaxArray{
  public static void main(String args[]){
    int i,max=0;
    Scanner s=new Scanner(System.in);
    int arr[]=new int[4];

    System.out.println("Enter your array values");
    for(i=0;i<arr.length;i++){
      arr[i]=s.nextInt();
    }
    int min=arr[0];
    for(i=0;i<arr.length;i++){
    if(arr[i]>max)
    {
      max=arr[i];
    }
    }
    System.out.println("Maximum value in array is: "+max);
    for(i=0;i<arr.length;i++){
      if(arr[i]<min)
      {
        min=arr[i];
      }
    }
    System.out.println("Minimum value in array is: "+min);
  }
}