package mypack;
//default method in interface
interface Drawable2{  
void draw();  
default void msg(){
	System.out.println("default method");
	}  
}  
class Rectangle4 implements Drawable2{  
	
public void draw(){
	System.out.println("drawing rectangle");
	}  
}  
class Interface4
{  
public static void main(String args[]){  
Drawable2 d=new Rectangle4();  
d.draw();  
d.msg();  
}}  

