package vehiculos;

public class Auto  extends Vehiculo{
	private int numeroRuedas;
	private int rodado;
	private int numeroChasis;
	
	
	public Auto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Auto(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}
	
	public Auto(int numeroRuedas, int rodado, int numeroChasis) {
		super();
		this.numeroRuedas = numeroRuedas;
		this.rodado = rodado;
		this.numeroChasis = numeroChasis;
	}
	

	public int getNumeroRuedas() {
		return numeroRuedas;
	}

	public void setNumeroRuedas(int numeroRuedas) {
		this.numeroRuedas = numeroRuedas;
	}

	



	public int getRodado() {
		return rodado;
	}

	public void setRodado(int rodado) {
		this.rodado = rodado;
	}

	public int getNumeroChasis() {
		return numeroChasis;
	}

	public void setNumeroChasis(int numeroChasis) {
		this.numeroChasis = numeroChasis;
	}

	
	
	
	
}
 