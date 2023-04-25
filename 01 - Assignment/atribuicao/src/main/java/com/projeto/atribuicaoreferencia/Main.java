package com.projeto.atribuicaoreferencia;

public class Main {
    public static void main(String[] args) {

        int intA = 1;
        int intB = intA;

        System.out.println("intA = " + intA + "\nintB = " + intB);
        intA = 2;
        System.out.println("intA = " + intA + "\nintB = " + intB);

        MyObject objectA = new MyObject(10);
        MyObject objectB = objectA;

        System.out.println("objectA = " + objectA + "\nobjectB = " + objectB);

        objectA.setNumero(20);
        System.out.println("objectA = " + objectA + "\nobjectB = " + objectB);
    }
}
