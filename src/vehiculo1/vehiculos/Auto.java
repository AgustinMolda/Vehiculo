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
		// TODO Auto-generated method stub

	}

	public void apargar() {
		// TODO Auto-generated method stub

	}

	public void recargarEnergina() {
		// TODO Auto-generated method stub

	}

	public void gastarEnergia() {
		// TODO Auto-generated method stub

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

}
