package vehiculos;

public class Auto extends Vehiculo implements VehiculoMotorizado {
 private String tipo;
 private String marca;
 private String modelo;
 private String matricula;
 private int velocidad;
 private int cambio=0;
 private Motor motor;
	public Auto(String tipo) {
		super(tipo);
		// TODO Auto-generated constructor stub
	}
	 

	public void encender() {
		System.out.println("Encendiendo Auto");

	}

	public void apargar() {
		System.out.println("Apagando Auto");

	}

	public void recargarEnergina() {
		System.out.println("Cargando tanque auto");

	}

	public void gastarEnergia() {
		System.out.println("Gastando nafta auto");

	}
	
	public void pasarCambio() {
		this.cambio = this.cambio++;
		
			if(cambio<6) {
			System.out.println("pasando cambio a: "+cambio);
		}
		
	}
	public void rebajarCambio() {
		this.cambio = this.cambio --;
		if(cambio>-1) {
			System.out.println("pasando cambio a: "+cambio);
		}
	}


	@Override
	public String toString() {
		return "Auto [tipo=" + tipo + ", marca=" + marca + ", modelo=" + modelo + ", matricula=" + matricula
				+ ", velocidad=" + velocidad + ", cambio=" + cambio + ", motor=" + motor + "]";
	}


	

}
