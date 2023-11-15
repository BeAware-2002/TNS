package mypack;
class ThisConst
{  
	ThisConst(){
		System.out.println("hello a");
		}  
	ThisConst(int x){  
this();  
System.out.println(x);  
}  
}  
class This3{  
public static void main(String args[]){  
	ThisConst a=new ThisConst(10);  
}}  


