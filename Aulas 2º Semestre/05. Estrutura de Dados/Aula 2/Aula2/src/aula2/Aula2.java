/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2;

/**
 *
 * @author Alunos
 */
public class Aula2 {

    public class Main {
        Runtime rt = Runtime.getRuntime();
        System.out.println("Memoria total da JVM: " + rt.totalMemory());
        double m1,m2;
        m1= rt.freeMemory();
        System.out.println("Memoria antes da criação dos objetos: " + rt.freeMemory());
        double vetor[]= new double[100000];
        for (int i = 0; i < 100000; i++) {
            vetor[i]=i;
        }
        m2= rt.freeMemory();
        System.out.println("Memoria depois da criação dos objetos: " + rt.freeMemory());
    }
}

