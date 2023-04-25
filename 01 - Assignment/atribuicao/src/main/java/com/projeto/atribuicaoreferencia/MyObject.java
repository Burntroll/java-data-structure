package com.projeto.atribuicaoreferencia;

public class MyObject {

    Integer numero;

    public MyObject(Integer numero) {
        this.numero = numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return this.numero.toString();
    }
}
