package vehiculos;

public class Moto extends Vehiculo {

	private int velocidad = 100;
	private int aceleracion = 50;
	private int tiempo=10;
	private int cambios;
	private String nombre;
	
	public Moto(int velocidad, int aceleracion, int tiempo, int cambios, String nombre) {
		super();
		this.velocidad = velocidad;
		this.aceleracion = aceleracion;
		this.tiempo = tiempo;
		this.cambios = cambios;
		this.nombre = nombre;
	}
	public Moto() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	private int getVelocidad() {
		return velocidad;
	}
	private void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	private int getAceleracion() {
		return aceleracion;
	}
	private void setAceleracion(int aceleracion) {
		this.aceleracion = aceleracion;
	}
	private int getTiempo() {
		return tiempo;
	}
	private void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}
	private int getCambios() {
		return cambios;
	}
	private void setCambios(int cambios) {
		this.cambios = cambios;
	}
	private String getNombre() {
		return nombre;
	}
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	 
}
