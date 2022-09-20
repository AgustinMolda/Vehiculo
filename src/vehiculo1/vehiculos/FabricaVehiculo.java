package vehiculos;

public class FabricaVehiculo {
	
	
	public static VehiculoMotorizado fabrica(String tipo) {
			
		
			switch(tipo){
			case "auto":
					return new Auto(tipo);
			case "moto":
				return new Moto(tipo);
				
					
			}
			return null;
	}
}
