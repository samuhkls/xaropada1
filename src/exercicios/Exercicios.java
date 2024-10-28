/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicios;

import exercicios.exercicio1.Aluno;
import exercicios.exercicio1.Professor;

/**
 *
 * @author samuel.hssantos4
 */
public class Exercicios {

    public static void main(String[] args) {
        Aluno aluno = new Aluno("João");
        Professor professor = new Professor("Silva");

        aluno.addObservador(professor);

        aluno.setP1(8.0);
        aluno.setP2(7.0);
    }
    
}
