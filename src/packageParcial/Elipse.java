package packageParcial;

public class Elipse extends Figuras{
	public Punto centro;
	private Punto radioMayor;
	private Punto radioMenor;


	public Elipse(Punto centro) {
		this.centro = centro;
	}


	public void agregarRadioMayor(Punto punto) {
		if(centro.getCoordenadaX() == punto.getCoordenadaX()) {
			radioMayor = punto;
		}
		
	}


	public void agregarRadioMenor(Punto punto) {
		if (centro.getCoordenadaY() == punto.getCoordenadaY()) {
			radioMenor = punto;
		}
		
	}
	@Override
	public Double area() {
		Integer mayor = radioMayor.getCoordenadaY() - centro.getCoordenadaY();
		Integer menor = radioMenor.getCoordenadaX() - centro.getCoordenadaX();
		return mayor * menor * 3.14;
	}
	
	@Override 
	public void mover(Punto punto) {
		if(punto.getCoordenadaX() >= radioMayor.getCoordenadaY() - centro.getCoordenadaX() && punto.getCoordenadaY() >= radioMenor.getCoordenadaX() - centro.getCoordenadaY()) {
			Integer distancia = radioMayor.getCoordenadaY() - centro.getCoordenadaX();
			Integer rmaX = radioMayor.getCoordenadaX() + distancia;
			Integer rmaY = radioMayor.getCoordenadaY() + distancia;
			Integer rmeX = radioMenor.getCoordenadaX() + distancia;
			Integer rmeY = radioMenor.getCoordenadaY() + distancia;
			centro = punto;
			agregarRadioMayor(new Punto (rmaX, rmaY));
			agregarRadioMenor(new Punto(rmeX, rmeY));
		}
	}
	

}
