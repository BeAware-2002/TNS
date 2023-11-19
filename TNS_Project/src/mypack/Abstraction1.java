package mypack;

abstract class Bike{  
	  abstract void run();  
	}  
public class Abstraction1  extends Bike{  
	void run(){
		System.out.println("running safely");
		}  
	public static void main(String args[]){  
	 Bike obj = new Abstraction1();  
	 obj.run();  
	}  
	}


