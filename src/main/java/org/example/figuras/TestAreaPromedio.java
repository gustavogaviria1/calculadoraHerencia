package org.example.figuras;

public class TestAreaPromedio {
    public static void main(String[] args) {
        FiguraGeometrica[] arreglo = {
                new Circulo(9),
                new Rectangulo(3, 7),
                new Triangulo(4, 7)
        };

        double promedio = FiguraGeometrica.areaPromedio(arreglo);

        for (int i = 0; i < arreglo.length; i++){
            System.out.println(arreglo[i] + " " + arreglo[i].area());
        }

        System.out.println("Promedio de las áreas es " + promedio);

    }
}
