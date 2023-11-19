package mypack;
//Example of an abstract class that has abstract and non-abstract methods  
abstract class Bike4
{  
 Bike4(){
	 System.out.println("bike is created");
	 }  
 abstract void run();  
 void changeGear(){
	 System.out.println("gear changed");
	 }  
}  
//Creating a Child class which inherits Abstract class  
class Honda1 extends Bike4{  
void run(){
	System.out.println("running safely..");
	}  
}  
//Creating a Test class which calls abstract and non-abstract methods  
public class TestAbstraction2
{  
public static void main(String args[]){  
Bike4 obj = new Honda1();  
obj.run();  
obj.changeGear();  
}  
}