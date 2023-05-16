import java.util.Scanner;
public class RestaurantBill {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int sum=0,option=0;
    int SGST=0,CGST=0,totalbill=0;
    int Idly=20,Dosa=30,Poori=30,juice=50;
    String order="";
    do{
      System.out.println("==========Welcome To Our ABC Restaurant=========");
      System.out.println("ITEM"+"\t\tPRICE");
      System.out.println("1.Idly"+"\t\t20");                     System.out.println("2.Dosa"+"\t\t30");
      System.out.println("3.Poori"+"\t\t30");
      System.out.println("4.Juice"+"\t\t50");
      System.out.println("0.Quit");
      option=s.nextInt();
        switch(option){
        case 1:
          System.out.println("Idly"+"\n");
          sum=sum+Idly;
          order=order.concat("Idly"+"\n");             
          break;
        case 2:
          System.out.println("Dosa");
          sum=sum+Dosa;
          order=order.concat("Dosa"+"\n");
          break;
        case 3:
          System.out.println("Poori");
          sum=sum+Poori;
          order=order.concat("Poori"+"\n");
          break;
        case 4:
          System.out.println("Juice");
          sum=sum+juice;
          order=order.concat("Juice"+"\n");
          break;
        case 0:
             System.out.println("####### Please Visit Again #######");
          break;
          default:
            System.out.println("Wrong input");
            break;
        }
    }while(option!=0);
    SGST=(18*sum)/100;
    CGST=(18*sum)/100;
    totalbill=sum+SGST+CGST;
    System.out.println("Your Orders are:\n"+order);
    System.out.println("Your Items bill="+sum);
    System.out.println("SGST(18%)= "+SGST);
    System.out.println("CGST(18%)= "+CGST);
    System.out.println("Total Bill= "+totalbill);
    System.out.println("*******Thank you********");
  }
}
