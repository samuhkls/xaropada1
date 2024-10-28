package exercicios.exercicio1;

import exercicios.exercicio1.Funcionario;

import java.util.ArrayList;
import java.util.List;

public class Aluno implements Boletim {
    private String nome;
    private double p1;
    private double p2;
    private double media;
    private List<Funcionario> observadores = new ArrayList<>();

    public Aluno(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public double getP1() {
        return p1;
    }

    public void setP1(double p1) {
        this.p1 = p1;
        calcularMedia();
        notiObservadores();
    }

    public double getP2() {
        return p2;
    }

    public void setP2(double p2) {
        this.p2 = p2;
        calcularMedia();
        notiObservadores();
    }

    public double getMedia() {
        return media;
    }

    private void calcularMedia() {
        this.media = (p1 + p2) / 2;
    }

    public void addObservador(Funcionario funcionario) {
        observadores.add(funcionario);
    }

    private void notiObservadores() {
        for (Funcionario observador : observadores) {
            observador.atualizar(this);
        }
    }
}
