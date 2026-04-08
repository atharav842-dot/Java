
class Result {
   private double marks;

    public Result(double marks) {
        this.marks = marks;
    }

    public double getMarks() {
        return marks;
    }

    (start_span)void updateMarks(double newMarks) {
        this.marks = newMarks;
    }
}

public class UniversitySystem {
    public static void main(String[] args) {
        Result student1 = new Result(85.5);
        
     System.out.println("Initial Marks: " + student1.getMarks());
        
     (start_span)student1.updateMarks(92.0);
        System.out.println("Updated Marks: " + student1.getMarks());
        
        student1.marks = 100; 
    }
}


