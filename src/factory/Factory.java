package factory;
import java.rmi.RemoteException;

public interface Factory extends java.rmi.Remote {
	IVehicle build(String model) throws RemoteException;
}
