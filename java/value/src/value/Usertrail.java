package value;

public class Usertrail {
int val1;
int val2;

public int getVal1() {
	return val1;
}
public int getVal2() {
	return val2;
}
public void setVal1(int val1) {
	this.val1 = val1;
}
public void setVal2(int val2) {
	this.val2 = val2;
}
void booleanshow(){
	
}
public Usertrail(int val1,int val2){
	if(val1<0||val2<0)
	{
		try{
			throw new IllegalValueException();
			
		}
		catch(IllegalValueException e)
		{
			System.out.println(e);
		}
	}
	this.val1=val1;
	this.val2=val2;
	
}
void display(){
	System.out.println("Num is:"+val1+"\nNum is :"+val2);
}
public static void main(String[]args){
	Usertrail u=new Usertrail(-1,10);
	u.display();
}
}
