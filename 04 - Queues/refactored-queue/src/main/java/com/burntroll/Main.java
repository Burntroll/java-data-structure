package com.burntroll;

public class Main {
    public static void main(String[] args) {
        Fila<String> minhaFila = new Fila<>();

        minhaFila.enqueue("First");
        minhaFila.enqueue("Second");
        minhaFila.enqueue("Third");
        minhaFila.enqueue("Fourth");

        System.out.println(minhaFila);
        System.out.print(minhaFila.dequeue());
        System.out.println(minhaFila);
        minhaFila.enqueue("Last");

        System.out.println(minhaFila);
        System.out.println(minhaFila.first());
        System.out.println(minhaFila);

    }
}