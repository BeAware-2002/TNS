package mypack;
class Student11{  
int rollno;  
String name;  
float fee;  
Student11(int rollno,String name,float fee){  
this.rollno=rollno;  
this.name=name;  
this.fee=fee;  
}  
void display(){System.out.println(rollno+" "+name+" "+fee);}  
}  
class this1{  
public static void main(String args[]){  
Student11 s1=new Student11(111,"ankit",5000f);  
Student11 s2=new Student11(112,"sumit",6000f);  
s1.display();  
s2.display();  
}}  

