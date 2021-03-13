package org.example.calculadora.funciones;

import org.example.calculadora.interfaces.OperacionesMatematicas;

public class OperacionesAritmeticas implements OperacionesMatematicas {
    private int uno;
    private int dos;

    public OperacionesAritmeticas(int uno) {
        this.uno = uno;
    }

    public OperacionesAritmeticas(int uno, int dos) {
        this.uno = uno;
        this.dos = dos;
    }

    public int getUno() {
        return uno;
    }

    public void setUno(int uno) {
        this.uno = uno;
    }

    public int getDos() {
        return dos;
    }

    public void setDos(int dos) {
        this.dos = dos;
    }

    @Override
    public int suma(int a, int b) {

        return a+b;
    }

    @Override
    public int resta(int a, int b) {
        return a-b;
    }

    @Override
    public int multi(int a, int b) {
        return a*b;
    }

    @Override
    public int division(int a, int b) {
        return a/b;
    }
}
