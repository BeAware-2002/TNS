    package mypack;
// polymorphism using method overloading

	class Adder{  
		
		static int add(int a, int b){
			return a+b;
			}  
		static double add(double a, double b)
		{
			return a+b;
		}  
		}  
		class Polymorphism1 {  
		public static void main(String[] args){  
		System.out.println(Adder.add(11,11));  
		System.out.println(Adder.add(12.3,12.6));  
		}
		}  


