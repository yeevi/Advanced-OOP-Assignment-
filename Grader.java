public class Grader {
    public static void main(String[] args) {
        double marks = 20;

        if (marks >= 93 && marks <= 100) {
            System.out.println("Grade is A");
            
        } else if (marks >= 85 && marks < 93) {
            System.out.println("Grade is B");
           
        } else if (marks >= 80 && marks < 85) {
            System.out.println("Grade is C");
            
        } else if (marks >= 75 && marks < 80) {
            System.out.println("Grade is D");
          
        } else if (marks >= 0 && marks < 75) {
            System.out.println("Grade is E");
         
        } else {
            System.out.println("Unknown value");
        }
    }
}