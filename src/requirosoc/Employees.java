
package requirosoc;

import java.util.Scanner;
public class Employees {
    
    public void Salaries(){
        Scanner input = new Scanner(System.in);
       
         
        double totalSalary = 0;
        double totalDeductions = 0;
        double totalSalaryToRelease = 0;
        
        System.out.println("Enter the no. of Employees: ");
        int emp  = input.nextInt();
        
       

        for (int i = 0; i < emp; i++){
            
            System.out.println("Details of Employee"+ (i + 1) + ":");
            
            System.out.println("ID: ");
             int id = input.nextInt();  
             
             System.out.println("Name: ");
             String name = input.next();  
             
             System.out.println("Rate: ");
            double rate = input.nextDouble();
            
            System.out.println("Hours Worked: ");
             double hrs = input.nextDouble();
             
             System.out.println("Gross: ");
             double grs = input.nextDouble();
             System.out.println("Total Deduction: 2");
              double deduc = input.nextDouble();
              
              System.out.println("Net Pay: ");
              double netp = input.nextDouble();
             np[i] = new NetPay(id, name, rate, hrs, deduc);

            
            totalSalary += np[i].getGrossPay();
            totalDeductions += np[i].getDeductions();
            totalSalaryToRelease += np[i].getNetPay();
        }
       
          System.out.printf("%-10s %-15s %-10s %-10s %-10s %-10s %-10s%n",
                "ID", "NAME", "RATE", "HOURS", "GROSS", "DEDUCTIONS", "NETPAY");
        System.out.println("-------------------------------------------------------------");
         for (int i = 0; i < emp; i++) {
            np[i].viewDetails();
        }
        System.out.printf("TOTAL SALARY: %.2f%n", totalSalary);
        System.out.printf("TOTAL DEDUCTIONS: %.2f%n", totalDeductions);
        System.out.printf("TOTAL SALARY TO RELEASE: %.2f%n", totalSalaryToRelease);
        
    }
}
