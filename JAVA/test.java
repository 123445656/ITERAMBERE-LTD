public class test {  
//instance variables of the class  
int id;  
String name;  
  test() 
{  
System.out.println("this a default constructor");  
}  
  
test(int i,String n ) {  
id = i;  
name = n;  
}  
  
public static void main(String[] args) {  
//object creation  
test s = new test();  
System.out.println("\nDefault Constructor values: \n");  
System.out.println("Student Id : "+s.id + "\nStudent Name : "+s.name);  
  
System.out.println("\nParameterized Constructor values: \n");  
test r = new test(90, "Gilbert");  
System.out.println("Student Id : "+r.id + "\nStudent Name : "+r.name);  
}  
}  
