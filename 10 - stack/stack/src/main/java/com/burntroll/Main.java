package com.burntroll;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Stack<Carro> stackCarros = new Stack<>();

        stackCarros.push(new Carro("Toyota"));
        stackCarros.push(new Carro("Hyundai"));
        stackCarros.push(new Carro("Lada"));
        stackCarros.push(new Carro("Nissan"));

        System.out.println(stackCarros);
        System.out.println(stackCarros.pop());
        System.out.println(stackCarros);

        System.out.println(stackCarros.peek());
        System.out.println(stackCarros);


        System.out.println(stackCarros.empty());
    }
}