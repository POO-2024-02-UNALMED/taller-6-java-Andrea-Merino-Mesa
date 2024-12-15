package vehiculos;
public class Camioneta extends Vehiculo{
	boolean volco;
	static int cantidadcamionetas;
	
	public Camioneta(String placa, int puerta, String nombre, int precio, int peso, Fabricante fabricante, boolean volco){
		super(placa,puerta, 90,nombre,precio,peso,"4X4", fabricante);
		this.volco=volco;
		cantidadcamionetas++;
	}
	public boolean isVolco() {
		return this.volco;
	}
	
	public void setVolco(boolean volco) {
		this.volco=volco;
	}
}