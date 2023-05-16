import java.util.*;
public class MidValueArray{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter How many values do you want");
    int n=s.nextInt();
    int arr[]=new int[n];
    System.out.println("Enter the values");
    for(int i=0;i<n;i++){
      arr[i]=s.nextInt();
    }
      if(n%2!=0){
        System.out.println("Mid Value of an given array::"+arr[n/2]);
      }
    else {
      System.out.println("Mid value of given array ::"+arr[(n/2)-1]+" & "+arr[n/2]);
    }
  }
}