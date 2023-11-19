package mypack;
//Interface declaration: by first user  
interface Drawable
{  
void draw(int n);  
}  
//Implementation: by second user  
class Rectangle1 implements Drawable
{  
public void draw(int m){
	
	System.out.println("drawing rectangle "+m);
	}  
}  
class Circle implements Drawable{  
public void draw(int n){
	
	System.out.println("drawing circle "+n);
	}  
}  
//Using interface: by third user  
public class Interface1{  
public static void main(String args[]){  
Drawable d=new Circle();//In real scenario, object is provided by method e.g. getDrawable()  
d.draw(5);  
Drawable d1 = new Rectangle1();
d1.draw(15);
}
}  


