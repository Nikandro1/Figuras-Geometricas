package packageParcial;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testParcial {
 
	@Test
	void seCalcularElAreaDeUnElipse() {
		Integer coordenadaX = 3;
		Integer coordenadaY = 3;
		Punto p1 = new Punto(coordenadaX, coordenadaY);
		Elipse e1 = new Elipse(p1);
		Integer coordenadaX2 = 3;
		Integer coordenadaY2 = 6;
		Punto p2 = new Punto(coordenadaX2, coordenadaY2);
		Integer coordenadaX3 = 5;
		Integer coordenadaY3 = 3;
		Punto p3 = new Punto(coordenadaX3, coordenadaY3);
		e1.agregarRadioMayor(p2);
		e1.agregarRadioMenor(p3);
		Double resultadoEsperado = 18.84;
		Double resultadoObtenido = e1.area();
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	@Test 
	void elAreaDeUnCuadrado() {
		Integer coordenadaX = 1;
		Integer coordenadaY = 1;
		Punto p1 = new Punto(coordenadaX, coordenadaY);
		Integer coordenadaX2 = 5;
		Integer coordenadaY2 = 5;
		Punto p2 = new Punto(coordenadaX2, coordenadaY2);
		Cuadrado c1 = new Cuadrado();
		c1.cargarEsqInferior(p1);
		c1.cargarEsqSuperior(p2);
		Double resultadoEsperado = 16.0;
		Double resultadoObtenido = c1.area();
		assertEquals(resultadoEsperado, resultadoObtenido);
		
	}
	
	@Test
	void sePuedeCalcularElAreaDeUnRectangulo() {
		Integer coordenadaX = 2;
		Integer coordenadaY = 1;
		Punto p1 = new Punto(coordenadaX, coordenadaY);
		Integer coordenadaX2 = 4;
		Integer coordenadaY2 = 6;
		Punto p2 = new Punto(coordenadaX2, coordenadaY2);
		Rectangulo r1 = new Rectangulo(p1, p2);
		Double resultadoObtenido = r1.area();
		Double resultadoEsperado = 10.0;
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	
	@Test
	void sePuedeCalcularElAreaDeUnCirculo() {
		Integer coordenadaX = 4;
		Integer coordenadaY = 4;
		Punto p1 = new Punto(coordenadaX, coordenadaY);
		Circulo c1 = new Circulo(p1);
		Integer coordenadaX2 = 4;
		Integer coordenadaY2 = 6;
		Punto p2 = new Punto(coordenadaX2, coordenadaY2);
		Integer coordenadaX3 = 6;
		Integer coordenadaY3 = 4;
		Punto p3 = new Punto(coordenadaX3, coordenadaY3);
		c1.agregarBordeSuperior(p2);
		c1.agregarBordeDerecho(p3);
		Double resultadoObtenido = c1.area();
		Double resultadoEsperado = 12.56;
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	
	@Test 
	void podemosCrearUnListaYAgregarleLos4ObjetosCreados() {
		Integer coordenadaX = 4;
		Integer coordenadaY = 4;
		Punto p1 = new Punto(coordenadaX, coordenadaY);
		Circulo c1 = new Circulo(p1);
		Integer coordenadaX2 = 4;
		Integer coordenadaY2 = 6;
		Punto p2 = new Punto(coordenadaX2, coordenadaY2);
		Integer coordenadaX3 = 6;
		Integer coordenadaY3 = 4;
		Punto p3 = new Punto(coordenadaX3, coordenadaY3);
		c1.agregarBordeSuperior(p2);
		c1.agregarBordeDerecho(p3);
		Integer coordenadaX4 = 2;
		Integer coordenadaY4 = 1;
		Punto p4 = new Punto(coordenadaX4, coordenadaY4);
		Punto p5 = new Punto(coordenadaX2, coordenadaY2);
		Rectangulo r1 = new Rectangulo(p4, p5);
		Integer coordenadaX5 = 3;
		Integer coordenadaY5 = 3;
		Punto p6 = new Punto(coordenadaX5, coordenadaY5);
		Elipse e1 = new Elipse(p6);
		Integer coordenadaX7 = 3;
		Integer coordenadaY7 = 6;
		Punto p7 = new Punto(coordenadaX7, coordenadaY7);
		Integer coordenadaX8 = 5;
		Integer coordenadaY8 = 3;
		Punto p8 = new Punto(coordenadaX8, coordenadaY8);
		e1.agregarRadioMayor(p7);
		e1.agregarRadioMenor(p8);
		Integer coordenadaX9 = 1;
		Integer coordenadaY9 = 1;
		Punto p9 = new Punto(coordenadaX9, coordenadaY9);
		Integer coordenadaX10 = 5;
		Integer coordenadaY10 = 5;
		Punto p10 = new Punto(coordenadaX10, coordenadaY10);
		Cuadrado cua1 = new Cuadrado();
		cua1.cargarEsqInferior(p9);
		cua1.cargarEsqSuperior(p10);
		c1.agregarFigura(c1);
		c1.agregarFigura(e1);
		c1.agregarFigura(r1);
		c1.agregarFigura(cua1);
		Integer	resultadoEsperado = 4;
		Integer resultadoObtenido = c1.cantidadDeFiguras();
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	@Test
	void podemosSaberElAreaTotalDeLasFiguras() {
		Integer coordenadaX = 4;
		Integer coordenadaY = 4;
		Punto p1 = new Punto(coordenadaX, coordenadaY);
		Circulo c1 = new Circulo(p1);
		Integer coordenadaX2 = 4;
		Integer coordenadaY2 = 6;
		Punto p2 = new Punto(coordenadaX2, coordenadaY2);
		Integer coordenadaX3 = 6;
		Integer coordenadaY3 = 4;
		Punto p3 = new Punto(coordenadaX3, coordenadaY3);
		c1.agregarBordeSuperior(p2);
		c1.agregarBordeDerecho(p3);
		Integer coordenadaX4 = 2;
		Integer coordenadaY4 = 1;
		Punto p4 = new Punto(coordenadaX4, coordenadaY4);
		Punto p5 = new Punto(coordenadaX2, coordenadaY2);
		Rectangulo r1 = new Rectangulo(p4, p5);
		Integer coordenadaX5 = 3;
		Integer coordenadaY5 = 3;
		Punto p6 = new Punto(coordenadaX5, coordenadaY5);
		Elipse e1 = new Elipse(p6);
		Integer coordenadaX7 = 3;
		Integer coordenadaY7 = 6;
		Punto p7 = new Punto(coordenadaX7, coordenadaY7);
		Integer coordenadaX8 = 5;
		Integer coordenadaY8 = 3;
		Punto p8 = new Punto(coordenadaX8, coordenadaY8);
		e1.agregarRadioMayor(p7);
		e1.agregarRadioMenor(p8);
		Integer coordenadaX9 = 1;
		Integer coordenadaY9 = 1;
		Punto p9 = new Punto(coordenadaX9, coordenadaY9);
		Integer coordenadaX10 = 5;
		Integer coordenadaY10 = 5;
		Punto p10 = new Punto(coordenadaX10, coordenadaY10);
		Cuadrado cua1 = new Cuadrado();
		cua1.cargarEsqInferior(p9);
		cua1.cargarEsqSuperior(p10);
		c1.agregarFigura(c1);
		c1.agregarFigura(e1);
		c1.agregarFigura(r1);
		c1.agregarFigura(cua1);
		Double	resultadoEsperado = 57.4;
		Double resultadoObtenido = c1.areaTotalDeLaLista();
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	@Test
	void elCuadradoTieneAreaMasGrandeQueElCirculo() {
		Integer coordenadaX = 1;
		Integer coordenadaY = 1;
		Punto p1 = new Punto(coordenadaX, coordenadaY);
		Integer coordenadaX2 = 5;
		Integer coordenadaY2 = 5;
		Punto p2 = new Punto(coordenadaX2, coordenadaY2);
		Cuadrado c1 = new Cuadrado();
		c1.cargarEsqInferior(p1);
		c1.cargarEsqSuperior(p2);
		Integer coordenadaX3 = 4;
		Integer coordenadaY3 = 4;
		Punto p3 = new Punto(coordenadaX3, coordenadaY3);
		Circulo ci1 = new Circulo(p3);
		Integer coordenadaX4 = 4;
		Integer coordenadaY4 = 6;
		Punto p4 = new Punto(coordenadaX4, coordenadaY4);
		Integer coordenadaX5 = 6;
		Integer coordenadaY5 = 4;
		Punto p5 = new Punto(coordenadaX5, coordenadaY5);
		ci1.agregarBordeSuperior(p4);
		ci1.agregarBordeDerecho(p5);
		Integer resultadoEsperado = 1;
		Integer resultadoObtenido = c1.compareTo(ci1);
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	@Test
	void puedoMoverUnElipse() {
		Integer coordenadaX = 3;
		Integer coordenadaY = 3;
		Punto p1 = new Punto(coordenadaX, coordenadaY);
		Elipse e1 = new Elipse(p1);
		Integer coordenadaX2 = 3;
		Integer coordenadaY2 = 6;
		Punto p2 = new Punto(coordenadaX2, coordenadaY2);
		Integer coordenadaX3 = 5;
		Integer coordenadaY3 = 3;
		Punto p3 = new Punto(coordenadaX3, coordenadaY3);
		e1.agregarRadioMayor(p2);
		e1.agregarRadioMenor(p3);
		Integer coordenadaX6 = 5;
		Integer coordenadaY6 = 5;
		Punto p6 = new Punto(coordenadaX6,coordenadaY6);
		e1.mover(p6);
		Integer resultadoEsperadoX = e1.centro.getCoordenadaX();
		Integer resultadoEsperadoY = e1.centro.getCoordenadaY();
		Integer resultadoObtenidoX = 5;
		Integer resultadoObtenidoY = 5;
		assertEquals(resultadoEsperadoX, resultadoObtenidoX);
		assertEquals(resultadoEsperadoY, resultadoObtenidoY);
		
	}
	
	@Test
	void puedoMoverUnCuadrado() {
		Integer coordenadaX = 1;
		Integer coordenadaY = 1;
		Punto p1 = new Punto(coordenadaX, coordenadaY);
		Integer coordenadaX2 = 5;
		Integer coordenadaY2 = 5;
		Punto p2 = new Punto(coordenadaX2, coordenadaY2);
		Cuadrado c1 = new Cuadrado();
		c1.cargarEsqInferior(p1);
		c1.cargarEsqSuperior(p2);
		Integer coordenadaX6 = 5;
		Integer coordenadaY6 = 5;
		Punto p6 = new Punto(coordenadaX6,coordenadaY6);
		c1.mover(p6);
		Integer resultadoEsperadoX = c1.esquinaSuperiorDerecha.getCoordenadaX();
		Integer resultadoEsperadoY = c1.esquinaSuperiorDerecha.getCoordenadaY();
		Integer resultadoObtenidoX = 9;
		Integer resultadoObtenidoY = 9;
		assertEquals(resultadoEsperadoX, resultadoObtenidoX);
		assertEquals(resultadoEsperadoY, resultadoObtenidoY);
	}
	
	@Test
	void puedoMoverUnRectangulo() {
		Integer coordenadaX = 2;
		Integer coordenadaY = 1;
		Punto p1 = new Punto(coordenadaX, coordenadaY);
		Integer coordenadaX2 = 4;
		Integer coordenadaY2 = 6;
		Punto p2 = new Punto(coordenadaX2, coordenadaY2);
		Rectangulo r1 = new Rectangulo(p1, p2);
		Integer coordenadaX6 = 3;
		Integer coordenadaY6 = 2;
		Punto p6 = new Punto(coordenadaX6,coordenadaY6);
		r1.mover(p6);
		Integer resultadoEsperadoX = r1.esquinaSuperiorDerecha.getCoordenadaX();
		Integer resultadoEsperadoY = r1.esquinaSuperiorDerecha.getCoordenadaY();
		Integer resultadoObtenidoX = 5;
		Integer resultadoObtenidoY = 7;
		assertEquals(resultadoEsperadoX, resultadoObtenidoX);
		assertEquals(resultadoEsperadoY, resultadoObtenidoY);
	}
	
	@Test
	void puedoCrear10FigurasYMostrarElAreaTotalDeEllas() {
		Integer coordenadaX = 2;
		Integer coordenadaY = 1;
		Punto p1 = new Punto(coordenadaX, coordenadaY);
		Integer coordenadaX2 = 4;
		Integer coordenadaY2 = 6;
		Punto p2 = new Punto(coordenadaX2, coordenadaY2);
		Rectangulo r1 = new Rectangulo(p1, p2);
		Integer coordenadaX3 = 1;
		Integer coordenadaY3 = 2;
		Punto p3 = new Punto(coordenadaX3, coordenadaY3);
		Integer coordenadaX4 = 4;
		Integer coordenadaY4 = 5;
		Punto p4 = new Punto(coordenadaX4, coordenadaY4);
		Rectangulo r2 = new Rectangulo(p3, p4);
		Integer coordenadaX5 = 3;
		Integer coordenadaY5 = 5;
		Punto p5 = new Punto(coordenadaX5, coordenadaY5);
		Integer coordenadaX6 = 4;
		Integer coordenadaY6 = 8;
		Punto p6 = new Punto(coordenadaX6, coordenadaY6);
		Rectangulo r3 = new Rectangulo(p5, p6);
		Integer coordenadaX7 = 5;
		Integer coordenadaY7 = 9;
		Punto p7 = new Punto(coordenadaX7, coordenadaY7);
		Integer coordenadaX8 = 6;
		Integer coordenadaY8 = 8;
		Punto p8 = new Punto(coordenadaX8, coordenadaY8);
		Rectangulo r4 = new Rectangulo(p7, p8);
		Integer coordenadaX9 = 2;
		Integer coordenadaY9 = 3;
		Punto p9 = new Punto(coordenadaX9, coordenadaY9);
		Integer coordenadaX10 = 5;
		Integer coordenadaY10 = 6;
		Punto p10 = new Punto(coordenadaX10, coordenadaY10);
		Rectangulo r5 = new Rectangulo(p9, p10);
		Integer coordenadaX11 = 2;
		Integer coordenadaY11 = 2;
		Punto p11 = new Punto(coordenadaX11, coordenadaY11);
		Integer coordenadaX12 = 7;
		Integer coordenadaY12 = 6;
		Punto p12 = new Punto(coordenadaX12, coordenadaY12);
		Rectangulo r6 = new Rectangulo(p11, p12);
		Integer coordenadaX13 = 2;
		Integer coordenadaY13 = 1;
		Punto p13 = new Punto(coordenadaX13, coordenadaY13);
		Integer coordenadaX14 = 4;
		Integer coordenadaY14 = 6;
		Punto p14 = new Punto(coordenadaX14, coordenadaY14);
		Rectangulo r7 = new Rectangulo(p13, p14);
		Integer coordenadaX15 = 2;
		Integer coordenadaY15 = 1;
		Punto p15 = new Punto(coordenadaX15, coordenadaY15);
		Integer coordenadaX16 = 4;
		Integer coordenadaY16 = 6;
		Punto p16 = new Punto(coordenadaX16, coordenadaY16);
		Rectangulo r8 = new Rectangulo(p1, p4);
		Rectangulo r9 = new Rectangulo(p2, p6);
		Rectangulo r10 = new Rectangulo(p3, p5);
		r1.agregarFigura(r10);
		r1.agregarFigura(r9);
		r1.agregarFigura(r8);
		r1.agregarFigura(r7);
		r1.agregarFigura(r6);
		r1.agregarFigura(r5);
		r1.agregarFigura(r4);
		r1.agregarFigura(r3);
		r1.agregarFigura(r2);
		r1.agregarFigura(r1);
		Double resultadoObtenido = r1.areaTotalDeLaLista();
		Double resultadoEsperado = 74.0;
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
}

