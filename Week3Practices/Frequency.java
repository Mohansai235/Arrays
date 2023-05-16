public class Frequency{
  public static void main(String[] args){
    int[] arr={1,2,2,1,3,4,5};
    int[] visted=new int[7]; //i want to store the count and also want to store visted status
    int count=1;
    for(int i=0;i<arr.length;i++){
      count=1;
      for(int j=i+1;j<arr.length;j++){
        if(arr[i]==arr[j]){
          count++;   //1+1
          visted[j]=-1;   //[2,2,-1,-1,1,1,1] visted arra
        }                 // 0 1 2   3 4 5 6
      }
      if(visted[i]!=-1){
        visted[i]=count;
      }
    }
    for(int i=0;i<arr.length;i++){
      if(visted[i]!=-1){
      System.out.println(arr[i]+" Frequency "+visted[i]);
      }
    }
  }
}