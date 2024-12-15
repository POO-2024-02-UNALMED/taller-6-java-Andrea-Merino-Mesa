package vehiculos;
public class Camion extends Vehiculo{
	
	int ejes;
	static int cantidadcamiones;
	
	public Camion(String placa, String nombre, int precio, int peso, Fabricante fabricante, int eje){
		super(placa,2, 80,nombre,precio,peso,"4X2", fabricante);
		this.ejes=eje;
		cantidadcamiones++;
	}
	public int getEjes() {
		return this.ejes;
	}
	
	public void setEjes(int ejes) {
		this.ejes=ejes;
	}
}