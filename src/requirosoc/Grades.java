package requirosoc;

import java.util.Scanner;

public class Grades {
    public void GetGrades{
        Grades gr = new Grades();
        
        
        System.out.println("%-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s\n",
                "Student ID", "Name", "Prelim", "Midterm", "Prefinal", "Final", "Average", "Remarks");
        
        
        gr.addGrades (1001, "Mike", 1.0, 1.0, 1.0, 1.0);
        gr.viewGrades();
        
        
        Grades gr1 = new Grades();
        gr1.addGrades (1002, "John", 2.0, 1.0, 1.0, 1.0);
        
        
     
    }
}
