package factory;
import java.rmi.Naming;

public class Client {
	public static void main(String argv[]){
		Object vehicle = null;
		String model = Handy.readString("\nWhich vehicle do you wish to order?\n\t-\tCar\n\t-\tVan\n\n\t\t");
		try  {
			/*get reference to server from
	                  server’s registry*/
			Factory obj = (Factory) Naming.lookup("rmi://" + argv[0] + "/Server");
			vehicle = obj.build(model);
		}catch (Exception e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		if (vehicle != null)
			System.out.printf("\nCompleted production of model: %s\n", ((IVehicle)vehicle).getModel());
		else
			System.out.println("\nInvalid choice!!\n");
	}
}
