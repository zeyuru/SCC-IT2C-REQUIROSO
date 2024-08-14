
package requirosoc;

import java.text.NumberFormat;
import java.util.Scanner;


public class NetPay {
    
    public void getPay(){
    Scanner input = new Scanner(System.in);
        
        
        
        

        
        String name;
        int byear,age;
        double rate,hours,deduc;
        
        System.out.print("Enter your name: ");
        name = input.nextLine();

        
        System.out.print("Enter Age: ");
        age = input.nextInt();
        
        System.out.print("Enter Rate per Hour: ");
        rate = input.nextInt();
        
        System.out.print("Total Hours Worked: ");
        hours = input.nextInt();
      
        System.out.print("Enter Total Deductions: ");
        deduc = input.nextInt();
        
        
        System.out.println("-------------------------------");
        System.out.println("SLIP DETAILS");
        System.out.println("-------------------------------");
        
        System.out.println("Date: August 14, 2024");
        System.out.println(""+name+"");
        System.out.println("Age: "+age);
        
        
        System.out.println("Total Gross: "+(rate * hours));
        System.out.println("Total Deduction: " +deduc);
        
        System.out.println("-------------------------------");
         System.out.println("Net Pay: "+(rate * hours - deduc));
           System.out.println("-------------------------------");
           
           double money = 19500.00;
           NumberFormat formatter = NumberFormat.getCurrencyInstance();
           String moneyString = formatter.format(money);
            System.out.println(moneyString);
    
}
}
