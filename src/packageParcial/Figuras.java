package packageParcial;

import java.util.Collections;
import java.util.LinkedList;

public abstract class Figuras implements Comparable<Figuras>{
	protected Double area;
	protected LinkedList<Figuras> listaDeFiguras = new LinkedList<>();
	

	public Figuras() {
		
	}
	
	public abstract Double area();
	public abstract void mover(Punto punto);
	
	@Override
	public int compareTo(Figuras figura) {
		int resultado = 0;
		if(this.area() > figura.area()) {
			resultado = 1;
		} else if(this.area() < figura.area()){
			resultado = -1;
		}
		return resultado;
	}
	
	public void ordenarPorArea() {
		Collections.sort(this.listaDeFiguras);
	}
	
	public double areaTotalDeLaLista() {
		Double total = 0.0;
		for(Figuras f:listaDeFiguras) {
			total += f.area();
		}
		return total;
	}

	public void agregarFigura(Figuras figura) {
		if(! listaDeFiguras.contains(figura)) {
			listaDeFiguras.add(figura);
		}
		
	}
	
	public Integer cantidadDeFiguras() {
		return listaDeFiguras.size();
	}
	
}
