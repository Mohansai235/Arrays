import java.util.Scanner;
public class RemoveDuplicates{
  public static int removeduplicates(){
    int arr[]=new int[6];
    int j=0;
    Scanner s=new Scanner(System.in);
        int n=arr.length;

      for(int i=0;i<n;i++){
        arr[i]=s.nextInt();
      
      }
    for(int i=0;i<n;i++){
      if(i<n-1 && arr[i]==arr[i+1]){
        continue;
      }
      arr[j++]=arr[i];
    }
    return j;
  }
  public static void main(String args[]){
    int arr[]=new int[6];

    System.out.println("Removing duplicates from sorted array");
    for(int i=0;i<arr.length;i++){
      System.out.println(arr[i]);
    }
  }
}
  