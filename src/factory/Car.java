package factory;

import java.io.Serializable;

public class Car implements IVehicle, Serializable {
	String model;
	public Car (String model) { this.model = model; }
	
	public String getModel() {  return model; }	
}
