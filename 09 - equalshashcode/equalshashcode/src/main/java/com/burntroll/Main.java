package com.burntroll;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Carro> listaCarros = new ArrayList<>();

        listaCarros.add(new Carro("Hyundai"));
        listaCarros.add(new Carro("Lada"));
        listaCarros.add(new Carro("Evolute"));

        System.out.println(listaCarros.contains(new Carro("Lada")));
        System.out.println(new Carro("Lada").hashCode());
        System.out.println(new Carro("Evolute").hashCode());

        System.out.println("----------------------------------");

        Carro carro1 = new Carro("Hyundai");
        Carro carro2 = new Carro("Evolute");
        Carro carro3 = new Carro("Hyundai");

        System.out.println(carro1.equals(carro2));
        System.out.println(carro1.equals(carro3));

    }

}