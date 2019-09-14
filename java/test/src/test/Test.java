package test;

public class Test {

	public static void main(String[] args) {
		String s1=args[0];
		String s2=args[1];
		int n1=Integer.parseInt(s1);
		int n2=Integer.parseInt(s2);
		int s=n1+n2;
		String str=Integer.toString(s);
		
		
		System.out.println("Addition is :"+s);
	}

}
