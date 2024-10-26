/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios.exercicio1;

/**
 *
 * @author samuel.hssantos4
 */
public class Aluno implements Boletim{
    private String nome;
    private double p1;
    private double p2;
    private double media;

    public Aluno(String nome) {
        this.nome = nome;
    }
    
    

    @Override
    public double calcularMedia(String nome, double p1, double p2) {
        double mediacalc;
        mediacalc = (p1 + p2) / 2;
        return mediacalc;
        }

    
    
}
