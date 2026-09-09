package week3;
import java.util.Scanner;

 public class flowchart{
    public static void main( String[] args){

        Scanner input= new Scanner(System.in);
        int length;
        int width;
        int area;
        System.out.println("The lenght of Field: ");
        length= input.nextInt();
        System.out.println("The width of Field : ");
        width= input.nextInt();
        area= length * width;
        System.out.println("The area of Field: " +area);
        input.close();
    }
 }
