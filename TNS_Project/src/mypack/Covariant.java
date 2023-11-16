package mypack;
class A2{    
A2 get(){
	return this;
	}    
}    
    
public class Covariant extends A2{    
@Override  
Covariant get(){
	return this;
	}    
void message(){
	System.out.println("welcome to covariant return type");
	}    
    
public static void main(String args[]){    
new Covariant().get().message();    
}    
}    


 
