package week2;
import java.util.Scanner;
public class assignmentupgrade {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Basic Salary: ");
        int basicSalary= input.nextInt();
        System.out.println("Child Allowance: ");
        int childAllowance= input.nextInt();
        System.out.println("The total Number Of child: ");
        int totalChilds=input.nextInt();
        int totalAllowance=totalChilds*childAllowance;
        float pension=0.05f*basicSalary;
        float finalSalary= (basicSalary+childAllowance)-pension;
        System.out.println("The Child Allowance: "+childAllowance);
        System.out.println("The Number of Child:"+totalChilds);
        System.out.println("The Total Child Salary: "+Allowance);
        System.out.println("The Pension : "+pension);
        System.out.println("The Final Salary : "+finalSalary);
    }
    
}
