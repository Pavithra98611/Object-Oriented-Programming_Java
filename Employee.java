public class Employee extends Person {
    
    protected double salary;
    protected String employer;

    Employee(String name, int age, String employer, double salary) {
        super(name, age);
        this.employer = employer;
        this.salary = salary;
    }

    void printDetail() {
        super.printDetail();
        //System.out.println("Salary: " + salary);
        //System.out.println("Employee " + employer);
    }
}