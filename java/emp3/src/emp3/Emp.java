package emp3;

public class Emp {
int empid;
String name;
String designation;
double basic;
double hra;
public int getEmpid() {
	return empid;
}
public String getName() {
	return name;
}
public String getDesignation() {
	return designation;
}
public double getBasic() {
	if(basic<500){
		try{
			throw new LowSalException();
			
		}
	    catch(LowSalException e){
	    	
	    	System.out.println(e);
	    }
	}
	return basic;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public void setName(String name) {
	this.name = name;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public void setBasic(double basic) {
	this.basic = basic;
}
public Emp(){
	
	this.empid=1;
	name="Rushi";
	this.designation="Software Engg";
	this.basic=300;
	
}
public Emp(int empid,String name,String designation,double basic){
	this.empid=empid;
	name=name;
	this.designation=designation;
	this.basic=basic;
}
public void printDET(){
	System.out.println("Id of employee"+empid+"\nName of emp"+name+"\nDesignation of emp"+designation+"\nSalary of emp"+basic);
	
	
	
}
public void calculateHRA(){
	
	if(designation=="Manager"){
		hra=basic*0.1;
		System.out.println("HRA of officer:"+hra);
		
		
	}
	else{
		hra=basic*0.05;
		System.out.println("HRA of clerk"+hra);
		
	}
	
}
public static void main(String[]args){
	Emp e=new Emp();
	e.getBasic();
	e.printDET();
	System.out.println();
	Emp e1=new Emp(2,"Ayush","Manager",50000);
	e1.printDET();
	e1.calculateHRA();
	System.out.println();
	System.out.println();
	Emp e3=new Emp(4,"shlok","clerk",15000);
	e3.printDET();
	e3.calculateHRA();
	
	

}

}


