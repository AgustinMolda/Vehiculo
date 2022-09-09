import vehiculos.Auto;
import vehiculos.Moto;
import vehiculos.Vehiculo;

public class Main {
	public static void main(String[] args) {
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
