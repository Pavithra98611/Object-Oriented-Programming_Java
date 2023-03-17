class Person{
	String name;
	int age;
	
	
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public void printDetail(){
		System.out.println("Name: "+name+"\n"+"Age: "+age);
	}
	
}

class Student extends Person{
	int level;
	String university;
	
	public Student(String name,int age,String uni,int level){
		super(name,age);
		this.level = level;
		university = uni;
		
	}
	
	public void printDetail(){
		System.out.println("University: "+university);
		System.out.println("level: "+level);
	}
	
}

class Employee extends Person{
	double salary;
	String employer;
	
	public Employee(String name,int age,String e,double salary){
		super(name,age);
		this.salary = salary;
		employer = e;
	}
	
	public void printDetail(){
		super.printDetail();
		System.out.println("Salary: "+salary);
		System.out.println("Employeer: "+ employer);
	}
}

class Programmer extends Employee{
	String designation;
	String language;
	
	Programmer(String name,int age,String e,double salary){
		
		super(name,age,e,salary);
		designation = e;
	}
	
	public void setLanguage(String lan){
		language = lan;
	}
	
	public void printDetail(){
		System.out.println("designation: "+designation);
		System.out.println("language: "+language);
	}
}

class Lecturer extends Employee{
	String designation;
	int grade;
	
	public Lecturer(String name,int age,String e,double salary){
		super(name,age,e,salary);
		designation = e;
	}
	
	public void setGrade(int g){
		grade = g;
	}
	
	public void printDetail(){
		System.out.println("Grade: "+grade);
		System.out.println("designation: "+designation);
	}
}

class Test{
	public static void main(String args[]){
		
		Programmer p = new Programmer("David",27,"programmer",100000);
		p.setLanguage("Java");
		Employee E = new Employee("David",27,"ABS Softwares Ltd.",100000);
	
		
		//E.printDetail();
		p.printDetail();
		
	}
}