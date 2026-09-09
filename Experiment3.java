package week3;
import java.util.Scanner;
public class flowchart2 {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        int price;
        double discount;
        double discountRate=0.15;
        double totalPaid;
        System.out.println("The price of Cloths : ");
        price =input.nextInt();
        discount= price * discountRate;
        totalPaid=  price- discount ;
        System.out.println("The price of Cloths : "+price);
        System.out.println("The discount rate : "+discountRate);
        System.out.println("The discount on cloths: "+discount);
        System.out.println("The total Paid amount :"+totalPaid);
        input.close();   
    }   
}
