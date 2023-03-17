public class Lecturer extends Employee {
    
    private String designation;
    private int grade;

    Lecturer(String name, int age, String employer, double salary) {
        super(name, age, employer, salary);
    }

    void setGrade(int grade) {
        this.grade = grade;
    }

    void printDetail() {
        super.printDetail();
        System.out.println("Grade: " + grade);
        System.out.println("Designation " + designation);

    }
}