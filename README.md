# Parcial 1 — Figuras Geométricas con OOP y TDD

**Materia:** Programación Orientada a Objetos — UNAHUR  
**Lenguaje:** Java  
**Metodología:** Test-Driven Development (TDD) con JUnit 5  

---

## Descripción

Sistema de modelado de figuras geométricas desarrollado bajo la metodología TDD: las clases fueron diseñadas a partir de los tests, no al revés.

El sistema permite crear figuras (Círculo, Elipse, Rectángulo, Cuadrado), calcular sus áreas, moverlas en un plano cartesiano, compararlas entre sí y agruparlas en una lista con operaciones colectivas.

---

## Estructura del proyecto

```
src/
└── packageParcial/
    ├── Figuras.java           # Clase abstracta base (implementa Comparable)
    ├── Punto.java             # Representación de coordenadas (x, y)
    ├── Circulo.java           # Extiende Figuras — área por radio
    ├── Elipse.java            # Extiende Figuras — área por radio mayor y menor
    ├── Rectangulo.java        # Extiende Figuras — área por esquinas
    └── Cuadrado.java          # Extiende Figuras — área por lado

test/
└── packageParcial/
    └── testParcial.java       # Suite de tests JUnit 5
```

---

## Jerarquía de clases

```
Figuras (abstract, Comparable<Figuras>)
├── Circulo
├── Elipse
├── Rectangulo
└── Cuadrado
```

`Figuras` centraliza la lógica compartida:
- Lista interna de figuras (`LinkedList<Figuras>`)
- `agregarFigura()` — sin duplicados
- `cantidadDeFiguras()` — tamaño de la lista
- `areaTotalDeLaLista()` — suma de áreas
- `ordenarPorArea()` — usando `Collections.sort()` y `compareTo()`
- `compareTo()` — compara áreas para establecer orden

Cada subclase implementa obligatoriamente:
- `area()` — cálculo específico según la figura
- `mover(Punto)` — desplazamiento en el plano

---

## Tests incluidos

| Test | Qué valida |
|------|-----------|
| `seCalcularElAreaDeUnElipse` | Área de elipse con radio mayor=3 y menor=2 → 18.84 |
| `elAreaDeUnCuadrado` | Área de cuadrado con esquinas (1,1) y (5,5) → 16.0 |
| `sePuedeCalcularElAreaDeUnRectangulo` | Área de rectángulo con puntos (2,1) y (4,6) → 10.0 |
| `sePuedeCalcularElAreaDeUnCirculo` | Área de círculo con radio=2 → 12.56 |
| `podemosCrearUnListaYAgregarleLos4ObjetosCreados` | Lista con 4 figuras distintas sin duplicados |
| `podemosSaberElAreaTotalDeLasFiguras` | Suma de áreas de 4 figuras → 57.4 |
| `elCuadradoTieneAreaMasGrandeQueElCirculo` | `compareTo()` devuelve 1 cuando cuadrado > círculo |
| `puedoMoverUnElipse` | Centro de elipse se actualiza al mover |
| `puedoMoverUnCuadrado` | Esquina superior se recalcula al mover |
| `puedoMoverUnRectangulo` | Esquina superior se recalcula al mover |
| `puedoCrear10FigurasYMostrarElAreaTotalDeEllas` | Suma de áreas de 10 rectángulos → 74.0 |

---

## Cómo ejecutar

**Requisitos:** Java 8+, JUnit 5, Eclipse IDE (o cualquier IDE compatible con Maven/Gradle)

1. Clonar el repositorio
2. Importar como proyecto Java existente en Eclipse
3. Asegurarse de tener JUnit 5 en el classpath
4. Ejecutar `testParcial.java` como JUnit Test

---

## Conceptos aplicados

- **Herencia** — jerarquía `Figuras` → subclases concretas
- **Polimorfismo** — `area()` y `mover()` con comportamiento específico por clase
- **Abstracción** — clase abstracta `Figuras` con métodos abstractos
- **Interfaces funcionales** — `Comparable<Figuras>` para ordenamiento
- **Colecciones** — `LinkedList` y `Collections.sort()`
- **TDD** — clases diseñadas a partir de los tests, no al revés
- **Plano cartesiano** — uso de `Punto(x, y)` para posicionamiento y cálculo de distancias
