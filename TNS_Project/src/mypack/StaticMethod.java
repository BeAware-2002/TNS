package mypack;


class Employee123
{
  int empId;
  String empName;
  static String companyName = "Microsoft";
  //static method to valueChange the value of static variable
  static void valueChange()
  {
     companyName = "Google";
  }
  //constructor to initialize the variable
  Employee123(int id, String name){
     empId = id;
     empName = name;
  }
//method to display values
void display()
  {
     System.out.println(empId+" "+empName+" "+companyName);
  }
}
//class to create and display the values of object
public class StaticMethod
{
  public static void main(String args[])
     {
        Employee123.valueChange();//calling valueChange method
        //creating objects
        Employee123 EmployeeObj = new Employee123(218,"Kushal");
        Employee123 EmployeeObj1 = new Employee123(635,"Bhumika");
        Employee123 EmployeeObj2 = new Employee123(147,"Renuka");
        //calling display method
        EmployeeObj.display();
        EmployeeObj1.display();
        EmployeeObj2.display();
     }
}
