import java.util.*;
public class StoreEvenOddArray{
  public static void main(String args[]){
    int i;
    
    Scanner s=new Scanner(System.in);
    System.out.println("Enter n values");
    int n=s.nextInt();
    int arr[]=new int[n];
    int earr[]=new int[n];
    int oarr[]=new int[n];
    System.out.println("Enter your array values");
    for(i=0;i<n;i++){
      arr[i]=s.nextInt();
    }
    int e=0,od=0;
    for(i=0;i<n;i++){
      if(arr[i]%2==0){
        earr[e]=arr[i];
        e++;
      }
      else{
        oarr[od]=arr[i];
        od++;
      }
    }
    System.out.println("Even numbers in array are "+earr[e]);
    System.out.println("Odd numbers in array are "+oarr[od]);
  }
}