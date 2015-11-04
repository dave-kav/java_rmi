package factory;

import java.io.Serializable;

public class Van implements IVehicle, Serializable {
	String model;
	public Van (String model) { this.model = model; }
	
	public String getModel() {  return model; }
}
