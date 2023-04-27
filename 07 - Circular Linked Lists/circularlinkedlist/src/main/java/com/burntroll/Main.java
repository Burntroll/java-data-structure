package com.burntroll;

public class Main {
    public static void main(String[] args) {

        ListaCircular<String> minhaLista = new ListaCircular<>();
        minhaLista.add("c0");
        System.out.println((minhaLista));

        minhaLista.remove(0);
        System.out.println(minhaLista);
        System.out.println(minhaLista.isEmpty());


        minhaLista.add("c1");
        minhaLista.add("c2");
        minhaLista.add("c3");
        minhaLista.add("c4");
        System.out.println(minhaLista);

        System.out.println(minhaLista.get(1));
        System.out.println(minhaLista.size());
        System.out.println(minhaLista.isEmpty());
        System.out.println(minhaLista);

        for(int i = 0; i < 20; i++){
            System.out.println(minhaLista.get(i));
        }

    }
}