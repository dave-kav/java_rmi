package factory;
import java.rmi.*;
import java.rmi.server.*;

@SuppressWarnings("serial")
public class FactoryImpl extends UnicastRemoteObject implements Factory {
	private String name;
	private int v = 0;

	protected FactoryImpl(String name) throws RemoteException {
		this.name = name;
	}

	@Override
	public IVehicle build(String model) throws RemoteException {
		if (model.equalsIgnoreCase("car")) {
			v++;
			System.out.printf("Completed production of car\nRegistration:\t 152 - C - %d\n", v);
			return new Car(model);
		}
		else if (model.equalsIgnoreCase("van")) {
			v++;
			System.out.printf("Completed production of van\nRegistration:\t 152 - C - %d\n", v);
			return new Van(model);
		}
		return null;
	}
}
