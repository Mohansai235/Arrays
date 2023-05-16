import java.util.*;
public class SearchValueArray{
  public static void main(String[] args){
    int count=0;
    Scanner s=new Scanner(System.in);
    System.out.println("How many values do you want to enter");
    int n=s.nextInt();
    System.out.println("Enter you array values");
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=s.nextInt();
    }
    System.out.println("Enter the value that you want to search");
    int search=s.nextInt();
    for(int i=0;i<n;i++){
      if(arr[i]==search){
        System.out.println("Elemnt "+search+" is found in "+i+" index position");
        count++;
      }
    }
    if(count==0){
        System.out.println("Element "+search+" is not found in the given array");
      }
  }
}