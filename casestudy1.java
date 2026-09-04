package week2;

public class assignment {
    public static void main(String[] args) {
        int currentSalary=3000000;
        int forChild=150000;
        int totalChildSalary=3*forChild;
        float pension=0.05f*currentSalary;
        float salaryPension=currentSalary-pension;
        float netSalary=salaryPension + totalChildSalary;
        System.out.println("total child Salaray: "+totalChildSalary);
        System.out.println("pension : "+pension);
        System.out.println("Salary After Pension : "+salaryPension);
        System.out.println("The Net Salary Per Month: "+netSalary);

    }
    
}
