import java.util.Scanner;
public class StorePosNegPriArray{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int arr[]= {10,20,-32,-4,3,11,13,45};
    int pos=0,neg=0,pri=0,factor=0;
    int posArr[]=new int[arr.length];  
    int negArr[]=new int[arr.length];
    int priArr[]=new int[arr.length];
    for(int i=0;i<arr.length;i++) {
      if(arr[i]>0) {
        posArr[pos]=arr[i];
        pos++;
      }
      else{
        negArr[neg]=arr[i];
        neg++;
      }
      for(int j=1;j<=arr[i]/2;j++){
        if(arr[i]%j==0){
          factor++;
        }
      }
      if(factor==1){
        priArr[pri]=arr[i];
        pri++;
      }
      factor=0;
    }
    System.out.print("positive values: ");
    for(int i=0;i<pos;i++) {
      System.out.print(posArr[i]+" ");
    }
    System.out.println();
    System.out.print("Negative values: ");      
    for(int i=0;i<neg;i++) {
      System.out.print(negArr[i]+" ");
    }
    System.out.println();
    System.out.print("Prime numbers: ");
    for(int i=0;i<pri;i++){
      System.out.print(priArr[i]+" ");
    }
    System.out.println();  
  }
}
                   
    
