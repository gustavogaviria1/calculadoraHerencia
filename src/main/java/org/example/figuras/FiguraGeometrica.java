package org.example.figuras;

public abstract class FiguraGeometrica {
    private String nombre;

    public abstract double area();

    public FiguraGeometrica(String nombre){
        this.nombre = nombre;
    }
    public FiguraGeometrica(){
       this("No se definió Nombre");
    }

    public static double areaPromedio(FiguraGeometrica array []){
        double sumaArea = 0;
        for (int i=0; i < array.length; i++){
            sumaArea += array[i].area();
        }
        return sumaArea/ array.length;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "FiguraGeometrica{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
