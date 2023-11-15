package mypack;
class ConstOverloading {  
int id;  
String name;  
int age;  
//creating two arg constructor  
ConstOverloading (int i,String n){  
id = i;  
name = n;  
}  
//creating three arg constructor  
ConstOverloading (int i,String n,int a){  
id = i;  
name = n;  
age=a;  
}  
void display(){System.out.println(id+" "+name+" "+age);}  
 
public static void main(String args[]){  
ConstOverloading  s1 = new ConstOverloading (111,"Karan");  
ConstOverloading  s2 = new ConstOverloading (222,"Aryan",25);  
s1.display();  
s2.display();  
}  
}  



