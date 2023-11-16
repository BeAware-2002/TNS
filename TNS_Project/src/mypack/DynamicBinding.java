package mypack;

	class Animal3{  
		 void eat()
		 {
			 System.out.println("animal is eating...");
			 }  
		}  
		  
	public class DynamicBinding extends Animal3{  
		 void eat(){
			 System.out.println("dog is eating...");
			 }  
		  
		 public static void main(String args[]){  
		  Animal3 a=new DynamicBinding();  
		  a.eat();  
		 }  
		}
//Dynamic Binding- type of the object is determined at run-time

