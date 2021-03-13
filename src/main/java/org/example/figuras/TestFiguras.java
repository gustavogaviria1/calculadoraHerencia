package org.example.figuras;

public class TestFiguras {
    public static void main(String[] args) {
        FiguraGeometrica circulo = new Circulo(7);
        FiguraGeometrica rectangulo = new Rectangulo(4, 6);
        FiguraGeometrica triangulo = new Triangulo(5,7);

        System.out.println("El área del cículo es:  " + circulo.area() + " " + circulo);
        System.out.println("El área del Triángulo es: " + triangulo.area() + " " + triangulo);
        System.out.println("El área del Rectángulo es: " + rectangulo.area() + " " + rectangulo);

    }
}
