import java.util.*;
public class PloyMor {
           
  public int[] even(int[] arr){
    
    int[] evenArr=new int[arr.length];
    int j=0;
    for(int i=0;i<arr.length;i++){
      if(arr[i]%2==0){
        evenArr[j]=arr[i];
        j++;
      }
    }
    return evenArr;
  }
public int[] odd(int[] arr){
    int[] evenArr=new int[arr.length];
    int j=0;
    for(int i=0;i<arr.length;i++){
      if(arr[i]%2!=0){
        evenArr[j]=arr[i];
        j++;
      }
    }
    return evenArr;
  }
  
  
  public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
    System.out.println("Eneter how number you want to store");
    int n=sc.nextInt();
    int[] totalArray=new int[n];
    for(int i=0;i<totalArray.length;i++){
      System.out.println("Eneter the elemet "+(i+1));
      totalArray[i]=sc.nextInt();
    }
    PloyMor obj=new PloyMor();
    int[] evenArray=obj.even(totalArray);
    System.out.println(Arrays.toString(evenArray));
   int[] oddArray=obj.odd(totalArray);
    System.out.println(Arrays.toString(oddArray));
  }
}
