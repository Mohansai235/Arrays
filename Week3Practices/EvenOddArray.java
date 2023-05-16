import java.util.Scanner;
public class EvenOddArray{
  public static void main(String[] args){
    int count=0,count1=0;
    Scanner s=new Scanner(System.in);
    System.out.println("How many values do you want to enter");
    int n=s.nextInt();
    System.out.println("Enter you array values");
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=s.nextInt();
    }
    for(int i=0;i<n;i++){
      if(arr[i]%2==0){
        count=count+1;
      }
      else if(arr[i]%2!=0){
        count1=count1+1;
        
      }
    }
     System.out.println("No.of Even numbers: "+count);
     System.out.println("No.of Odd numbers: "+count1);

  }
}