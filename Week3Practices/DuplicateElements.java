import java.util.Scanner;
public class DuplicateElements{
  public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter n value");
    int n=s.nextInt();
    int arr[]=new int[n];
    System.out.println("Enter Your "+n+" values");
    for(int i=0;i<n;i++){
      arr[i]=s.nextInt();
    }
    System.out.println("Duplicate values in array ");
    int count=0;
    for(int i=0;i<n;i++){
      for(int j=i+1;j<n;j++){
        if(arr[i]==arr[j]){
          System.out.println(arr[i]);
          count++;
        }
      }
    }
    System.out.println("count of duplicate eleemnts are: "+count);
  }
}