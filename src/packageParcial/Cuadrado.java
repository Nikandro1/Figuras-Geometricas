package packageParcial;

public class Cuadrado extends Figuras {
	private Punto esquinaInferiorIzquierda;
	public Punto esquinaSuperiorDerecha;
	
	public Cuadrado() {
		
	}
	@Override
	public Double area() {
		Integer resultado = esquinaSuperiorDerecha.getCoordenadaX() - esquinaInferiorIzquierda.getCoordenadaX();
		return resultado *4.0;
	}

	public void cargarEsqInferior(Punto punto) {
		if(punto.getCoordenadaX() == punto.getCoordenadaY()) {
			esquinaInferiorIzquierda = punto;
		}
		
	}
	public void cargarEsqSuperior(Punto punto) {
		if(punto.getCoordenadaX() == punto.getCoordenadaY()) {
			esquinaSuperiorDerecha = punto;
		}
		
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
