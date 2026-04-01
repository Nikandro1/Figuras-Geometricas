package packageParcial;

public class Circulo extends Figuras{
	public Punto centro;
	private Punto bordeSuperior;
	private Punto bordeDerecho;
	
	public Circulo(Punto centro) {
		this.centro = centro;
	}
	public void agregarBordeSuperior(Punto punto) {
		if(getCentro().getCoordenadaX() == punto.getCoordenadaX()) {
			bordeSuperior = punto;
		}
	}
	
	public void agregarBordeDerecho(Punto punto) {
		Integer distancia = bordeSuperior.getCoordenadaX() - getCentro().getCoordenadaX();
		if(punto.getCoordenadaY() == getCentro().getCoordenadaY() && (punto.getCoordenadaX() - getCentro().getCoordenadaX() == distancia)) {
			bordeDerecho = punto;
		}
	}
	@Override
	public Double area() {
		Integer distancia = bordeSuperior.getCoordenadaY() - getCentro().getCoordenadaX();
		return (distancia *distancia) * 3.14;
	}
	
	@Override 
	public void mover(Punto punto) {
		if(punto.getCoordenadaX() >= bordeSuperior.getCoordenadaY() - getCentro().getCoordenadaX() && punto.getCoordenadaY() >= bordeDerecho.getCoordenadaX() - getCentro().getCoordenadaY()) {
			Integer distancia = bordeSuperior.getCoordenadaY() - getCentro().getCoordenadaX();
			Integer bsX = bordeSuperior.getCoordenadaX() + distancia;
			Integer bsY = bordeSuperior.getCoordenadaY() + distancia;
			Integer bdX = bordeDerecho.getCoordenadaX() + distancia;
			Integer bdY = bordeDerecho.getCoordenadaY() + distancia;
			centro = punto;
			agregarBordeSuperior(new Punto (bsX, bsY));
			agregarBordeDerecho(new Punto(bdX, bdY));
		}
	}
	
	public Punto getBordeSuperior() {
		return bordeSuperior;
	}
	public Punto getCentro() {
		return centro;
	}
}
