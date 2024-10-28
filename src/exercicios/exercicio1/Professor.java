/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios.exercicio1;

/**
 *
 * @author samuel.hssantos4
 */
public class Professor implements Funcionario {
    private String nome;

    public Professor(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(Aluno aluno) {
        System.out.println("Professor " + nome + " foi notificado. Média de " + aluno.getNome() + " é: " + aluno.getMedia());
    }
}