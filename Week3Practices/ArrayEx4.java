import java.util.Scanner;
public class ArrayEx4
{
  int j;
public void removeFirstElement(int[] arr1){
    int[] newArr=new int[4];
    for(j=1;j<newArr.length;j++){
      newArr[(j-1)]=arr1[j];
    }
    newArr[(j-1)]=arr1[j];
    for(int i=0;i<newArr.length;i++){
      System.out.println(newArr[i]);
    }
}
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int[] arr=new int[5];
    for(int j=0;j<arr.length;j++){
      System.out.println("Enter number "+ (j+1));
      arr[j]=sc.nextInt();
    }
    ArrayEx4 obj=new ArrayEx4();
    obj.removeFirstElement(arr);
  }
}