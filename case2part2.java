package week2;
import java.util.Scanner;
public class assign2upgrade {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("The width of Land: ");
        int width= input.nextInt();
        System.out.println("The lenght of Land: ");
        int length= input.nextInt();
        System.out.println("the Diameter of Circle: ");
        int diameter= input.nextInt();
        System.out.println("The Side of Sqaure: ");
        int side= input.nextInt();
        int radius=diameter/2;
        float areaCircle= 3.14f* (radius*radius);
        int areaSquare=side*side;
        int areaLand=width *length;
        float occupiedLand=areaCircle+areaSquare;
        float grassLand= areaLand - occupiedLand;
        System.out.println("The Radius: "+radius);
        System.out.println("Area Circle: "+areaCircle);
        System.out.println("Area Square: "+areaSquare);
        System.out.println("Land Area: "+areaLand);
        System.out.println("Occupied Land : "+occupiedLand);
        System.out.println("Grass Land: "+grassLand);
    }    
}

