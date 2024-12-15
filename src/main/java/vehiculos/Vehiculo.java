package vehiculos;
public class Vehiculo{
	
	String placa;
	int puertas;
	int velocidadMaxima;
	String nombre;
	int precio;
	int peso;
	String traccion;
	Fabricante fabricante;
	
	Vehiculo(String placa,int puerta,int velocidad,String nombre, int precio, int peso,String traccion,Fabricante fabricante){
		puertas=puerta;
		velocidadMaxima=velocidad;
		this.traccion=traccion;
		this.placa=placa;
		this.nombre=nombre;
		this.precio=precio;
		this.peso=peso;
		setFabricante(fabricante);	
	}
	
	String vehiculosPorTipo() {
		return "Automoviles: "+Automovil.cantidadautomoviles+"Camionetas: "+Camioneta.cantidadcamionetas+"Camiones: "+Camion.cantidadcamiones;
	}

	
	String getPlaca() {
		return this.placa;
	}
	
	void setPlaca(String placa) {
		this.placa=placa;
	}
	
	int getPuertas() {
		return this.puertas;
	}
	
	void setPuertas(int Puertas) {
		this.puertas=Puertas;
	}
	
	int getVelocidadMaxima() {
		return this.velocidadMaxima;
	}
	
	void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima=velocidadMaxima;
	}
	
	String getNombre() {
		return this.nombre;
	}
	
	void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	int getPrecio() {
		return this.precio;
	}
	
	void setPrecio(int precio) {
		this.precio=precio;
	}
	
	int getPeso() {
		return this.peso;
	}
	
	void setPeso(int peso) {
		this.peso=peso;
	}
	
	String getTraccion() {
		return this.traccion;
	}
	
	void setTraccion(String traccion) {
		this.traccion=traccion;
	}
	
	Fabricante getFabricante() {
		return this.fabricante;
	}
	
	void setFabricante(Fabricante fabricante) {
		this.fabricante=fabricante;
		fabricante.setCantidadVendidos(1);
	}

}