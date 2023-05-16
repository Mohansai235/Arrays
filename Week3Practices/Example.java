import java.util.*;
public class Example{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter n value");
    int n=s.nextInt();
    int arr[]=new int[n];
    int max=0,max2=0,ecount=0,ocount=0,sum=0,avg=0,esum=0,osum=0;
    System.out.println("Enter your "+n+" values");
    for(int i=0;i<n;i++){
      arr[i]=s.nextInt();
      if(arr[i]>max){
        max2=max;
        max=arr[i];
      }
      else if(max2>arr[i]){
        max2=arr[i];
      }
      if(arr[i]%2==0){
        ecount++;
        esum=arr[i]+esum;
      }
      else{
        ocount++;
        osum=arr[i]+osum;
      }
      sum=arr[i]+sum;
      avg=sum/n;
    }
    int min=arr[0],min2=arr[n-1];      
    for(int i=1;i<n;i++){
      if(arr[i]<min){
        min2=min;
        min=arr[i];
      }
      else if(arr[i]<min2){
        min2=arr[i];
      }
    }
    System.out.println("Maximum value in given array: "+max);
    System.out.println("Second Maximum value in given array: "+max2);
    System.out.println("Even numbers in given array: "+ecount);
    System.out.println("Odd numbers in given array: "+ocount);
    System.out.println("Sum of numbers in given array: "+sum);
    System.out.println("Average of numbers in given array: "+avg);
    System.out.println("Minimum value in given array: "+min);
    System.out.println("Second Minimum value in given array: "+min2);
    System.out.println("Sum of even numbers in given array: "+esum);
    System.out.println("Sum of Odd numbers in given array: "+osum);
  }
}