package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;


public class App {

    private static Scanner sc = new Scanner(System.in);
    private static Set<Aluno> listaAlunos = new HashSet<Aluno>();
    //aceita apenas valores únicos e é mais rapido porem não ordena 

    public static void main(String[] args) {

        int i = 0;
        String option;

        do {

            System.out.println("\n----- Menu -----");
            System.out.println("[1] - Inserir Aluno");
            System.out.println("[2] - Imprimir Lista\n");
            System.out.println("[0] - Sair\n");
            option = sc.nextLine();

            switch (option) {
                case "1":
                    inserirAluno();
                    break;
                case "2":
                    exibirLista();
                    break;
                case "0":
                    exibirLista();
                    break;
            }
        } while (!option.equals("0"));
    }

    private static void inserirAluno() {
        System.out.println("Insira o nome: ");
        String nome = sc.nextLine();
        listaAlunos.add(new Aluno(nome));
    }

    private static void exibirLista() {
        System.out.println("----- Lista de nomes -----");
        Iterator<Aluno> i = listaAlunos.iterator();
        while (i.hasNext()){
            System.out.println(i.next()); 
        }
    }
}
