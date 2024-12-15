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
	static int CantidadVehiculos;
	
	public Vehiculo(String placa,int puerta,int velocidad,String nombre, int precio, int peso,String traccion,Fabricante fabricante){
		puertas=puerta;
		velocidadMaxima=velocidad;
		this.traccion=traccion;
		this.placa=placa;
		this.nombre=nombre;
		this.precio=precio;
		this.peso=peso;
		setFabricante(fabricante);
		CantidadVehiculos++;
	}
	
	public static String vehiculosPorTipo() {
		return "Automoviles: "+Automovil.cantidadautomoviles+"Camionetas: "+Camioneta.cantidadcamionetas+"Camiones: "+Camion.cantidadcamiones;
	}

	
	public String getPlaca() {
		return this.placa;
	}
	
	public void setPlaca(String placa) {
		this.placa=placa;
	}
	
	public int getPuertas() {
		return this.puertas;
	}
	
	public void setPuertas(int Puertas) {
		this.puertas=Puertas;
	}
	
	public int getVelocidadMaxima() {
		return this.velocidadMaxima;
	}
	
	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima=velocidadMaxima;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public int getPrecio() {
		return this.precio;
	}
	
	public void setPrecio(int precio) {
		this.precio=precio;
	}
	
	public int getPeso() {
		return this.peso;
	}
	
	public void setPeso(int peso) {
		this.peso=peso;
	}
	
	public String getTraccion() {
		return this.traccion;
	}
	
	public void setTraccion(String traccion) {
		this.traccion=traccion;
	}
	
	public Fabricante getFabricante() {
		return this.fabricante;
	}
	
	public void setFabricante(Fabricante fabricante) {
		this.fabricante=fabricante;
		fabricante.setCantidadVendidos(1);
	}
	
	public static int getCantidadVehiculos() {
		return CantidadVehiculos;
	}
	
	public static void setCantidadVehiculos(int CVehiculos) {
		CantidadVehiculos=CVehiculos;
	}	
	

}