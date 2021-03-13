package org.example.figuras;

public class Circulo extends FiguraGeometrica{
    private double radio;

    public Circulo(double radio){
        super("Circulo");
        this.radio = radio;
    }

    @Override
    public double area() {
        return Math.PI*Math.pow(radio,2);
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return super.toString() + " Circulo{" +
                "radio=" + radio +
                '}';
    }
}
