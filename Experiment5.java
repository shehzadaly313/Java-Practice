package week3;
import java.util.Scanner;
public class experiment5 {
    public static void main (String []args){
        Scanner input = new Scanner(System.in);
        int basicSalary;


        System.out.println("The basic salary :");
        basicSalary= input.nextInt();

        double bonus=0.05*basicSalary;
        double tax=0.1*basicSalary;
        int mealAllowance=40000;
        int transportAllowance=60000;
        double totalSalary=(basicSalary+ mealAllowance + transportAllowance + bonus) - tax;

         System.out.println("The Basic Salary :" +basicSalary);
         System.out.println("The Bonus : "+bonus);
         System.out.println("The tax : "+tax);
         System.out.println("the total Meal Alllowance:: "+mealAllowance);
         System.out.println("The transport Allowance : "+transportAllowance);
         System.out.println("The Total Salary: "+totalSalary);
         input.close();

    }
    
}
