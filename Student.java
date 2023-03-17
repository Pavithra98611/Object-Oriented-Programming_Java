public class Student extends Person {
    
    private String university;
    private int level;

    Student(String name, int age, String university, int level) {
        super(name, age);
        this.university = university;
        this.level = level;
    }

    @Override
    void printDetail() {
        super.printDetail();
        System.out.println("University: " + university);
        System.out.println("Level: " + level);
    }
}