import java.util.Scanner;

class Method {
  public void add() {
    int a=100,b=200;
    int c=a+b;
    System.out.println("addition is : "+c);
  }
  public void sub() {
    int a=100,b=200;
    int c=a-b;
    System.out.println("substarction is : "+c);
  }
  public void mul() {
    int a=10,b=20;
    int c=a*b;
    System.out.println("Multiplication is : "+c);
  }
  public void viewOptions() {
    Scanner s=new Scanner(System.in);
    System.out.println("1. add");
    System.out.println("2. sub");
    System.out.println("3. mul");
    System.out.println("choose your option");
    int option=s.nextInt();
    switch(option) {
      case 1:
        {
          add();
          break;
        }
      case 2:
        {
          sub();
          break;
        }
      case 3:
        {
          mul();
          break;
        }
      default :
        {
          System.out.println("Please select 1-3");
        }
    }
  }
  public static void main(String args[]){
    Method obj=new Method();
    obj.viewOptions();
  }
}