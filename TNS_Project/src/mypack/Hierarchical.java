package mypack;
class Animal2{  
void eat()
{
	System.out.println("eating...");
	}  
}  
class Dog2 extends Animal2
{  
void bark()
{
	System.out.println("barking...");
	}  
}  
class Cat2 extends Animal2{  
void meow()
{
	System.out.println("meowing...");
	}  
}  
public class Hierarchical{  
public static void main(String args[]){  
Cat2 c=new Cat2();  
c.meow();  
c.eat();  
Dog2 d = new Dog2();
d.bark();
d.eat();
}
}  

