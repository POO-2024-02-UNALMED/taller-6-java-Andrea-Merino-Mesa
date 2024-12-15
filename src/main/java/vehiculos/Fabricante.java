package vehiculos;
import java.util.ArrayList;

public class Fabricante{
	private String nombre;
	private Pais pais;
	int cantidadvendidos;
	static ArrayList<Fabricante> fabricantes = new ArrayList<Fabricante>();
	
	public Fabricante(String nombre, Pais pais){
		this.nombre=nombre;
		this.pais=pais;
	}
	
	public static Fabricante fabricaMayorVentas(){
		Fabricante fabricavendedor=fabricantes.get(0);
		for(int i = 0; i < fabricantes.size(); i++){
			if(fabricantes.get(i).cantidadvendidos>=fabricavendedor.cantidadvendidos) {
				fabricavendedor=fabricantes.get(i);
			}
		}
		return fabricavendedor;
	}
	
	int getCantidadVendidos() {
		return cantidadvendidos;
	}
	
	void setCantidadVendidos(int x) {
		cantidadvendidos+=x;
		this.pais.cantidadvendidos++;
	}
	
	public String getNombre() {
		return this.nombre;
	}
}