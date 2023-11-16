package mypack;

public class StaticBinding {
	 
		 private void eat()
		 {
			 System.out.println("dog is eating...");
			 }  
		  
		 public static void main(String args[]){  
			 StaticBinding d1=new StaticBinding();  
		  d1.eat();  
		 }  
		}  

//Static Binding- determined at compile time-use private,static,final method
