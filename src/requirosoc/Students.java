
package requirosoc;
import java.util.Scanner;
public class Students {
        public void editGrades(Grades[] grs, int size, int id){
            Scanner input = new Scanner(System.in);
            for (int i = 0; i < size; i++ ){
                if (grs[i].studentID == id){
                    
                    System.out.println("New Prelim Grade: ");
                    double pr = input.nextDouble();
                      grs[i].prelim = pr;
                     System.out.println("New Midterm Grade: ");
                    double md = input.nextDouble();
                     grs[i].midterm = md;
                     System.out.println("New Prefinal Grade: ");
                    double pf = input.nextDouble();
                     grs[i].prefinal = pf;
                     System.out.println("New Final Grade: ");
                    double fn = input.nextDouble();
                    grs[i].finalExam = fn;
                }
                
            }
            
        }
    
    
    public void genGrade(){
          Scanner input = new Scanner(System.in);
          Grades[] gr= new Grades[100];
          
          
          
          int nums = 0;
          String op;
                                     
          
          do{
        System.out.println("Welcome to Grading App");
          System.out.println("------------------------------------");
          System.out.println("1. ADD");
          System.out.println("2. VIEW");
          System.out.println("3. UPDATE");
          System.out.println("4. DELETE");
          System.out.println("5. EXIT");
           System.out.println("------------------------------------");
           
          
          System.out.println("Enter Action: ");
          int option = input.nextInt();
          
          while (option > 5){
              System.out.println("Invalid Action, Try Again: ");
              option = input.nextInt();
              
          }
        
        
        
        
        
        switch (option){
            case 1:
                 System.out.println("Enter no. of Students: ");
         nums = input.nextInt();  
        for (int i = 0; i < nums; i++) {

            System.out.println("Enter details of Student " + (i + 1) + ":");

            System.out.println("ID: ");
            int id = input.nextInt();  

            System.out.println("Name: ");
            String name = input.next();  

            System.out.println("Prelim: ");
            double pr = input.nextDouble();  

            System.out.println("Midterm: ");
            double md = input.nextDouble();  

            System.out.println("PreFinal: ");
            double pf = input.nextDouble(); 

            System.out.println("Finals: ");
            double fn = input.nextDouble(); 
            
             gr[i] = new Grades ();
             gr[i].addGrades(id, name, pr, md, pf, fn);
        }
        break;
        case 2:
        for(int i=0; i < nums; i++){
            gr[i].viewGrades();
        }
        break;
        case 3: 
             System.out.println("Enter the ID to update: ");
                int ids = input.nextInt();
                System.out.println(""+ids);
                editGrades(gr, nums, ids);
            break;
    }
        
        System.out.println("Do you want to continue? (Y/N): ");
        op= input.next();
        }while(op.equals("Y") || op.equals("y"));
        
          
          
          
          
          
         
        
        
        
        
    }
    
}
