import java.util.Scanner;
public class DynamicFrequency{
  public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    System.out.println("How many values you want to enter");
    int n=s.nextInt();
    System.out.println("Enter your Array values");
    int[] arr=new int[n];
    for(int i=0;i<arr.length;i++){
      arr[i]=s.nextInt();
    }
    int[] visted=new int[n]; 
    int count=1;
    for(int i=0;i<arr.length;i++){
      count=1;
      for(int j=i+1;j<arr.length;j++){
        if(arr[i]==arr[j]){
          count++;  
          visted[j]=-1;
        }
      }
      if(visted[i]!=-1){
        visted[i]=count;
      }
    }
    System.out.println("=======================");
    for(int i=0;i<arr.length;i++){
      if(visted[i]!=-1){
        System.out.println(arr[i]+" Frequency "+visted[i]);
      }
    }
  }
}