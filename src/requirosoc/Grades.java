package requirosoc;

public class Grades {
    int studentID;
    String name;
    double prelim, midterm, prefinal, finalExam;
    double average;
    String remarks;

   
    public void addGrades(int studentID, String name, double prelim, double midterm, double prefinal, double finalExam) {
        this.studentID = studentID;
        this.name = name;
        this.prelim = prelim;
        this.midterm = midterm;
        this.prefinal = prefinal;
        this.finalExam = finalExam;
        this.average = (prelim + midterm + prefinal + finalExam) / 4;
        this.remarks = (average < 1.5) ? "Passed" : "Failed"; 
    }

   
    public void viewGrades() {
        System.out.printf("%-10d %-10s %-10.2f %-10.2f %-10.2f %-10.2f %-10.2f %-10s\n",
                studentID, name, prelim, midterm, prefinal, finalExam, average, remarks);
    }

    
}
