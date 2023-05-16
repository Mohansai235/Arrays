import java.util.Scanner;
public class PrimeArray{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("How many values do you want enter");
    int n=s.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<arr.length;i++){
      arr[i]=s.nextInt();
    }
    for(int i=0;i<n;i++){
      for(int j=0;j<arr[i];j++){
        if(arr[i]%j==0){
          
        }
      }
    }
  }
}