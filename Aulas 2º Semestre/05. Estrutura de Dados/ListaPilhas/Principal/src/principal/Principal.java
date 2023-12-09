/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import Classes.*;

/**
 *
 * @author Alunos
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Exercicio 01
        PilhaInteger p = new PilhaInteger();
        p.empilhar(1);
        p.empilhar(2);
        p.empilhar(3);
        while (!p.pilhaVazia()) {
            System.out.print(p.desempilhar() + "\n");
        }

        // Exercicio 02
        String nome = "socos";
        if (PilhaString.ePalindromo(nome)) {
            System.out.println(nome + " é um palíndromo.");
        } else {
            System.out.println(nome + " não é um palíndromo.");
        }

        // Exercicio 03
        String sequencia1 = "{ [ ( ) ( ) ] }";
        String sequencia2 = "{ [ ( ) ) ] }";

        System.out.println("Sequência 1 é balanceada? " + ExercicioPilha.validaBalanceamento(sequencia1));
        System.out.println("Sequência 2 é balanceada? " + ExercicioPilha.validaBalanceamento(sequencia2));

        // Exercicio 04

        CustomStack stack = new CustomStack();
        stack.push(5);
        stack.push(20);
        stack.push(1);
        stack.push(0);
        stack.push(4);
        stack.push(15);

        System.out.println("Pilha original: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }

        stack.push(5);
        stack.push(20);
        stack.push(1);
        stack.push(0);
        stack.push(4);
        stack.push(15);

        stack.sort();

        System.out.println("\nPilha ordenada: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }

    }
}
    

