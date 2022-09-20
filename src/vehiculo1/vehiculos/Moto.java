package vehiculos;

public class Moto extends Vehiculo implements VehiculoMotorizado {
private String marca;
private int cambios;

	
	
	
	public Moto(String tipo) {
	super(tipo);

}
	
	public void hacerWillie() {
		System.out.println("Haceindo willie");
	}

	public void encender() {
		System.out.println("Encendiendo Moto");

	}

	public void apargar() {
		System.out.println("Apagando Moto");

	}

	public void recargarEnergina() {
		System.out.println("Cargando tanque moto");


	}

	public void gastarEnergia() {
		System.out.println("gastando nafta auto");

	}

}
