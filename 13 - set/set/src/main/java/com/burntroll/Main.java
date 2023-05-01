package com.burntroll;

import java.util.*;

public class Main {
    public static void main(String[] args) {

       Set<Carro> hashSetCarros = new HashSet<>();

       hashSetCarros.add(new Carro("Lada"));
       hashSetCarros.add(new Carro("Chevrolet"));
       hashSetCarros.add(new Carro("Fiat"));
       hashSetCarros.add(new Carro("Hyundai"));
       hashSetCarros.add(new Carro("KIA"));
       hashSetCarros.add(new Carro("Austin"));

       System.out.println(hashSetCarros);

       Set<Carro> treeSetCarros = new TreeSet<>();

        treeSetCarros.add(new Carro("Lada"));
        treeSetCarros.add(new Carro("Chevrolet"));
        treeSetCarros.add(new Carro("Fiat"));
        treeSetCarros.add(new Carro("Hyundai"));
        treeSetCarros.add(new Carro("KIA"));
        treeSetCarros.add(new Carro("Austin"));

        System.out.println(treeSetCarros);
    }
}