import java.util.Scanner;
public class AtmMethod {
  Scanner s=new Scanner(System.in);
  double acbal=10000;
  int pincount=0,wcount=0;
  int five=0,two=0,one=0;
  public void deposit() {
    System.out.println("Enter deposite amount");
    int amount=s.nextInt();
    if(amount>50000){
      System.out.println("Deposit amount should be less than 50000");
    }
  else if(amount%100==0){
    acbal=acbal+amount;
    System.out.println("available bal: "+acbal);
    System.out.println("Money deposited Successfully");
  }
    else{
      System.out.println("Please Deposit multiples of 100 only");
    }
    viewOptions();
    
  }
  public void withdraw(){
    System.out.println("Enter Withdraw amount");
    int amount=s.nextInt();
    if(amount%100==0){
      if(amount<=(acbal-500)){
        if(amount<=20000){
        
          acbal=acbal-amount;
          wcount++;
          System.out.println("your account balance is:"+acbal);
          System.out.println("You withdraw an amount of "+amount);
          if(amount>=500){
              five=(amount/500);
              amount=amount%500;
              System.out.println("500 Notes are: "+five);
            }
          if(amount>=200){
              two=amount/200;
              amount=amount%200;
              System.out.println("200 Notes are: "+two);
            }
          if(amount>=100){
              one=amount/100;
              amount=amount%100;
              System.out.println("100 Notes are: "+one);
            }   
        }
        else{
          System.out.println("Withdraw amount should be less than 20000 only per transaction");
        }
      }
      else{
        System.out.println("Insufficient balance,You should maintain a minimum balance of 500");
      }
    }
      else{
      System.out.println("Enter the amount in multiples of 100 only");
      }
    viewOptions();
  }
  public void balenquiry(){
    System.out.println("Your account balance is : "+acbal);
  
    viewOptions();
  }
  

  public void exit(){
    System.out.println("Thankyou for banking with us \n Have a nice day");
  }
  public void viewOptions() {
    System.out.println("======Welcome to ABC Bank========");
    System.out.println("1. Deposit");
    System.out.println("2. Withdraw");
    System.out.println("3. Bal Enquiry");
    System.out.println("0. EXIT");
    System.out.println("Choose your option");
    int option=s.nextInt();
    switch(option) {
      case 1:{
        deposit();
        break;
      }
      case 2:{
        if(wcount<3){
          withdraw();
        }
        else{
          System.out.println("Your withdraw limit is over");
        }
        break;
        
      }
      case 3:{
        balenquiry();
        break;
      }
      case 0:{
        exit();
        break;        
      }
      default :{
        System.out.println("Invalid Input");
      }
    }
  }
  public void validate() {
    System.out.println("Enter pin");
    int pin=s.nextInt();
    if(pin==2359) {
         viewOptions();
       }
    else{
      System.out.println("Invalid PIN,Please try again");
      pincount++;
      if(pincount<3){
        validate();
      }
      else{
        System.out.println("******************************");
        System.out.println("Your card is blocked for next 24hrs");
        System.out.println("******************************");
      }
    }
  }
  
  public static void main(String[] args) {
    AtmMethod obj=new AtmMethod();
    obj.validate();
    
  }
}
