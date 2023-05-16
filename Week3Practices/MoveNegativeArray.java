import java.util.*;
class MoveNegativeArray{
  public static void main(String args[]){
    int i,j=0;
    Scanner s=new Scanner(System.in);
    int arr[]=new int[8];
    System.out.println("Enter your values in array");
    for(i=0;i<arr.length;i++){
      arr[i]=s.nextInt();
      
    }
    if(arr[i]<0){
      if(i!=j){
        for(i=0;i<arr.length;i++){
          for(j=i+1;j<arr.length;j++){
            int c=arr[i];
            arr[i]=arr[j];
            arr[j]=c;
          }
        }
      }
    }
    for(i=0;i<arr.length;i++){
      System.out.println(arr[i]);
    }
  }
}