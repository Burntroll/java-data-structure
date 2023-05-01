package com.burntroll;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Carro> listCarros = new ArrayList<>();

        listCarros.add(new Carro("Lada"));
        listCarros.add(new Carro("Fiat"));
        listCarros.add(new Carro("Hyundai"));
        listCarros.add(new Carro("Nissan"));

        System.out.println(listCarros.contains(new Carro("Lada")));
        System.out.println(listCarros.get(2));
        System.out.println(listCarros.indexOf(new Carro("Hyundai")));

        System.out.println(listCarros.remove(2));
        System.out.println(listCarros);

    }
}