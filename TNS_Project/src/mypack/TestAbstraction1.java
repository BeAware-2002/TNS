package mypack;

abstract class Bike3{  
	  abstract void run();  
	}  
public class TestAbstraction1  extends Bike3{  
	void run(){
		System.out.println("running safely");
	}  
	public static void main(String args[]){  
	 Bike3 obj = new TestAbstraction1();  
	 obj.run();  
	}  
	}


