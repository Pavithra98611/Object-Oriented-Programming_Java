class Student
{ 
  String name;
  int age;
  String color;
  String sex;
  String NICnumber;
  String address;
  
   public static void main(String args[])
   {  
      Student s1 = new Student();
	  Student s2 = new Student();
	  
	  s1.name = "John";
	  s1.age = 21;
	  s1.color = "Fair";
	  s1.sex = "Male";
	  s1.NICnumber = "986632107V";
	  s1.address = "No.28,Lotus lane,Colombo 12";
	  
	  s2.name = "Mary";
	  s2.age = 25;
	  s2.color = "Dark";
	  s2.sex = "Female";
	  s2.NICnumber = "946562559V";
	  s2.address = "No.59,Lower street,Badulla";
	  
	  System.out.println("Name: " + s1.name);
	  System.out.println("Age: " + s1.age);
	  System.out.println("Color: " + s1.color);
	  System.out.println("Sex: " + s1.sex);
	  System.out.println("NICnumber: " + s1.NICnumber);
	  System.out.println("Address: " + s1.address);
	  System.out.println("\n"); //printing new line
	  System.out.println("Name: " + s2.name);
	  System.out.println("Age: " + s2.age);
	  System.out.println("Color: " + s2.color);
	  System.out.println("Sex: " + s2.sex);
	  System.out.println("NICnumber: " + s2.NICnumber);
	  System.out.println("Address: " + s2.address);
	  
	}
}
   
  