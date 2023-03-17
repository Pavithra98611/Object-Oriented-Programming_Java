public class Programmer extends Employee {

    private String designation;
    private String language;

    Programmer(String name, int age, String employer, double salary, String designation) {
        super(name, age, employer, salary);
        this.designation = designation;

    }

    void setLanguage(String language) {
        this.language = language;
    }

    void printDetail() {
        super.printDetail();
        System.out.println("Designation: " + designation);
        System.out.println("Language: " + language);
        System.out.println("Salary: " + salary);
        System.out.println("Employer: " + employer);
    }
    
}