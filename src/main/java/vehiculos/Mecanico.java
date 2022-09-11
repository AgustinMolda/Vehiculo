package vehiculos;

public class Mecanico {
		private String[] herramientas = {"Llaves","Destronilladores","lijas"};
		protected String[] repuestos = {"Bujes", "Bulones", "juntas"};
		protected int numeroRepuestos;
		public Mecanico(String[] herramientas, String[] repuestos, int numeroRepuestos) {
			super();
			this.herramientas = herramientas;
			this.repuestos = repuestos;
			this.numeroRepuestos = numeroRepuestos;
			asignarRepuestos("bujes");
			asignarRepuestos("bulones");
			asignarRepuestos("juntas");
		}
		private String[] getHerramientas() {
			return herramientas;
		}
		private void setHerramientas(String[] herramientas) {
			this.herramientas = herramientas;
		}
		private String[] getRepuestos() {
			return repuestos;
		}
		private void setRepuestos(String[] repuestos) {
			this.repuestos = repuestos;
		}
		private int getNumeroRepuestos() {
			return numeroRepuestos;
		}
		private void setNumeroRepuestos(int numeroRepuestos) {
			this.numeroRepuestos = numeroRepuestos;
		}
		
		private void asignarRepuestos(String herramientas){
					switch(herramientas) {
						case "bujes":
							this.numeroRepuestos = 10;
							System.out.println("Hay 10 bujes");
							break;
						case "bulones" :
							this.numeroRepuestos = 20;
							System.out.println("Hay 20 bulones");
							break;
						case "juntas":
							this.numeroRepuestos = 30;
							System.out.println("Hay 30 juntas");
							break;
						default:
							 System.out.println("No hay ese repuesto");
					}
		}
		
		public void reparar() {
			for(String rep : repuestos ) {
					this.numeroRepuestos --;
			}
		}
		
}
