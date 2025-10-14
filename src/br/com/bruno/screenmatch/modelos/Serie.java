package br.com.bruno.screenmatch.modelos;

public class Serie extends Titulo {
    private int temporadas = 0;
    private int epsodiosPorTemporada = 0;
    private boolean ativa;
    private int minutosPorEpisodio = 0;

    public Serie(String nome, String anoLancamento) {
        super(nome, anoLancamento);
    }

    @Override
    public void exibeFichaTecnica() {
        System.out.println("Nome da série: " + this.getNome() +
                "\nano de lançamento: " + this.getAnoLancamento() +
                "\nEpsódios por temporada: " + this.epsodiosPorTemporada +
                "\nMinutos por epsódio: " + this.minutosPorEpisodio + " min" +
                "\nTemporadas: " + this.temporadas +
                "\nTempo total: " + getDuracaoEmMinutos() + " min");
    }

    @Override
    public int getDuracaoEmMinutos() {
        return this.temporadas * this.epsodiosPorTemporada * this.minutosPorEpisodio;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpsodiosPorTemporada() {
        return epsodiosPorTemporada;
    }

    public void setEpsodiosPorTemporada(int epsodiosPorTemporada) {
        this.epsodiosPorTemporada = epsodiosPorTemporada;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    @Override
    public String toString() {
        return "Serie " + this.getNome() + " (" + this.getAnoLancamento() + ")";
    }
}
