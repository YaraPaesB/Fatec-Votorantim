/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.awt.*;
import java.util.ArrayList;
/**
 *
 * @author Alunos
 */
public class Controle {
    private List listaProfessores;
    
    public Controle() {
        listaProfessores = new ArrayList<Professor>();
    }
    
    public void addProfessor(String nome, EnumGenero genero, int idade) {
        listaProfessores.add(new Professor(nome, genero, idade));
    }
}
