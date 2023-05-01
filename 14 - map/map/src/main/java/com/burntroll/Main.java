package com.burntroll;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<String, String> aluno = new HashMap<>();

        aluno.put("Nome", "Ricardo");
        aluno.put("Idade", "21");
        aluno.put("Media", "8.5");
        aluno.put("Turma", "3a");
        
        System.out.println(aluno);
        System.out.println(aluno.keySet());
        System.out.println(aluno.values());

        List<Map<String, String>> listAlunos = new ArrayList<>();

        listAlunos.add(aluno);

        Map<String, String> aluno2 = new HashMap<>();

        aluno2.put("Nome", "Maria");
        aluno2.put("Idade", "22");
        aluno2.put("Media", "9");
        aluno2.put("Turma", "3a");

        listAlunos.add(aluno2);

        System.out.println(listAlunos);

        System.out.println(aluno.containsKey("Nome"));
    }
}