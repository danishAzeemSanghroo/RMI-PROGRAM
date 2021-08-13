import java.rmi.*;
import java.rmi.server.*;

interface Calc extends Remote{
		
		 int add(int a,int b)throws RemoteException;
		 int mul(int a,int b)throws RemoteException;
	
	}
	
 class CalcImp implements Calc {
		
		
		public int add(int a,int b)throws RemoteException{
			return a+b;
		}
		

		public int mul(int a,int b)throws RemoteException{
			return a*b;
		}
		
	}	

public class RmiServer{
	
	public static void main(String args[])throws Exception{
		
		CalcImp ob=new CalcImp();
		UnicastRemoteObject.exportObject(ob);
		
		Naming.rebind("ali",ob);
		System.out.println("RMI Server Started....");
	
	}
}