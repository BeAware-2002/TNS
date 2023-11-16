package mypack;

//inheriting final method
	class Bike{  
		  final void run(){
			  System.out.println("running...");
			  }  
		}  
		public class Final2 extends Bike{  
		   public static void main(String args[]){  
		    new Final2().run();  
		   }  
		}  


