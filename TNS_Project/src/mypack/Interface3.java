package mypack;
//inheriting interface from interface
interface Printable1{  
void print();  
}  
interface Showable1 extends Printable1{  
void show();  
}  
class Interface3 implements Showable1{  
public void print(){
	System.out.println("Hello");
	}  
public void show(){
	System.out.println("Welcome");
	}  
  
public static void main(String args[]){  

Interface3 obj = new Interface3();  
obj.print();  
obj.show();  
 }  
}  

