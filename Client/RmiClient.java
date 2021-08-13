import java.rmi.*;
public class RmiClient{
	
	public static void main(String args[])throws Exception{
		
		Calc ob=(Calc)Naming.lookup("ali");
		
		int a=ob.add(10,5);
		int b=ob.mul(10,5);
		System.out.println("Add: "+a);
		System.out.println("Mul: "+b);
	}
}