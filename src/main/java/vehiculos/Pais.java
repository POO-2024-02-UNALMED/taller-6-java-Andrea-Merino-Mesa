package vehiculos;

import java.util.ArrayList;

public class Pais{

	int cantidadvendidos;
	private String nombre;
	static ArrayList<Pais> paises = new ArrayList<Pais>();
	
	public Pais(String nombre){
		this.nombre=nombre;
		paises.add(this);
	}
	
	public static Pais paisMasVendedor() {
		Pais paisvendedor=paises.get(0);
		for(int i = 0; i < paises.size(); i++){
			if(paises.get(i).cantidadvendidos>=paisvendedor.cantidadvendidos) {
				paisvendedor=paises.get(i);
			}
		}
		return paisvendedor;
	}
	
	public String getNombre() {
		return this.nombre;
	}
}
