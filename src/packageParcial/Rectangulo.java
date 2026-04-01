package packageParcial;

public class Rectangulo extends Figuras{
	private Punto esquinaInferiorIzquierda;
	public Punto esquinaSuperiorDerecha;
	
	public Rectangulo(Punto p1, Punto p2) {
		this.esquinaInferiorIzquierda = p1;
		this.esquinaSuperiorDerecha = p2;
	}

	@Override
	public Double area() {
		Integer lado1 = esquinaSuperiorDerecha.getCoordenadaX() - esquinaInferiorIzquierda.getCoordenadaX();
		Integer lado2 = esquinaSuperiorDerecha.getCoordenadaY() - esquinaInferiorIzquierda.getCoordenadaY();
		
		return lado1*lado2 + 0.0;
	}
	
	@Override
	public void mover(Punto punto) {
		Integer diferencia = punto.getCoordenadaX() - esquinaInferiorIzquierda.getCoordenadaX();
		Integer sdX = esquinaSuperiorDerecha.getCoordenadaX() + diferencia;
		Integer sdY = esquinaSuperiorDerecha.getCoordenadaY() + diferencia;
		esquinaInferiorIzquierda = punto;
		esquinaSuperiorDerecha = new Punto(sdX, sdY);
	}

}
