package br.com.bruno.screenmatch.modelos;

import br.com.bruno.screenmatch.calculos.Classificavel;

public class Epsodio implements Classificavel {
    private int numero;
    private String nome;
    private Serie serie;

    //atributo criado para utilizar o metodo getClassificacao da interface
    //só para criar uma regra maluca pra gente entender que não tem nada a ver com a regra do filme
    private int totalVisualizacoes;

    public void setTotalVisualizacoes(int totalVisualizacoes) {
        this.totalVisualizacoes = totalVisualizacoes;
    }

    public int getTotalVisualizacoes() {
        return totalVisualizacoes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }


    //sendo usado na classe FiltroRecomendacao
    @Override
    public int getClassificacao() {
        if (totalVisualizacoes > 100) {
            return 4;
        } else {
            return 2;
        }
    }
}
