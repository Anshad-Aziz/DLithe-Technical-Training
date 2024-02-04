import java.util.Scanner;
public class BusTicket{
    public static void main(String [] args){
        Scanner sin=new Scanner(System.in);
        System.out.println("Enter from Stage number:");
        int fromStage=sin.nextInt();
        System.out.println("Enter to Stage number:");
        int toStage=sin.nextInt();
        System.out.println("Enter the number of adult:");
        int adult=sin.nextInt();
        System.out.println("Enter the number of children:");
        int child=sin.nextInt();
        if(fromStage<1||toStage<1||fromStage>toStage||adult<0||child<0){
            System.out.println("Invaild Input$$$");
        }
        int numStage=toStage-fromStage+1;
        double adultCost=adult*numStage*10;
        double childCost=child*numStage*5;
        double totalCost=adultCost+childCost;
        double discount=0;
        
        if(adult>=5){
            discount=0.2;
        }else if (adult==4){
            discount=0.15;
        }else if (adult==3){
            discount=0.1;
        }else if(adult==2){
            discount=0.05;
        }
        totalCost-=totalCost*discount;
        double serviceCharge=totalCost*0.05;
        double finalCost=totalCost+serviceCharge;
        
        System.out.println("____---Ticket Details----______");
        System.out.println("From stage"+ fromStage);
        System.out.println("To Stage"+ toStage);
        System.out.println("Adult passenger:"+ adult);
        System.out.println("Child passenger:"+ child);
        System.out.println("Number of Stage:"+ numStage);
        System.out.println("Adult Cost:"+  adultCost);
        System.out.println("Child Cost:"+ childCost);
        System.out.println("Total ticket cost before discount:"+totalCost);
        System.out.println("Discount:"+ discount*100);
        System.out.println("Total ticket cost after discount:"+ finalCost);
        System.out.println("Service charge:"+ serviceCharge);
        System.out.println("Final Cost:"+ finalCost);
        System.out.println("----Thank You----------- ");
    }
}