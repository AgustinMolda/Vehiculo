package main;

import vehiculos.Auto;
import vehiculos.FabricaVehiculo;
import vehiculos.Moto;
import vehiculos.Vehiculo;

public class Principal {

	public static void main(String[] args) {
		Vehiculo a = new Auto("Auto");
		Auto a2 = (Auto) a;
		a.avanzar();
		a2.encender();
		
		Vehiculo m = new Moto("Moto");
		
		Moto m2 = (Moto) m;
		m.avanzar();
		m2.hacerWillie();
		
		FabricaVehiculo fabrica = new FabricaVehiculo();
		
	  	Auto a4 = (Auto) FabricaVehiculo.fabrica("auto");
		
	  	a4.encender();
	  	
	  	Moto m3 = (Moto) FabricaVehiculo.fabrica("moto");
	  	m3.hacerWillie();
	}

}
