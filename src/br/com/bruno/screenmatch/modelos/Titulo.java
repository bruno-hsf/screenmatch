package br.com.bruno.screenmatch.modelos;

public class Titulo {
    private String nome;
    private String anoLancamento;
    private int duracaoEmMinutos;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDasAvaliacoes;

    public void exibeFichaTecnica() {
        System.out.println("Nome do título é: " + this.nome +
                "\nO ano do título é: " + this.anoLancamento +
                "\nO título tem duração de: " + this.duracaoEmMinutos + " min");
    }

    public void avalia(double nota) {
        this.somaDasAvaliacoes += nota;
        this.totalDasAvaliacoes++;
    }

    public int getDuracaoEmMinutos() {
        return this.duracaoEmMinutos;
    }

    public String getAnoLancamento() {
        return this.anoLancamento;
    }

    public double pegaMedia() {
        return this.somaDasAvaliacoes / this.totalDasAvaliacoes;
    }

    public int getTotalDasAvaliacoes() {
        return this.totalDasAvaliacoes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoLancamento(String anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public String getNome() {
        return this.nome;
    }
}
