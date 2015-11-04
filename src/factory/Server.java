package factory;
import java.rmi.Naming;
import java.rmi.RMISecurityManager;

public class Server {
	public static void main( String argv[]) {

	      System.out.println("Application Started");      
	      System.setSecurityManager(new RMISecurityManager());
	      
	      try {
	         FactoryImpl obj = new FactoryImpl("Vehicle Server");
	         Naming.rebind("rmi://" +argv[0] + "/Server",obj);
	         System.out.println("Server in Registry");
	         }catch (Exception e)  {
	             System.out.println ("Vehicle Server error: " +
	                    e.getMessage());
	         }
	   }
}
