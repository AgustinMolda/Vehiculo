package vehiculos;

public class Motor {
private int numero;
private String nombre;
private long cilindrada;
private String fabricante;
public Motor() {
	
}
public int getNumero() {
	return numero;
}
public void setNumero(int numero) {
	this.numero = numero;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public long getCilindrada() {
	return cilindrada;
}
public void setCilindrada(long cilindrada) {
	this.cilindrada = cilindrada;
}
public String getFabricante() {
	return fabricante;
}
public void setFabricante(String fabricante) {
	this.fabricante = fabricante;
}
 
public void acelerar(){
	System.out.println("Acelerando");
}
public void desacelerar(){
	System.out.println("Desacelerando");
}



}
