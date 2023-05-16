import java.util.Scanner;
public class MenuDrivenArray{
  Scanner s=new Scanner(System.in);
  int arr[]=new int[100];
  int numberOfElements=0;
  public void insertLast() {
    System.out.println("Enter new value");
    int value=s.nextInt();
    arr[numberOfElements]=value;
    numberOfElements++;    
    }
  public void insertFirst() {
      System.out.println("Enter new value");
      int value=s.nextInt();
      if(numberOfElements==0) {
        arr[0]=value;
        numberOfElements++;
      }
      else {
        for(int i=numberOfElements;i>0;i--) {
          arr[i]=arr[i-1];
        }
        arr[0]=value;
        numberOfElements++;
        }
    }
  public void display() {
      System.out.println("Your Array");
      System.out.println("===================");
      for(int i=0;i<numberOfElements;i++) {
      System.out.print(arr[i]+"  ");
      }
      System.out.println();
      System.out.println("===================");
    }
  public void insertSpecific() {
    System.out.println("Enter new value");
    int value=s.nextInt();
    System.out.println("enter index value");
    int index=s.nextInt();
    if(index<=numberOfElements) {
      for(int i=numberOfElements;i>index;i--) {
        arr[i]=arr[i-1];
      }
      arr[index]=value;
      numberOfElements++;
    }
    else {
      System.out.println("Invalid index");
    }    
  }
  public void rmFirst(){
    if(numberOfElements==0){
      System.out.println("No Values in Array");
    }
    else{
    for(int i=0;i<numberOfElements;i++){
              arr[i]=arr[i+1];
      }
      numberOfElements--;
    }
  }
  public void rmLast(){
    if(numberOfElements==0){
      System.out.println("No values in array");
    }
    else{
      for(int i=0;i>numberOfElements;i--){
        arr[i]=arr[i+1];
      }
      
      }
  }
  public void rmfirstsearch(){
    System.out.println("Enter the search value");
    int search=s.nextInt();
    int count=0;
    for(int i=numberOfElements;i>0;i--){
      if(arr[i]==search){
        arr[i]=0;
        count++;
      }
    }
    for(int i=numberOfElements;i>0;i--){
      arr[i]=arr[i-1];
    }
    numberOfElements++;
  }
  public void rmallsearch(){
    System.out.println("Enter the Search value");
    int search=s.nextInt();
    int count=0;
    for(int i=0;i<numberOfElements;i++){
      if(arr[i]==search){
        arr[i]=0;
        count++;
      }
    }
    for(int i=0;i<numberOfElements;i++){
      if(arr[i]!=0){
        System.out.println(arr[i]);
      }
    }
  }
  
  public void exit(){
    System.out.println("Operations are done");
  }
  public void viewOptions() {
    int option=0;
    do {
      System.out.println("\n1. Insert first");
      System.out.println("2. Insert Last ");
      System.out.println("3. Insert specific");
      System.out.println("4. Remove first element");
      System.out.println("5. Remove last element"); 
      System.out.println("6. remove element from specific index");
      System.out.println("7. remove first occurance of search element");
      System.out.println("8. remove last occurance of search element");
      System.out.println("9. remove all occurances of search element");
      System.out.println("0.Exit");
      System.out.println("Choose your option :");
      option=s.nextInt();
      switch(option) {
        case 1:{
          insertFirst();
          display();
          break;
        }
        case 2: {
          insertLast();
          display();
          break;
        }
        case 3:{
          insertSpecific();
          display();
          break;
        }
        case 4:{
          rmFirst();
          display();
          break;
        }
        case 5:{
          rmLast();
          display();
          break;
        }
        case 6:{
          
        }
        case 7:{
          rmfirstsearch();
          display();
          break;
        }
        case 8:{
          
        }
        case 9:{
          rmallsearch();
          display();
          break;
        }
        case 0:{
          exit();
          break;
        }
        default:{
          System.out.println("Invalid option");
        }
      }
    }
      while(option!=0);   
    }
  public static void main(String args[]){
    MenuDrivenArray obj=new MenuDrivenArray();
    obj.viewOptions();
  }
}
                   