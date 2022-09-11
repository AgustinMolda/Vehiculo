package vehiculos;

public class Fabrica {

	public static Transporte read(String tipo) {
		
		switch(tipo) {
		case "Moto":
			return new Moto();
		case "Auto":
			return new Auto();
		default:
			System.out.println("No se encuentra ningun objeto en la fabrica");
			return null;
			
			
		
		}
		
	}
	
}
