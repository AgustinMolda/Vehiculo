import vehiculos.Auto;
import vehiculos.Fabrica;
import vehiculos.Moto;
import vehiculos.Transporte;
import vehiculos.Vehiculo;

public class Main {
	public static void main(String[] args) {
		
		Transporte t1 = Fabrica.read("Auto");
		Transporte t2 = Fabrica.read("Moto");
		
		t1.arrancar();
		
		t1.detner();
		
		System.out.println(t1.tipo());
		
		t2.arrancar();
		t2.detner();
		
		System.out.println(t2.tipo());
		
			Vehiculo v1 = new Vehiculo();
			
			Vehiculo a1  = new Auto();
			
			Auto a2 = (Auto) a1;
			
			Vehiculo m1 = new Moto();
			
			Moto m2 = (Moto) m1;
			
			a2.acelerar();
			
			m2.doblar();
			
			a2.setRodado(25);
			
			System.out.println(a2.getRodado());
			
			Vehiculo[] ve = {v1,a1,m1};
			
			for(Vehiculo ves : ve) {
				System.out.println(ves.toString());
				
			}
	
	
	
	}
}
