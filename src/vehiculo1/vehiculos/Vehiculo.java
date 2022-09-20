package vehiculos;

public class Vehiculo {
	private String tipo;
	private String nombre;
	
	public Vehiculo(String tipo) {
		this.tipo = tipo;
	}
	
	public void avanzar() {
		System.out.println("Avanzando");
	}
	
	public void retroceder() {
		System.out.println("Retrocediendo");
	}
	public void doblar() {
		System.out.println("Doblando");
	}
	public void frenar() {
		System.out.println("Frenando");
	}
}
