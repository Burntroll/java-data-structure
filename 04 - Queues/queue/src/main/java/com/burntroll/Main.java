package com.burntroll;

public class Main {
    public static void main(String[] args) {
        Fila minhaFila = new Fila();

        minhaFila.enqueue(new No("First"));
        minhaFila.enqueue(new No("Second"));
        minhaFila.enqueue(new No("Third"));
        minhaFila.enqueue(new No("Fourth"));

        System.out.println(minhaFila);
        System.out.print(minhaFila.dequeue());
        System.out.println(minhaFila);
        minhaFila.enqueue(new No("Last"));

        System.out.println(minhaFila);
        System.out.println(minhaFila.first());
        System.out.println(minhaFila);

    }
}