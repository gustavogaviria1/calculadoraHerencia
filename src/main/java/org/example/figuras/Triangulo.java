package org.example.figuras;

public class Triangulo extends FiguraGeometrica{

    private double base;
    private double altura;

    public Triangulo(double base, double altura){
        super("Triangulo");
        this.base = base;
        this.altura = altura;
    }

    public Triangulo(String nombre, double base, double altura) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }

    public double area() {
        return (base*altura)/2;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Triangulo{" +
                "base=" + base +
                ", altura=" + altura +
                '}';
    }
}
