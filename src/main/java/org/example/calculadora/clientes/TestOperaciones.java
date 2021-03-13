package org.example.calculadora.clientes;

import org.example.calculadora.funciones.OperacionesAritmeticas;

public class TestOperaciones {
    public static void main(String[] args) {
        OperacionesAritmeticas op1 = new OperacionesAritmeticas(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
        System.out.println(op1.suma(op1.getUno(), op1.getDos()));

        OperacionesAritmeticas op2 = new OperacionesAritmeticas(Integer.parseInt(args[2]), Integer.parseInt(args[3]));
        System.out.println(op1.resta(op2.getUno(), op2.getDos()));
    }
}
